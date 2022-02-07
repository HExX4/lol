package de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Initialization;

import de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Lists.AllNPCList;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NormalNPC {

    public static void addIfNotNull(List<String> list, String value) {
        if (value != null && !value.isEmpty()) {
            list.add(value);
        }
    }
    public static void addIfNotNull(HashMap<String, String> hashMap, String key, String value) {
        if (value != null && !value.isEmpty()) {
            hashMap.put(key, value);
        }
    }

    public static void newNPC(Location loc, String NPCiD, String name, String tellQuestName, String checkQuestName, Villager.Profession profession, Villager.Type biome, Boolean isChild, String hello, String first, String second, String third, String bye, String areaIdToSpawn) {

        List<String> conversation = new ArrayList<>();
        addIfNotNull(conversation, hello);
        addIfNotNull(conversation, first);
        addIfNotNull(conversation, second);
        addIfNotNull(conversation, third);
        addIfNotNull(conversation, bye);

        AllNPCList.allNPCsList.add(NPCiD);
        AllNPCList.getNPCnames.put(NPCiD, name);
        addIfNotNull(AllNPCList.tellQuestNames, NPCiD, tellQuestName);
        addIfNotNull(AllNPCList.checkQuestNames, NPCiD, checkQuestName);
        AllNPCList.conversations.put(NPCiD, conversation);
        AllNPCList.NPClocations.put(NPCiD, loc);
        AllNPCList.isChild.put(NPCiD, isChild);
        AllNPCList.villagerProfession.put(NPCiD, profession);
        AllNPCList.villagerBiomes.put(NPCiD, biome);
        addIfNotNull(AllNPCList.areaIds, NPCiD, areaIdToSpawn);
    }
    public static void newAnimalNPC(Location loc, String NPCiD, String name, String tellQuestName, String checkQuestName, EntityType type, String hello, String first, String second, String third, String bye, String areaIdToSpawn) {
        List<String> conversation = new ArrayList<>();
        addIfNotNull(conversation, hello);
        addIfNotNull(conversation, first);
        addIfNotNull(conversation, second);
        addIfNotNull(conversation, third);
        addIfNotNull(conversation, bye);

        AllNPCList.allNPCsList.add(NPCiD);
        AllNPCList.getNPCnames.put(NPCiD, name);
        addIfNotNull(AllNPCList.tellQuestNames, NPCiD, tellQuestName);
        addIfNotNull(AllNPCList.checkQuestNames, NPCiD, checkQuestName);
        AllNPCList.conversations.put(NPCiD, conversation);
        AllNPCList.NPClocations.put(NPCiD, loc);
        AllNPCList.nonVillagerEntityTypes.put(NPCiD, type);
        addIfNotNull(AllNPCList.areaIds, NPCiD, areaIdToSpawn);
    }

    public static void newShopNPC(Location loc, String NPCiD, String name, List<MerchantRecipe> trades, Villager.Profession profession, Villager.Type biome, Boolean isChild, String hello, String first, String second, String third, String bye, String areaIdToSpawn) {
        List<String> conversation = new ArrayList<>();
        addIfNotNull(conversation, hello);
        addIfNotNull(conversation, first);
        addIfNotNull(conversation, second);
        addIfNotNull(conversation, third);
        addIfNotNull(conversation, bye);

        AllNPCList.allNPCsList.add(NPCiD);
        AllNPCList.getNPCnames.put(NPCiD, name);
        AllNPCList.conversations.put(NPCiD, conversation);
        AllNPCList.NPClocations.put(NPCiD, loc);
        AllNPCList.isChild.put(NPCiD, isChild);
        AllNPCList.villagerProfession.put(NPCiD, profession);
        AllNPCList.villagerBiomes.put(NPCiD, biome);
        AllNPCList.villagerTrades.put(NPCiD, trades);
        addIfNotNull(AllNPCList.areaIds, NPCiD, areaIdToSpawn);

    }

}
