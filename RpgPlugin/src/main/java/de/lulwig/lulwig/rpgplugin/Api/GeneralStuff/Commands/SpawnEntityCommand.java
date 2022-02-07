package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Commands;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization.Lists;
import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Spawning.SpawnEntity;
import de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Variables;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class SpawnEntityCommand extends SpawnEntity implements CommandExecutor {

    public SpawnEntityCommand(Main main) {
        super(main);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.isOp()) {
            if (sender != null) {
                Player p = (Player) sender;

                if (args.length == 0) {
                    p.sendMessage("§cyou have to put an Entity or an area after the Command");
                } else if (args.length == 2 && args[0].equals("area")) {
                    if (Lists.locationAreaList.containsKey(args[1])) {
                        spawnArea(args[1]);
                    } else {
                        p.sendMessage("§cthat Area does not exist");
                    }
                } else if (args.length == 1) {
                    if (Lists.entityLocationList.containsKey(args[0])) {
                        spawnEntity(args[0]);
                    } else {
                        p.sendMessage("§cthat Entity does not exist");
                    }
                } else if (args.length == 4) {
                    if (Lists.entityIds.contains(args[0])) {
                        try {
                            Location location = new Location(p.getWorld(), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
                            SpawnEntity.spawnEntity(args[0], location);
                        } catch (NumberFormatException exception) {
                            p.sendMessage("§cyou can only put Coordinates there");
                        }
                    } else {
                        p.sendMessage("§cthat Entity does not exist");
                    }
                } else if (args.length > 4) {
                    p.sendMessage("§cyou cannot put more than 4 arguments");
                } else {
                    p.sendMessage("§cYou have to put an Entity and a Location (x, y, z) or an area");
                }

            } else {
                System.out.println("You cannot perform this Command through Console");
            }
        }
        return false;
    }

}
