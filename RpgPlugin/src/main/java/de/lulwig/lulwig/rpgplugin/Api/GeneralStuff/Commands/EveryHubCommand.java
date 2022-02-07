package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Commands;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EveryHubCommand implements CommandExecutor {

    Main plugin;
    public EveryHubCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.isOp()) {
            if (sender != null) {
                Player p = (Player) sender;

                if (cmd.getName().equals("everyhub")) {
                    ByteArrayDataOutput out = ByteStreams.newDataOutput();
                    out.writeUTF("Connect");
                    out.writeUTF("hub");

                    for (Player player : Bukkit.getServer().getOnlinePlayers()) {
                        player.sendPluginMessage(plugin, "BungeeCord", out.toByteArray());
                    }
                }
            } else {
                System.out.println("You cannot perform this Command through Console");
            }
        }
        return false;
    }
}
