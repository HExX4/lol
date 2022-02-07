package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Commands;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HubCommand implements CommandExecutor {

    Main plugin;
    public HubCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender != null) {
            Player p = (Player) sender;

            if (cmd.getName().equals("hub")) {

                ByteArrayDataOutput out = ByteStreams.newDataOutput();
                out.writeUTF("Connect");
                out.writeUTF("hub");
                p.sendPluginMessage(plugin, "BungeeCord", out.toByteArray());

            }
        } else {
            System.out.println("You cannot perform this Command through Console");
        }
        return false;
    }

}
