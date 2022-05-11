package dev.erymanthus.besthurtcam.config;

import gg.essential.universal.UDesktop;
import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

import dev.erymanthus.besthurtcam.BestHurtCam;

public class BestHurtCamConfig extends Vigilant {

    // Main

    @Property(
        type = PropertyType.BUTTON,
        name = "Camera Rotation Mode Info",
        description =   "Camera rotation modes are as follows:\n\n" +
                        "Default: Standard Minecraft camera rotation (to the right). [Negative values will be treated as positive values in this mode.]\n\n" +
                        "Left or Right: Allows rotations to either left or right (depending on your config values).\n\n" +
                        "Earthquake: Fully randomizes camera rotation directions.\n\n\n" +
                        "Pro tip: Use the LSHIFT key while clicking the arrows to change config values in increments of 5! Also the button, doesn't do anything.",
        category = "Config",
        placeholder = "."
    )
    public static void fillerFunctionOne() {
        return;
    }

    @Property(
            type = PropertyType.NUMBER, name = "Adjust Hurt Camera Effect",
            description = "Adjust Minecraft's hurt animation from all damage sources besides lava, fire, and water.\n\nThis will automatically be limited to 6 (or -6 depending on your config settings) on non-Skyblock Hypixel gamemodes.\n\nTo replicate the vanilla Minecraft experience, the default value is 14.",
            category = "Config", subcategory = "Damage Types",
            min = -360, max = 360
    )
    public static int adjustHurtCam = 14;

    @Property(
            type = PropertyType.SELECTOR, name = "Hurt Camera Rotation Mode",
            description = "Choose your desired camera rotation mode from all damage sources besides lava, fire, and water. Go back to the top for more info.",
            category = "Config", subcategory = "Damage Types",
            options = {"Default", "Left or Right", "Earthquake"}
    )
    public static int hurtCamRotation = 0;

    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Effect in Lava",
            description = "Adjust Minecraft's hurt animation while in lava.\n\nThis will automatically be limited to 6 (or -6 depending on your config settings) on non-Skyblock Hypixel gamemodes.\n\nTo replicate the vanilla Minecraft experience, the default value is 14.",
            category = "Config", subcategory = "Damage Types",
            min = -360, max = 360
    )
    public static int adjustHurtCamInLava = 14;

    @Property(
            type = PropertyType.SELECTOR, name = "Lava Camera Rotation Mode",
            description = "Choose your desired camera rotation mode while in lava. Go back to the top for more info.",
            category = "Config", subcategory = "Damage Types",
            options = {"Default", "Left or Right", "Earthquake"}
    )
    public static int lavaCamRotation = 0;

    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Effect in Water",
            description = "Adjust Minecraft's hurt animation while in water.\n\nThis will automatically be limited to 6 (or -6 depending on your config settings) on non-Skyblock Hypixel gamemodes.\n\nTo replicate the vanilla Minecraft experience, the default value is 14.",
            category = "Config", subcategory = "Damage Types",
            min = -360, max = 360
    )
    public static int adjustHurtCamInWater = 14;

    @Property(
            type = PropertyType.SELECTOR, name = "Water Camera Rotation Mode",
            description = "Choose your desired camera rotation mode while in water. Go back to the top for more info.",
            category = "Config", subcategory = "Damage Types",
            options = {"Default", "Left or Right", "Earthquake"}
    )
    public static int waterCamRotation = 0;

    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Effect While Burning",
            description = "Adjust Minecraft's hurt animation while burning.\n\nThis will automatically be limited to 6 (or -6 depending on your config settings) on non-Skyblock Hypixel gamemodes.\n\nTo replicate the vanilla Minecraft experience, the default value is 14.",
            category = "Config", subcategory = "Damage Types",
            min = -360, max = 360
    )
    public static int adjustHurtCamIfBurning = 14;

    @Property(
            type = PropertyType.SELECTOR, name = "Burn Camera Rotation Mode",
            description = "Choose your desired camera rotation mode while burning. Go back to the top for more info.",
            category = "Config", subcategory = "Damage Types",
            options = {"Default", "Left or Right", "Earthquake"}
    )
    public static int burnCamRotation = 0;

    @Property(
        type = PropertyType.BUTTON,
        name = "Credits, acknowledgements and legal mumbo jumbo",
        description =   "Credits:\n\n" +
                        "boomboompower - HurtAnimationRemover mod, the original \"anti-camera hurt rotation\" mod out there.\n\n" +
                        "Scherso - BetterHurtCam mod, 2021\'s take on changing the camera hurt rotation while complying with Hypixel's mods guidelines.\n\n" +
                        "Essential - for making Minecraft modding easier for all.\n\n\n" +
                        "BestHurtCam by Erymanthus / RayDeeUx is licensed under the GNU-GPL v3 license as per its section 5 terms.",
        category = "Extra Info",
        placeholder = "."
    )
    public static void fillerFunctionTwo() {
        return;
    }

    @Property(
        type = PropertyType.BUTTON,
        name = "HurtAnimationRemover by boomboompower",
        description = "Check out boomboompower's HurtAnimationRemover mod.",
        category = "Extra Info", subcategory = "Links (Credits)",
        placeholder = "Visit"
    )
    public static void openBBPHAR() throws URISyntaxException {
        UDesktop.browse(new URI("https://github.com/boomboompower/HurtAnimationRemover"));
    }

    @Property(
        type = PropertyType.BUTTON,
        name = "BetterHurtCam by Scherso",
        description = "Check out Scherso's BetterHurtCam mod.",
        category = "Extra Info", subcategory = "Links (Credits)",
        placeholder = "Visit"
    )
    public static void openSchBHC() throws URISyntaxException {
        UDesktop.browse(new URI("https://github.com/Scherso/BetterHurtCam"));
    }

    @Property(
        type = PropertyType.BUTTON,
        name = "Essential",
        description = "Check out Essential! It's what helps make this mod run.",
        category = "Extra Info", subcategory = "Links #2 (Acknowledgements)",
        placeholder = "Visit"
    )
    public static void openEssential() throws URISyntaxException {
        UDesktop.browse(new URI("https://essential.gg"));
    }

    @Property(
        type = PropertyType.BUTTON,
        name = "GNU-GPL v3 License",
        description = "Check out the GNU-GPL v3 License.",
        category = "Extra Info", subcategory = "Links #3 (legal mumbo jumbo)",
        placeholder = "Visit"
    )
    public static void openGNUGPLv3() throws URISyntaxException {
        UDesktop.browse(new URI("https://www.gnu.org/licenses/gpl-3.0.txt"));
    }

    public BestHurtCamConfig() {
        super(new File(BestHurtCam.modDir, "besthurtcam.toml"), BestHurtCam.NAME);
        initialize();
    }
}
