package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Listeners;

import de.lulwig.lulwig.rpgplugin.Api.Config.DefaultConfig;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitListener extends DefaultConfig implements Listener {

    public JoinQuitListener(Main plugin) {
        super(plugin);
    }

    String joinQuitMessage(Player p, Boolean joinMessage) {
        String message;
        if (joinMessage) {
            message = "§8[§a+§8] §6" + p.getName();
        } else {
            message = "§8[§c-§8] §6" + p.getName();
        }

        return message;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.setJoinMessage(joinQuitMessage(e.getPlayer(), true));
        addAllDefaults(e.getPlayer());
        updatePlayerAttributes(e.getPlayer());
        e.getPlayer().setHealth(maxHealth(e.getPlayer()));
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        e.setQuitMessage(joinQuitMessage(e.getPlayer(), false));
    }

    // these two listeners just change the messages when you quit or join and update the attributes of the player
}
