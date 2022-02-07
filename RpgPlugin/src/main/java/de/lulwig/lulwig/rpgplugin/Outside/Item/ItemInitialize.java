package de.lulwig.lulwig.rpgplugin.Outside.Item;

import de.lulwig.lulwig.rpgplugin.Api.Item.Methods.NormalItem;
import de.lulwig.lulwig.rpgplugin.Api.Quests.Methods.NormalQuest;
import org.bukkit.Material;

public class ItemInitialize {

    public ItemInitialize() {
        NormalItems();
    }

    public void NormalItems() {
        NormalItem.addItem("Coin", Material.EMERALD, true, 0, "", "", "", "");
        NormalItem.addItem("Kackhaufen", Material.BROWN_DYE, true, 0, "", "", "", "");
        NormalItem.addItem("Weizen", Material.WHEAT, true, 0, "füttere hiermit Fritzs Tiere", "", "", "");
        NormalItem.addItem("Holz", Material.STICK, true, 0, "gib dieses Stück Holz zu Jeremy", "", "", "");
        NormalItem.addItem("Blume", Material.POPPY, true, 0, "", "", "", "");
        NormalItem.addItem("Brief", Material.PAPER, true, 0, "", "", "", "");


        NormalItem.addItem("Diebesrobe", Material.LEATHER_CHESTPLATE, true, 10, "Diese Rüctung gehörte dem Meister der Schatten", "", "", "Armor");
        NormalItem.addItem("Kaputze", Material.LEATHER_HELMET, true, 5, "Diese Rüctung gehörte dem Meister der Schatten", "", "", "Armor");
        NormalItem.addItem("Hose", Material.LEATHER_LEGGINGS, true, 10, "Diese Rüctung gehörte dem Meister der Schatten", "", "", "Armor");
        NormalItem.addItem("Stiefel", Material.LEATHER_BOOTS, true, 5, "Diese Rüctung gehörte dem Meister der Schatten", "", "", "Armor");

        NormalItem.addItem("Königlicher Helm", Material.DIAMOND_HELMET, true, 10, "Ausrüstung für einen", "wahren Helden", "", "Armor");
        NormalItem.addItem("Königlicher Brustpanzer", Material.DIAMOND_CHESTPLATE, true, 15, "Ausrüstung für einen", "wahren Helden", "", "Armor");
        NormalItem.addItem("Königlicher Beinpanzer", Material.DIAMOND_LEGGINGS, true, 15, "Ausrüstung für einen", "wahren Helden", "", "Armor");
        NormalItem.addItem("Königliche Stiefel", Material.DIAMOND_BOOTS, true, 10, "Ausrüstung für einen", "wahren Helden", "", "Armor");

        NormalItem.addItem("Zwergenhelm", Material.GOLDEN_HELMET, true, 7, "", "", "", "Armor");
        NormalItem.addItem("Zwergenpanzer", Material.GOLDEN_CHESTPLATE, true, 12, "", "", "", "Armor");
        NormalItem.addItem("Zwergenhose", Material.GOLDEN_LEGGINGS, true, 12, "", "", "", "Armor");
        NormalItem.addItem("Zwergenstiefel", Material.GOLDEN_BOOTS, true, 7, "", "", "", "Armor");


        NormalItem.addItem("Poseidons Essstaebchen", Material.TRIDENT, true, 10, "", "", "", "Weapon");
        NormalItem.addItem("Joppis Holzschwert", Material.WOODEN_SWORD, true, 0, "dieses Holzschwert", "gehört Joppi", "", "Weapon");
        NormalItem.addItem("Kriegsaxt", Material.IRON_AXE, true, 20, "Dies ist die", "Axt eines Kriegers", "", "Weapon");
        NormalItem.addItem("Zwergenaxt", Material.GOLDEN_AXE, true, 35, "eine Axt aus", "den Tiefen der", "Zwergenschmiede", "Weapon");
        NormalItem.addItem("Edles Schwert", Material.GOLDEN_SWORD, true, 40, "Schwert eines", " in Ungnade gefallenen", "Fürsten", "Weapon");
        NormalItem.addItem("Königliches Schwert", Material.DIAMOND_SWORD, true, 50, "Ausrüstung für einen", "wahren Helden", "", "Weapon");
        NormalItem.addItem("Schwert", Material.STONE_SWORD, true, 5, "","", "", "Weapon");


        NormalItem.addItem("§r§5" + "ganz wichtiger Artifakt", Material.WOODEN_HOE, true, 1, "diese Waffe macht", "immer 1 Schaden", "bedenke meine Worte", "Weapon");

    }

}
