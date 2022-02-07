package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Commands;

import de.lulwig.lulwig.rpgplugin.Api.Leveling.Level;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LevelCommand extends Level implements CommandExecutor {
    public LevelCommand(Main plugin) {
        super(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()) {
            if (sender != null) {
                Player p = (Player) sender;

                if (args.length == 0) {
                    p.sendMessage("§cyou have to put something after the command");
                } else if (args.length == 3) {
                    if (args[0].equals("give")) {
                        int xp = Integer.parseInt(args[2]);
                        onXpGet(Bukkit.getPlayer(args[1]), xp);
                    }
                } else if (args.length == 2) {
                    p.sendMessage("§cvalue is missing");
                } else if (args.length == 1) {
                    p.sendMessage("you have to put a Player there");
                }
            } else {
                System.out.println("You cannot perform this Command through Console");
            }
        }
        return false;
    }
}
