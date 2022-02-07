package de.lulwig.lulwig.rpgplugin.Api.Config;

import de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Variables;
import de.lulwig.lulwig.rpgplugin.Api.Entities.Player.Players;
import de.lulwig.lulwig.rpgplugin.Api.Item.Methods.NormalItem;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class DefaultConfig extends Players {

    Main plugin;
    public final FileConfiguration config;
    public DefaultConfig(Main plugin) {
        super(plugin);
        this.plugin = plugin;
        config = plugin.getConfig();
    }

    public void addAllDefaults(Player p) {
        addDefaultsLevel(p, false);
        addDefaultsAttributes(p, false);
        addDefaultsQuest(p, false);
    }
    public void resetAllDefaults(Player p) {
        addDefaultsLevel(p, true);
        addDefaultsAttributes(p, true);
        addDefaultsQuest(p, true);
    }

    private void addDefaultsLevel(Player p, Boolean reset) {

        if (!reset) {
            if (!config.contains(p.getName() + ".level")) {
                config.set(p.getName() + ".level.level", Variables.startLevel);
                config.set(p.getName() + ".level.xpprogress", Variables.xpProgressStart);
                config.set(p.getName() + ".level.xprequirements", Variables.xpRequirements);
                config.set(p.getName() + ".level.xpget", Variables.xpGet);
                config.set(p.getName() + ".level.xpmultiplier", Variables.xpMultiplier);
                config.options().copyDefaults(true);
                plugin.saveConfig();
                p.getInventory().addItem(NormalItem.getItem(""))
            }
        } else {
            config.set(p.getName() + ".level.level", Variables.startLevel);
            config.set(p.getName() + ".level.xpprogress", Variables.xpProgressStart);
            config.set(p.getName() + ".level.xprequirements", Variables.xpRequirements);
            config.set(p.getName() + ".level.xpget", Variables.xpGet);
            config.set(p.getName() + ".level.xpmultiplier", Variables.xpMultiplier);
            config.options().copyDefaults(true);
            plugin.saveConfig();
        }
    }
    private void addDefaultsAttributes(Player p, Boolean reset) {

        if (!reset) {
            if (!config.contains(p.getName() + ".attributes")) {
                config.set(p.getName() + ".attributes.health", Variables.health);
                config.set(p.getName() + ".attributes.damage", Variables.damage);
                config.set(p.getName() + ".attributes.speed", Variables.speed);
                config.set(p.getName() + ".attributes.defense", Variables.defense);
                config.options().copyDefaults(true);
                plugin.saveConfig();
            }
        } else {
            config.set(p.getName() + ".attributes.health", Variables.health);
            config.set(p.getName() + ".attributes.damage", Variables.damage);
            config.set(p.getName() + ".attributes.speed", Variables.speed);
            config.set(p.getName() + ".attributes.defense", Variables.defense);
            config.options().copyDefaults(true);
            plugin.saveConfig();
        }
    }
    private void addDefaultsQuest(Player p, Boolean reset) {
        if (!reset) {
            if (!config.contains(p.getName() + ".quests")) {
                List<String> list = new ArrayList<>();
                List<String> list2 = new ArrayList<>();
                List<String> list3 = new ArrayList<>();
                config.set(p.getName() + ".quests.done", list);
                config.set(p.getName() + ".quests.active", list2);
                config.set(p.getName() + ".quests.entities", list3);
                config.options().copyDefaults(true);
                plugin.saveConfig();
            }
        } else {
            List<String> list = new ArrayList<>();
            List<String> list2 = new ArrayList<>();
            List<String> list3 = new ArrayList<>();

            config.set(p.getName() + ".quests.done", list);
            config.set(p.getName() + ".quests.active", list2);
            config.set(p.getName() + ".quests.entities", list3);
            config.options().copyDefaults(true);
            plugin.saveConfig();
        }
    }

}
