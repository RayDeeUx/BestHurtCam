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
        name = "Adjust Camera Rotation Mode Info",
        description =   "Camera rotation modes are as follows:\n\n" +
                        "Default: Standard Minecraft camera rotation (to the right). [Negative values will be treated as positive values in this mode.]\n\n" +
                        "Left or Right: Allows rotations to either left or right (depending on your config values).\n\n" +
                        "Earthquake: Fully randomizes camera rotation directions.\n\n\n" +
                        "Pro tip: Use the LSHIFT key while clicking the arrows to change config values in increments of 5! Also the button, doesn't do anything.\n\n" +
                        "To replicate the vanilla Minecraft experience, the default config value is 14 for all camera rotation configs.",
        category = "Config", subcategory = "ATTENTION: Damage Types",
        placeholder = "."
    )
    public static void fillerFunctionOne() {
        return;
    }

    @Property(
            type = PropertyType.NUMBER, name = "Adjust Hurt Camera Effect",
            description = "Adjust Minecraft's hurt animation from all damage sources besides lava, fire, and water.",
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
            description = "Adjust Minecraft's hurt animation while in lava.",
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
            description = "Adjust Minecraft's hurt animation while in water.",
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
            description = "Adjust Minecraft's hurt animation while burning.",
            category = "Config", subcategory = "Damage Types",
            min = -360, max = 360
    )
    public static int adjustHurtCamIfBurning = 14;

    @Property(
            type = PropertyType.SELECTOR, name = "Burning Camera Rotation Mode",
            description = "Choose your desired camera rotation mode while burning. Go back to the top for more info.",
            category = "Config", subcategory = "Damage Types",
            options = {"Default", "Left or Right", "Earthquake"}
    )
    public static int burnCamRotation = 0;

    @Property(
        type = PropertyType.BUTTON,
        name = "Adjust Camera Multiplier Info",
        description =   "Camera multipliers are based on player conditions.\n\n" +
                        "With that said, not all of these multipliers may work as intended-those have a \"[!!!]\" suffix in their config name.\n\n" +
                        "Additionally, all multipliers can stack. Things can and WILL get chaotic if you mess around too much.\n" +
                        "As such, there is a toggle switch just below this setting in case of an emergency.\n\n" +
                        "Please be sure of what you're doing if you enable that switch.\n\n" +
                        "To replicate the vanilla Minecraft experience, the default config value is 1 for all camera multipliers.",
        category = "Config", subcategory = "READ THIS: Rotation Multipliers",
        placeholder = "."
    )
    public static void fillerFunctionTwo() {
        return;
    }

    @Property(
            type = PropertyType.SWITCH,
            name = "Toggle Hurt Camera Multipliers",
            description = "Adjust Minecraft's hurt animation multipliers.\n\nGenerally it's safer to leave this off, but you can enable this for full customizability of the hurt camera animation. Otherwise, leave this off.",
            category = "Config", subcategory = "Rotation Multipliers"
    )
    public static boolean toggleMultipliers = false;

    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Multiplier While Sneaking",
            description = "Adjust Minecraft's hurt animation multiplier when you're sneaking.\n\nTo replicate the vanilla Minecraft experience, the default value is 1.",
            category = "Config", subcategory = "Rotation Multipliers",
            min = -10, max = 10
    )
    public static int hurtCamSneakMultiplier = 1;

    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Multiplier While Sprinting",
            description = "Adjust Minecraft's hurt animation multiplier when you're sprinting.\n\nTo replicate the vanilla Minecraft experience, the default value is 1.",
            category = "Config", subcategory = "Rotation Multipliers",
            min = -10, max = 10
    )
    public static int hurtCamSprintingMultiplier = 1;

    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Multiplier While Blocking/Aiming",
            description = "Adjust Minecraft's hurt animation multiplier when you're blocking with a sword or aiming with a bow.\n\nTo replicate the vanilla Minecraft experience, the default value is 1.",
            category = "Config", subcategory = "Rotation Multipliers",
            min = -10, max = 10
    )
    public static int hurtCamBlockingMultiplier = 1;
    
    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Multiplier While Eating",
            description = "Adjust Minecraft's hurt animation multiplier when you're eating.\n\nTo replicate the vanilla Minecraft experience, the default value is 1.",
            category = "Config", subcategory = "Rotation Multipliers",
            min = -10, max = 10
    )
    public static int hurtCamEatingMultiplier = 1;

    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Multiplier While Riding a Horse",
            description = "Adjust Minecraft's hurt animation multiplier when you're riding a horse.\n\nTo replicate the vanilla Minecraft experience, the default value is 1.",
            category = "Config", subcategory = "Rotation Multipliers",
            min = -10, max = 10
    )
    public static int hurtCamRidingHorseMultiplier = 1;

    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Multiplier While Riding Anything Else",
            description = "Adjust Minecraft's hurt animation multiplier when you're riding anything besides a horse (ie minecarts or boats).\n\nTo replicate the vanilla Minecraft experience, the default value is 1.",
            category = "Config", subcategory = "Rotation Multipliers",
            min = -10, max = 10
    )
    public static int hurtCamRidingMultiplier = 1;

    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Multiplier While Pushed by Water",
            description = "Adjust Minecraft's hurt animation multiplier when you're being pushed by water.\n\nTo replicate the vanilla Minecraft experience, the default value is 1.",
            category = "Config", subcategory = "Rotation Multipliers",
            min = -10, max = 10
    )
    public static int hurtCamPushedWaterMultiplier = 1;
    
    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Multiplier While Wet",
            description = "Adjust Minecraft's hurt animation multiplier when you're wet (ie when it's raining outside).\n\nTo replicate the vanilla Minecraft experience, the default value is 1.",
            category = "Config", subcategory = "Rotation Multipliers",
            min = -10, max = 10
    )
    public static int hurtCamWetMultiplier = 1;

    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Multiplier While Climbing a Ladder",
            description = "Adjust Minecraft's hurt animation multiplier when you're climbing a ladder.\n\nTo replicate the vanilla Minecraft experience, the default value is 1.",
            category = "Config", subcategory = "Rotation Multipliers",
            min = -10, max = 10
    )
    public static int hurtCamClimbingLadderMultiplier = 1;

    @Property(
            type = PropertyType.NUMBER,
            name = "Adjust Hurt Camera Multiplier While Self is Invisible",
            description = "Adjust Minecraft's hurt animation multiplier when you're invisible.\n\nTo replicate the vanilla Minecraft experience, the default value is 1.",
            category = "Config", subcategory = "Rotation Multipliers",
            min = -10, max = 10
    )
    public static int hurtCamInvisMultiplier = 1;

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
    public static void fillerFunctionThree() {
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
