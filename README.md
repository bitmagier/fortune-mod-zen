# Zen quotations (fortune mod)

This is a hand-crafted, high quality collection of Zen quotations and related ones, that belong to the space of Zen as I see it.

**Languages**: English & German

**Perspective**:  permanently growing

Setup (for GNU/Linux):
-
To use it, just make the *fortune* mod files (Zen, Zen.dat) available to your *fortune* application.
Then configure *fortune* to actually use the _Zen_ fortune mod.

- If not already done, you need to install "fortune" app (called "fortune-mod" sometimes) e.g. via your "Software Manager"<br/>
  e.g. under Ubuntu Linux: `sudo apt install fortune-mod`
- Copy the mod files "Zen" and "Zen.dat" to the fortunes mod folder (e.g. "/usr/share/games/fortunes" in Ubuntu)<br/>
  `sudo cp Zen Zen.dat /usr/share/games/fortunes/`
- Configure your fortunes 
  e.g. under Linux: by adding the following line to your shell startup script (e.g. ~/.bashrc for bash).<br/>
  `fortune Zen`<br/>
  An of course it is possible to use it together with other fortune mods with a line like this one:<br/>
  `fortune 75% Zen 18% de/zitate 7% pratchett`

