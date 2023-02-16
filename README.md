# Zen quotations (fortune)

This is my hand-crafted, high quality collection of Zen quotations 🙏

**Languages**: English & German



Setup (for GNU/Linux):
-
To use it, just make the *fortune* mod files (`Zen`, `Zen.dat`) available to your *fortune* application.
Then configure *fortune* to actually use the _Zen_ fortune mod.

- If not already present, please install the "fortune" app (called "fortune-mod" sometimes) via your "Software Manager"<br/>
  e.g. under Ubuntu Linux: `sudo apt install fortune-mod`
- Copy the mod files `Zen` and `Zen.dat` to fortune's mod folder (e.g. '/usr/share/games/fortunes' in Ubuntu)<br/>
  `sudo cp Zen Zen.dat /usr/share/games/fortunes/`
- Configure your fortunes 
  e.g. under Linux: by adding the following line to your shell startup script (e.g. '~/.bashrc' for bash):<br/>
  `fortune Zen`<br/><br/>
  And of course it is possible to use it together with other fortune mods using a line like this one:<br/>
  `fortune 75% Zen 18% de/zitate 7% pratchett`

