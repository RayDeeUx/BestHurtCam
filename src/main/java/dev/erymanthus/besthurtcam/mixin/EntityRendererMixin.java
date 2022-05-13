package dev.erymanthus.besthurtcam.mixin;

import dev.erymanthus.besthurtcam.config.BestHurtCamConfig;
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
        float shakeMultiplier = getShakeMultiplier();
        int rotationMode = getRotationMode();
        if (shake < 0 && rotationMode == 0) {
            shake = Math.abs(shake);
        } else if (rotationMode == 2) {
            int randomNum = ((int)(Math.random() * 2)) + 1; //random value between 1 or 2
            if (randomNum == 1) shake *= -1;
        }
        return shake * shakeMultiplier;
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
        } if (mc.thePlayer.isBurning()) {
            return (float)BestHurtCamConfig.adjustHurtCamIfBurning;
        } else {
            return (float)BestHurtCamConfig.adjustHurtCam;
        }
    }
    private float getShakeMultiplier() {
        float result = 1;
        if (BestHurtCamConfig.toggleMultipliers) {
            if (mc.thePlayer.isSneaking()) {
                result *= (float)BestHurtCamConfig.hurtCamSneakMultiplier;
            } if (mc.thePlayer.isSprinting()) {
                result *= (float)BestHurtCamConfig.hurtCamSprintingMultiplier;
            } if (mc.thePlayer.isPushedByWater()) {
                result *= (float)BestHurtCamConfig.hurtCamPushedWaterMultiplier;
            } if (mc.thePlayer.isBlocking()) {
                result *= (float)BestHurtCamConfig.hurtCamBlockingMultiplier;
            } if (mc.thePlayer.isEating()) {
                result *= (float)BestHurtCamConfig.hurtCamEatingMultiplier;
            } if (mc.thePlayer.isOnLadder()) {
                result *= (float)BestHurtCamConfig.hurtCamClimbingLadderMultiplier;
            } if (mc.thePlayer.isInvisible()) {
                result *= (float)BestHurtCamConfig.hurtCamInvisMultiplier;
            } if (mc.thePlayer.isWet()) {
                result *= (float)BestHurtCamConfig.hurtCamWetMultiplier;
            } if (mc.thePlayer.isRidingHorse()) {
                result *= (float)BestHurtCamConfig.hurtCamRidingHorseMultiplier;
            } if (mc.thePlayer.isRiding() && !mc.thePlayer.isRidingHorse()) {
                result *= (float)BestHurtCamConfig.hurtCamRidingMultiplier;
            }
        }
        return result;
    }

}
