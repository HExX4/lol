package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Commands;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Variables;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EntityRespawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.isOp()) {
            if (sender != null) {
                Player p = (Player) sender;

                if (args.length == 0) {
                    p.sendMessage("§cyou have to put something after the command");
                } else if (args.length == 1) {
                    if (args[0].equals("on")) {
                        Variables.entityRespawn = true;
                        Bukkit.broadcastMessage("§8[§6Respawn§8] §9Entity Respawn is §aon");
                    } else if (args[0].equals("off")) {
                        Variables.entityRespawn = false;
                        Bukkit.broadcastMessage("§8[§6Respawn§8] §9Entity Respawn is §coff");
                    } else {
                        p.sendMessage("§cyou can only put 'on' or 'off'");
                    }
                } else {
                    p.sendMessage("§cyou cannot put two arguments");
                }
            } else {
                System.out.println("You cannot perform this Command through Console");
            }
        }
        return false;
    }

}
