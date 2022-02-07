package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Commands;

import de.lulwig.lulwig.rpgplugin.Api.Config.DefaultConfig;
import de.lulwig.lulwig.rpgplugin.Api.Item.Lists.AllItemsList;
import de.lulwig.lulwig.rpgplugin.Api.Item.Methods.NormalItem;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class ConfigCommand extends DefaultConfig implements CommandExecutor {

    public ConfigCommand(Main plugin) {
        super(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()) {
            if (sender != null) {
                Player p = (Player) sender;

                if (args.length == 0) {
                    p.sendMessage("§cyou have to put something after the command");
                } else if (args.length == 1) {
                    if (args[0].equals("reset")) {
                        resetAllDefaults(p);
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
