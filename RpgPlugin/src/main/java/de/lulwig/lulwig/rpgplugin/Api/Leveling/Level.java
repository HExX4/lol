package de.lulwig.lulwig.rpgplugin.Api.Leveling;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Player.Players;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class Level extends Players {
    Main plugin;
    public FileConfiguration config;
    public Level(Main plugin) {
        super(plugin);
        this.plugin = plugin;
        config = plugin.getConfig();
    }

    public int getLevel(Player p) {
        return config.getInt(p.getName() + ".level.level");
    }
    public void onXpGet(Player p, int xp) {
        addXp(p, xp);
    }
    private void addXp(Player p, int xp) {

        int xpRequirements = config.getInt(p.getName() + ".level.xprequirements");
        int xpMultiplier = config.getInt(p.getName() + ".level.xpmultiplier");
        int xpProgress = config.getInt(p.getName() + ".level.xpprogress") + (xp*xpMultiplier);
        if (xpProgress >= xpRequirements) {
            xpProgress = xpProgress - xpRequirements;
            config.set(p.getName() + ".level.xpprogress", xpProgress);
            plugin.saveConfig();
            new LevelUp(plugin, p, xpRequirements, xpMultiplier);
        } else {
            config.set(p.getName() + ".level.xpprogress", xpProgress);
            plugin.saveConfig();
        }
    }
}
