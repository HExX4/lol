package de.lulwig.lulwig.rpgplugin.Api.Leveling;

import de.lulwig.lulwig.rpgplugin.Main;
import de.lulwig.lulwig.rpgplugin.Outside.Leveling.Level;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class LevelUp extends Level{
    Main plugin;
    public LevelUp(Main plugin, Player p, int xpRequirements, int xpMultiplier) {
        super(plugin);
        this.plugin = plugin;
        onLevelUp(p, xpRequirements, xpMultiplier);
    }

    public void onLevelUp(Player p, int xpRequirements, int xpMultiplier) {
        p.sendMessage("§6Level Up");
        plugin.getConfig().set(p.getName() + ".level.level", plugin.getConfig().getInt(p.getName() + ".level.level") + 1);
        onLevelUp(plugin, p, xpRequirements, xpMultiplier);
    }

}
