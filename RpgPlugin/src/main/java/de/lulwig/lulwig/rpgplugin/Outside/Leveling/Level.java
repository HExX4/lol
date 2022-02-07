package de.lulwig.lulwig.rpgplugin.Outside.Leveling;

import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.entity.Player;

public class Level extends de.lulwig.lulwig.rpgplugin.Api.Leveling.Level {

    public Level(Main plugin) {
        super(plugin);
    }

    public void onLevelUp(Main plugin, Player p, int xpRequirements, int xpMultiplier) {
        int xpReq = xpRequirements + (50*plugin.getConfig().getInt(p.getName() + ".level.level"));
        // what is added to the level Requirements everytime a levelUp happens -> 50 x Your Level
        int xpMulti = xpMultiplier + 1;
        // what is added to the level Multiplier everytime a levelUp happens -> 1

        plugin.getConfig().set(p.getName() + ".level.xprequirements", xpReq);
        plugin.getConfig().set(p.getName() + ".level.xpmultiplier", xpMulti);
        onXpGet(p, 0);
        levelUpUpgrades(p);
    }

    public void levelUpUpgrades(Player p) {
        // open inventory where I have to decide whether I choose Hp or speed
        addMaxHealth(p, 5);
        // health + 5
        addDefense(p, 2);
        // defense + 2
        addBaseDamage(p, 2);
        // damage + 2
        addSpeed(p, 0.01F);
        // speed + 2
        updatePlayerAttributes(p);
    }
}

/*TO-DO
* x add the methods for getting defense, damage and speed
* - get the damage of the attacking enemy multiply it with the level and then subtract the defense and then subtract that from my hp
* - change the one where it says NOT FINAL to the damage number
* - try out some stuff with the speed number
* (last) - open inventory where I have to decide whether I choose Hp or speed
*/
