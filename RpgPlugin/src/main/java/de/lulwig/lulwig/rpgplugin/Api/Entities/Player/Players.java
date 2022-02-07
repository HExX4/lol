package de.lulwig.lulwig.rpgplugin.Api.Entities.Player;

import de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Variables;
import de.lulwig.lulwig.rpgplugin.Api.Item.Lists.AttributeList;
import de.lulwig.lulwig.rpgplugin.Api.Leveling.Level;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Players {

    Main plugin;
    public final FileConfiguration config;
    public Players(Main main) {
        this.plugin = main;
        config = plugin.getConfig();
    }

    public double getArmorDefense(Player p) {
        double defense = 0;
        if (p.getInventory().getHelmet() != null) {
            double helm = AttributeList.attributes.get(p.getInventory().getHelmet());
            defense += helm;
        }
        if (p.getInventory().getChestplate() != null) {
            double chest = AttributeList.attributes.get(p.getInventory().getChestplate());
            defense += chest;
        }
        if (p.getInventory().getLeggings() != null) {
            double leg = AttributeList.attributes.get(p.getInventory().getLeggings());
            defense += leg;
        }
        if (p.getInventory().getBoots() != null) {
            double boot = AttributeList.attributes.get(p.getInventory().getBoots());
            defense += boot;
        }
        //Bukkit.broadcastMessage("§6Damage:§9 " + defense);
        return defense;
    }
    public double getFullDefense(Player p) {
        return getBaseDefense(p) + getArmorDefense(p);
    }

    public int maxHealth(Player p) {
        int health = config.getInt(p.getName() + ".attributes.health");
        return health;
    }
    public int getBaseDefense(Player p) {
        int defense = config.getInt(p.getName() + ".attributes.defense");
        return defense;
    }
    public float getSpeed(Player p) {
        float speed = (float) config.getDouble(p.getName() + ".attributes.speed");
        return speed;
    }
    public int getbaseDamage(Player p) {
        int damage = config.getInt(p.getName() + ".attributes.damage");
        return damage;
    }

    public void lowerHealth(Player p, double damage) {
        updateMaxHealth(p);
        if (!(p.getHealth()-damage >= p.getHealth())) {
            if (p.getHealth() - damage <= 0) {
                p.setHealth(0);
            } else {
                p.setHealth(p.getHealth() - damage);
            }
        }
    }

    public void addDefense(Player p, int add) {
        double newDefense = getBaseDefense(p) + add;
        config.set(p.getName() + ".attributes.defense", newDefense);
        plugin.saveConfig();
    }
    public void addMaxHealth(Player p, int add) {
        int newMaxHealth = maxHealth(p) + add;
        config.set(p.getName() + ".attributes.health", newMaxHealth);
        plugin.saveConfig();
    }
    public void addSpeed(Player p, float add) {
        float newSpeed = getSpeed(p) + add;
        if (newSpeed < 1) {
            config.set(p.getName() + ".attributes.speed", newSpeed);
            plugin.saveConfig();
        }
    }
    public void addBaseDamage(Player p, int add) {
        int newBaseDamage = getbaseDamage(p) + add;
        config.set(p.getName() + ".attributes.damage", newBaseDamage);
        plugin.saveConfig();
    }

    public void updateMaxHealth(Player p) {
        p.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(maxHealth(p));
    }
    public void updateSpeed(Player p) {
        p.setWalkSpeed(getSpeed(p));
    }

    public void updatePlayerAttributes(Player p) {
        updateMaxHealth(p);
        updateSpeed(p);
    }

}
