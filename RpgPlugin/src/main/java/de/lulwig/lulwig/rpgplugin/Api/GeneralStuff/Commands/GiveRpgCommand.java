package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Commands;

import de.lulwig.lulwig.rpgplugin.Api.Item.Lists.AllItemsList;
import de.lulwig.lulwig.rpgplugin.Api.Item.Methods.NormalItem;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveRpgCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.isOp()) {
            if (sender != null) {
                Player p = (Player) sender;

                if (args.length == 0) {
                    p.sendMessage("§cyou have to put an Item after the Command");
                } else if (args.length == 2 && AllItemsList.allItems.containsKey(args[0] + " " + args[1])) {
                    p.getInventory().addItem(NormalItem.getItem(args[0] + " " + args[1]));
                } else if (args.length == 1 && AllItemsList.allItems.containsKey(args[0])) {
                    p.getInventory().addItem(NormalItem.getItem(args[0]));
                } else {
                    p.sendMessage("§cthat RpgItem does not exist or your item is 3 words long (§7max. 2§c)");
                }

            } else {
                System.out.println("You cannot perform this Command through Console");
            }
        }
        return false;
    }

}
