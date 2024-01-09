# Zen quotations (fortune)

Hand-crafted, high quality collection of Zen quotes.

Friend — have a cup of tea and enjoy this timeless wisdom with me 🙏

---
**Languages**: English and German

---

Setup (for GNU/Linux)
-
To use it, just make the *fortune* mod files [`Zen_de`,`Zen_de.dat`,`Zen_en`,`Zen_en.dat`] available to your *fortune* application.
Then configure __fortune__ to actually use the __Zen__ fortune mod.

Details step-by-step
-
- If not already present, please install the "fortune" app (called "fortune-mod" sometimes) via your "Software Manager"<br/>
  e.g. under Ubuntu Linux: `sudo apt install fortune-mod`
- Copy the mod files [`Zen_de`,`Zen_de.dat`,`Zen_en`,`Zen_en.dat`] to fortune's mod folder (e.g. `/usr/share/games/fortunes` in Ubuntu)<br/>
  `sudo cp Zen Zen.dat /usr/share/games/fortunes/`
- Configure your fortunes 
  e.g. under Linux: by adding the following line to your shell startup script (e.g. `~/.bashrc` for bash):<br/><br>
  `fortune 50% Zen_en 50% Zen_de`<br/><br/>
  
