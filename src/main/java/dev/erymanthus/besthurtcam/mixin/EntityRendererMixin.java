package dev.erymanthus.besthurtcam.mixin;

import dev.erymanthus.besthurtcam.config.BestHurtCamConfig;
import dev.erymanthus.besthurtcam.utils.HypixelUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.EntityRenderer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(EntityRenderer.class)
public class EntityRendererMixin {

    @Shadow
    private Minecraft mc = Minecraft.getMinecraft();

    @ModifyConstant
    (method = "hurtCameraEffect", constant = @Constant(floatValue = 14f))
    private float multiplyShake(float original) {
        float shake = getShake();
        int rotationMode = getRotationMode();
        if (shake < 0 && rotationMode == 0) {
            shake = Math.abs(shake);
        } else if (rotationMode == 2) {
            int randomNum = ((int)(Math.random() * 2)) + 1; //random value between 1 or 2
            if (randomNum == 1) shake *= -1;
        }
        if (HypixelUtils.inHypixel && !HypixelUtils.inSkyblock) {
            if (shake < 6) shake = 6;
            if (shake > -6) shake = -6;
            if (shake > 100) shake = 100;
            if (shake < -100) shake = -100;
        }
        return shake;
    }

    private int getRotationMode() {
        if (mc.thePlayer.isInLava()) {
            return (int)BestHurtCamConfig.lavaCamRotation;
        } if (mc.thePlayer.isInWater()) {
            return (int)BestHurtCamConfig.waterCamRotation;
        } if (mc.thePlayer.isBurning()) {
            return (int)BestHurtCamConfig.burnCamRotation;
        } else {
            return (int)BestHurtCamConfig.hurtCamRotation;
        }
    }
    private float getShake() {
        if (mc.thePlayer.isInLava()) {
            return (float)BestHurtCamConfig.adjustHurtCamInLava;
        } if (mc.thePlayer.isInWater()) {
            return (float)BestHurtCamConfig.adjustHurtCamInWater;
        } if (mc.thePlayer.isBurning()) {
            return (float)BestHurtCamConfig.adjustHurtCamIfBurning;
        } else {
            return (float)BestHurtCamConfig.adjustHurtCam;
        }
    }

}
