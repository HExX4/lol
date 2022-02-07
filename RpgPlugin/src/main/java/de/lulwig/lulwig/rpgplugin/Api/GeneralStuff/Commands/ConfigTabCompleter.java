package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Commands;

import de.lulwig.lulwig.rpgplugin.Api.Item.Lists.AllItemsList;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class ConfigTabCompleter implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> list = new ArrayList<>();
        list.add("reset");
        return list;
    }

}
