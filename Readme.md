# Combat Evolution x EpicFight Resurrection

<p align="center">
  <a href="https://www.youtube.com/@pla_is_me" title="YouTube">
    <img src="https://res.cloudinary.com/dxehc2hn3/image/upload/v1761811663/youtube_icon_bcbanf.png" alt="YouTube" width="80" height="80">
  </a>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <a href="https://discord.com/invite/EsvPsnqJpz" title="Discord">
    <img src="https://res.cloudinary.com/dxehc2hn3/image/upload/v1761811736/discord_icon_bg_rp4omx.png" alt="Discord" width="80" height="80">
  </a>
  &nbsp;&nbsp;&nbsp;&nbsp;
  <a href="https://ko-fi.com/pla_is_me" title="Ko‑fi">
    <img src="https://res.cloudinary.com/dxehc2hn3/image/upload/v1761815764/kofi_icon_bg_sy3foi.png" alt="Ko‑fi" width="80" height="80">
  </a>
</p>

Compatibility add-ons for **Combat Evolution** and **EpicFight Resurrection**.

---
## License (Important)

This repository is **NOT open source**.

- **Code**: GNU GENERAL PUBLIC LICENSE (see `LICENSE.md`)
- **Animations/assets**: All Rights Reserved and approved by asanginxst

## Minecraft 1.21.1

This branch builds with Java 21 and NeoForge 21.1.264. It requires Epic Fight,
Combat Evolution, and the NeoForge 1.21.1 fork of EpicFight: Resurrection.
Weapons of Miracles is supported when installed.

Build with `./gradlew build` (or `gradlew.bat build` on Windows). The jar is
written to `build/libs/`.

To check execution registration against the running dependencies, use
`gradlew.bat runServer -PverifyExecutions`. This checks the weapon/style selections
and animation pairs after server startup, then stops the server. Verification
classes are excluded from normal builds.
