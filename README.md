<h2 align="center">
  BestHurtCam by RayDeeUx
</h2>

  A <i>direct modification</i> of [Scherso](https://github.com/Scherso)'s [BetterHurtCam](https://github.com/Scherso/BetterHurtCam) mod, which allows you to adjust Minecraft's hurt animation based on damage sources and player conditions, by selecting a number. Scherso's BetterHurtCam mod was originally inspired by [boomboompower](https://github.com/boomboompower)'s [HurtAnimationRemover](https://github.com/boomboompower/HurtAnimationRemover) mod, which cancels Minecraft's hurt animation regardless of the damage source/player conditions. Licensed under [the GNU-GPL v3 license](https://www.gnu.org/licenses/gpl-3.0.txt) as per the terms of section 5. Development originally began in mid-February 2022, halted almost immediately after due to personal circumstances, and finally finished on mid-May 2022.

  <b><i>Disclaimer: BestHurtCam only supports Minecraft Forge 1.8.9, unlike its ancestor BetterHurtCam by Scherso, which supports multiple versions of Minecraft.</i></b>

## Installation Guide

1. **Install Minecraft 1.8.9**
2. **Install the [Forge Loader for 1.8.9][forge]**
3. **Build this repository**
4. **Place the resulting file in your `minecraft/mods` directory**

<details>
  <summary>For those who would like to build themselves</summary>
  
  ## Build with [Gradle][gradle] using [Arch Loom][archloom]

  <a href="https://www.gradle.org">
      <img align="right" height="40" 
           src="https://iconape.com/wp-content/files/vf/348927/png/gradle-logo.png">  
  </a>

  - Make sure [Java 17][jdk] is installed on your computer

  1. Git clone the project: `git clone https://github.com/Scherso/ForgeTemplate/`
  2. Run:
  - Unix in Terminal:
     
  Note: If you plan to only build once add the `—no-daemon` flag to the build. 
  ```bash
  cd ForgeTemplate ; chmod 755 ./gradlew && ./gradlew --refresh-dependencies build
  ```
  - Windows in Powershell: 
     
  ```powershell
  cd ForgeTemplate ; .\gradlew.bat --refresh-dependencies build 
  ```
     
  3. Check the directory `ForgeTemplate/build/libs` or Windows; `ForgeTemplate\build\libs`

  ## For [IntelliJ][intelliJ]

  <a href="https://www.jetbrains.com/idea/">
      <img align="right" height="40" 
           src="https://resources.jetbrains.com/storage/products/company/brand/logos/IntelliJ_IDEA_icon.svg">  
  </a>

  ### IDE Setup

  1. Open the project from `File > Open...` Select ForgeTemplate from it’s given file location. 
  2. Let the IDE collect dependencies and index the code. (this may take a couple seconds)
  3. Go to `File > Project Structure... > SDKs` and make sure an SDK for Java 17 is installed and selected, if not download it [here][jdk]

  ### Build

  Test if the environment is set up correctly setup by clicking the refresh button in IntelliJ’s Gradle tab, if it has indexed properly with no errors do the following:
  1. Go to `ForgeTemplate > Tasks > loom > genSources` in the Gradle tab and run `genSources`
  2. To build the mod as a jar run `ForgeTemplate > Tasks > build > build`. Gradle will create a new directory called `build`. 
  3. Once this process is done, the .jar file will be located in `build/libs` You can see this in your file tree.

  [gradle]: https://www.gradle.org
  [archloom]: https://github.com/Sk1erLLC/architectury-loom
  [intelliJ]: https://www.jetbrains.com/idea/
  [jdk]: https://www.azul.com/downloads/?version=java-17-lts&package=jdk
  
</details>
<details>
  <summary>How I built this mod (not sure why you'd like to know it, but here it is anyways in case you use macOS)</summary>
  
  ## Building it the way RayDeeUx did
  
  - Make sure the [Java 8 JDK][jdk8] is installed on your (macOS) computer, as well as [macOS Homebrew][hmbrw].
  - Additionally, make sure your macOS Terminal is set to running on the `bash` shell and not the `zsh` shell.

  1. Open the macOS Terminal, `brew install git` or `brew upgrade git` if necessary.
  2. ```bash git clone https://github.com/RayDeeUx/BestHurtCam/ && cd BestHurtCam/ && chmod 755 ./gradlew && ./gradlew build```
  3. Check `BestHurtCam/build/libs` for the resulting `.jar` file.

  [jdk8]: https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html
  [hmbrw]: https://brew.sh/
</details>

## BestHurtCam vs BetterHurtCam vs HurtAnimationRemover: what's the difference?

| Feature | BestHurtCam  | BetterHurtCam | HurtAnimationRemover |
| -------- | -------- | ------------------- | ------------------- |
| Option to cancel camera rotation when hurt | Yes<br><sub>(via "0" config value)</sub> | Yes<br><sub>(via "0" config value)</sub> | Yes<br><sub>(by default)</sub> |
| Flexible config values beyond entirely cancelling the camera rotation when hurt | Yes<br><sub>(-360 to 360, inclusive)</sub> | Yes<br><sub>(0 to 100, inclusive)</sub> | No |
| Distinct config values based on player conditions | Yes | Yes | No |
| Anti-rotation abuse to comply with Hypixel's mods guidelines | Yes | Yes | No |
| Camera rotation options for while in water | Yes | No | N/A |
| Camera rotation options per damage source | Yes | No | N/A |
| Mildly more control over rotation intensity | Yes | No<br><sub>(Essential's sliders do be finicky)</sub> | N/A |
| Camera rotates to left | Yes<br><sub>(via negative rotation intensities)</sub> | No | No |
| Earthquake mode (jittery camera shake) | Yes | No | No |
| Minecraft version support | 1.8.9 | 1.8.9, 1.18.x | 1.16.4 |


## Credits

<a href="https://github.com/boomboompower">
  <img align="right" width="60"
       src="https://user-images.githubusercontent.com/90007553/163434382-5f0afaed-6f6c-4c4f-93f4-196fea2bb6aa.png"
  />
</a>

  > Credits to [boomboompower](https://github.com/boomboompower) for the HurtAnimationRemover mod, which allows you to completely cancel the hurt effect.
  > You can find boomboompower's HurtAnimationRemover mod [here](https://github.com/boomboompower/HurtAnimationRemover).

<a href="https://github.com/Scherso">
  <img align="right" width="60"
       src="https://raw.githubusercontent.com/Scherso/Scherso/main/assets/Scherso.png"
  />
</a>
  
  > Credits to [Scherso](https://github.com/Scherso) for the BetterHurtCam mod, which added slightly more options to customize the hurt effect without violating Hypixel's guidelines.
  > You can find Scherso's BetterHurtCam mod [here](https://github.com/Scherso/BetterHurtCam).
  

[forge]: https://files.minecraftforge.net/net/minecraftforge/forge/index_1.8.9.html
