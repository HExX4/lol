package de.lulwig.lulwig.rpgplugin.Api.Item.Methods;

import de.lulwig.lulwig.rpgplugin.Api.Item.Lists.AllItemsList;
import de.lulwig.lulwig.rpgplugin.Api.Item.Lists.AttributeList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class NormalItem {

    public static ItemStack getItem(String itemName) {
        return AllItemsList.allItems.get(itemName);
    }

    private static ItemStack newItem(String itemName, Material mat, Boolean unbreakable, List<String> lore) {
        ItemStack item = new ItemStack(mat);
        ItemMeta itemM = item.getItemMeta();
        itemM.setDisplayName("§r§5" + itemName);
        itemM.setUnbreakable(unbreakable);
        itemM.setLore(lore);
        itemM.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        itemM.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(itemM);

        return item;
    }
    // the newItem() Method is called by the addItem() Method and it represents the ItemStack itself
    public static void addItem(String itemName, Material mat, Boolean unbreakable, double attribute, String firstLoreLine, String secondLoreLine, String thirdLoreLine, String toolType) {
        ItemStack item = newItem(itemName, mat, unbreakable, newWeaponArmorLore(firstLoreLine, secondLoreLine, thirdLoreLine, toolType, attribute));
        AttributeList.attributes.put(item, attribute);
        AllItemsList.allItems.put(itemName, item);
        AllItemsList.allItemNames.add(itemName);
    }
    // the addItem() Method is called from the ItemsInitialize Class and it is the only Method that has to be called from the outside
    private static List<String> newWeaponArmorLore(String firstLine, String secondLine, String thirdLine, String toolType, double attribute) {
        List<String> list = new ArrayList<>();
        if (toolType.equalsIgnoreCase("weapon")) {
            list.add("§7Damage: §c" + attribute);
        } else if (toolType.equalsIgnoreCase("armor")) {
            list.add("§7Defense: §6" + attribute);
        }

        if (!firstLine.isEmpty()) {
            list.add(firstLine);
        }
        if (!secondLine.isEmpty()) {
            list.add(secondLine);
        }
        if (!thirdLine.isEmpty()) {
            list.add(thirdLine);
        }
        if (!toolType.isEmpty()) {
            list.add("");
            list.add("§6" + toolType);
        }

        return list;
    }
    // the NewWeaponArmorLore() Method is called by the addItemMethod and creates a Lore for a weapon or an armor piece
    public static double getAttribute(ItemStack item) {
        return AttributeList.attributes.get(item);
    }
    // gets the attribute of the item
}
