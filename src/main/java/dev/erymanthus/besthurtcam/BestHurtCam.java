package dev.erymanthus.besthurtcam;

import cc.woverflow.onecore.utils.Updater;
import dev.erymanthus.besthurtcam.command.BestHurtCamCommand;
import dev.erymanthus.besthurtcam.config.BestHurtCamConfig;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(name = BestHurtCam.NAME, version = BestHurtCam.VER, modid = BestHurtCam.ID)
public class BestHurtCam {
    public static final String NAME = "@NAME@", VER = "@VER@", ID = "@ID@";
    public static File modDir = new File(new File(Minecraft.getMinecraft().mcDataDir, "Erymanthus"), NAME);
    public static BestHurtCamConfig config;

    @Mod.EventHandler
    protected void onFMLPreInitialization(FMLPreInitializationEvent event) {
        if (!modDir.exists()) modDir.mkdirs();
        Updater.INSTANCE.addToUpdater(event.getSourceFile(), NAME, ID, VER, "Erymanthus/" + ID);
    }

    @Mod.EventHandler
    protected void onInitialization(FMLInitializationEvent event) {
        new BestHurtCamCommand().register();
        config = new BestHurtCamConfig();
        config.preload();
    }
}
