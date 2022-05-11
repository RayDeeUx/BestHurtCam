package dev.erymanthus.besthurtcam.command;

import dev.erymanthus.besthurtcam.BestHurtCam;
import gg.essential.api.EssentialAPI;
import gg.essential.api.commands.Command;
import gg.essential.api.commands.DefaultHandler;

public class BestHurtCamCommand extends Command {
    public BestHurtCamCommand() {
        super("besthurtcam", true);
    }

    @DefaultHandler
    public void handle() {
        EssentialAPI.getGuiUtil().openScreen(BestHurtCam.config.gui());
    }
}
