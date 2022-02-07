package de.lulwig.lulwig.rpgplugin.Api.Quests.Methods;

import de.lulwig.lulwig.rpgplugin.Api.Config.DefaultConfig;
import de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Initialization.NormalNPC;
import de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Lists.AllNPCList;
import de.lulwig.lulwig.rpgplugin.Api.Item.Lists.AllItemsList;
import de.lulwig.lulwig.rpgplugin.Api.Item.Methods.NormalItem;
import de.lulwig.lulwig.rpgplugin.Api.Leveling.Level;
import de.lulwig.lulwig.rpgplugin.Api.Quests.Lists.QuestList;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NormalQuest extends Level {

    Main plugin;
    FileConfiguration config;
    public NormalQuest(Main main) {
        super(main);

        plugin = main;
        config = main.getConfig();
    }

    public static void addIfNotNull(String key, Location value, HashMap<String, Location> hashMap) {
        if (value != null) {
            hashMap.put(key, value);
        }
    }

    public boolean getDone(Player p, String questName) {
        if (getDoneQuests(p).contains(questName)) {
            return true;
        } else {
            if (QuestList.bringItemsLists.containsKey(questName)) {
                List<String> itemsList = QuestList.bringItemsLists.get(questName);
                //p.sendMessage("QuestList.bringItemsLists.get(questName) == null §6" + Boolean.toString(QuestList.bringItemsLists.get(questName) == null));
                //p.sendMessage("itemsList.isEmpty() §6" + Boolean.toString(itemsList.isEmpty()));
                List<String> itemsList2 = new ArrayList<>();
                for (String s : itemsList) {
                    ItemStack item = NormalItem.getItem(s);

                    if (p.getInventory().contains(item)) {
                        itemsList2.add(s);
                    }

                }
                if (itemsList2.equals(itemsList)) {
                    for (String s : itemsList) {
                        ItemStack item = NormalItem.getItem(s);

                        if (p.getInventory().contains(item)) {
                            p.getInventory().remove(item);
                        }

                    }
                }
                return itemsList2.equals(itemsList);
            }
            else if (getActiveQuests(p).contains(questName) && QuestList.bringEntitiesLists.containsKey(questName)) {
                return getEntitiesToFind(p).isEmpty();
            }
            else {
                return false;
            }
        }
    }
    public void markDoneIfDone(Player p, String questName) {
        if (getDone(p, questName)) {
            doneQuest(p, questName);
        }
    }
    public void activateQuest(Player p, String questName) {
        List<String> activeQuests = (List<String>) config.get(p.getName() + ".quests.active");
        if (!activeQuests.contains(questName)) {
            activeQuests.add(questName);
        }
        if (QuestList.bringEntitiesLists.containsKey(questName)) {
            config.set(p.getName() + ".quests.entities", QuestList.bringEntitiesLists.get(questName));
            config.options().copyDefaults(true);
            plugin.saveConfig();
        }
        if (questName.equals("Die letzte Schlacht")) {
            p.teleport(new Location(Bukkit.getServer().getWorld("rpg"), 520, 67, -1767));
            p.getInventory().addItem(NormalItem.getItem("Königlicher Helm"));
            p.getInventory().addItem(NormalItem.getItem("Königlicher Brustpanzer"));
            p.getInventory().addItem(NormalItem.getItem("Königlicher Beinpanzer"));
            p.getInventory().addItem(NormalItem.getItem("Königliche Stiefel"));
            p.getInventory().addItem(NormalItem.getItem("Königliches Schwert"));

        }
        config.set(p.getName() + ".quests.active", activeQuests);
        config.options().copyDefaults(true);
        plugin.saveConfig();

        markDoneIfDone(p, questName);
        p.sendMessage("§8[§6" + "Quest" + "§8] §9" + "Neue Quest hinzugefügt:");
        p.sendMessage("§7" + QuestList.descriptions.get(questName));
    }
    public void doneQuest(Player p, String questName) {
        List<String> activeQuests = (List<String>) config.get(p.getName() + ".quests.active");
        List<String> doneQuests = (List<String>) config.get(p.getName() + ".quests.done");
        if (activeQuests.contains(questName)) {
            activeQuests.remove(questName);
        }
        if (!doneQuests.contains(questName)) {
            doneQuests.add(questName);
        }
        List<String> list = getEntitiesToFind(p);
        list.clear();
        config.set(p.getName() + ".quests.entities", list);
        config.set(p.getName() + ".quests.done", doneQuests);
        config.set(p.getName() + ".quests.active", activeQuests);
        config.options().copyDefaults(true);
        plugin.saveConfig();
        p.sendMessage("§8[§6" + "Quest" + "§8] §a" + "Quest erledigt:");
        p.sendMessage("§7" + QuestList.descriptions.get(questName));
    }

    public void tickOffEntity(Player p, String questName, String entityId) {
        List<String> entityIdList = getEntitiesToFind(p);
        if (entityIdList.contains(entityId)) {
            entityIdList.remove(entityId);
        }
        if (entityIdList.isEmpty()) {
            if (getActiveQuests(p).contains("Wilde Jagd")) {
                ItemStack item = NormalItem.getItem("Diebesrobe");
                ItemStack item2 =  NormalItem.getItem("Kaputze");
                ItemStack item3 = NormalItem.getItem("Hose");
                ItemStack item4 = NormalItem.getItem("Stiefel");
                LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
                LeatherArmorMeta meta2 = (LeatherArmorMeta) item2.getItemMeta();
                LeatherArmorMeta meta3 = (LeatherArmorMeta) item3.getItemMeta();
                LeatherArmorMeta meta4 = (LeatherArmorMeta) item4.getItemMeta();
                meta.setColor(Color.BLACK);
                meta2.setColor(Color.BLACK);
                meta3.setColor(Color.BLACK);
                meta4.setColor(Color.BLACK);

                p.getInventory().addItem(item);
                p.getInventory().addItem(item2);
                p.getInventory().addItem(item3);
                p.getInventory().addItem(item4);
            } else if (getActiveQuests(p).contains("tiefgehende Bedrohung")) {
                p.getInventory().addItem(NormalItem.getItem("Zwergenhelm"));
                p.getInventory().addItem(NormalItem.getItem("Zwergenpanzer"));
                p.getInventory().addItem(NormalItem.getItem("Zwergenhose"));
                p.getInventory().addItem(NormalItem.getItem("Zwergenstiefel"));
            } else {
                if (QuestList.specialDrops.containsKey(questName)) {
                    p.getInventory().addItem(NormalItem.getItem(QuestList.specialDrops.get(questName)));
                }
            }
        }
        config.set(p.getName() + ".quests.entities", entityIdList);
        config.options().copyDefaults(true);
        plugin.saveConfig();
        markDoneIfDone(p, questName);
        /*for (String s : entityIdList) {
            p.sendMessage(s);
        }*/
    }
    public List<String> getActiveQuests(Player p) {
        return (List<String>) config.get(p.getName() + ".quests.active");
    }
    public List<String> getDoneQuests(Player p) {
        return (List<String>) config.get(p.getName() + ".quests.done");
    }
    public List<String> getEntitiesToFind(Player p) {
        return (List<String>) config.get(p.getName() + ".quests.entities");
    }

    public static void newFindQuest(String questName, String NPCiDtoFind, String doneDialog, String description, Location tpWhenDone) {

        QuestList.allQuestList.add(questName);
        QuestList.findNPCQuests.put(questName, NPCiDtoFind);
        QuestList.doneDialogs.put(questName, doneDialog);
        QuestList.descriptions.put(questName, description);
        addIfNotNull(questName, tpWhenDone, AllNPCList.tpWhenDone);

    }
    public static void newBringEntitiesQuest(String questName, String doneDialog, String description, List<String> entityIds, Location tpWhenDone, String specialDrop) {

        QuestList.bringEntitiesLists.put(questName, entityIds);
        QuestList.allQuestList.add(questName);
        QuestList.doneDialogs.put(questName, doneDialog);
        QuestList.descriptions.put(questName, description);
        addIfNotNull(questName, tpWhenDone, AllNPCList.tpWhenDone);
        NormalNPC.addIfNotNull(QuestList.specialDrops, questName, specialDrop);

    }
    public static void newBringItemsQuest(String questName, String doneDialog, String description, List<String> itemNames, Location tpWhenDone) {

        QuestList.bringItemsLists.put(questName, itemNames);
        QuestList.allQuestList.add(questName);
        QuestList.doneDialogs.put(questName, doneDialog);
        QuestList.descriptions.put(questName, description);
        addIfNotNull(questName, tpWhenDone, AllNPCList.tpWhenDone);

    }

}
