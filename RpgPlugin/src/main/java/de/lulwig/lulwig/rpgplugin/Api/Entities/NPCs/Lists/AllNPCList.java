package de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Lists;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllNPCList {

    public static List<String> allNPCsList = new ArrayList<>();
    //all of the NPCs -> NPCiD
    public static HashMap<String, String> getNPCnames = new HashMap<>();
    //stores all the NPC Names for the iDs -> NPCiD = NPCname

    public static HashMap<String, String> tellQuestNames = new HashMap<>();
    //stores the Names of the Quests the NPC gives the Player when he goes off
    // -> NPCiD = tellQuestName
    public static HashMap<String, String> checkQuestNames = new HashMap<>();
    //stores the Names of the quests the NPC checks when a Player talks to them
    // ->NPCiD = checkQuestName
    public static HashMap<String, List<String>> conversations = new HashMap<>();
    //stores the Conversations as Lists -> NPCiD = List<String> conversation

    public static HashMap<String, Location> NPClocations = new HashMap<>();
    //stores the locations of the NPCs -> NPCiD = loc
    public static HashMap<String, Boolean> isChild = new HashMap<>();
    //says if the NPC is a Child -> NPCiD = isChild
    public static HashMap<String, Villager.Profession> villagerProfession = new HashMap<>();
    //stores the profession of the Villager -> NPCiD = profession
    public static HashMap<String, Villager.Type> villagerBiomes = new HashMap<>();
    //stores the Biome the Villager is from (decoration) -> NPCiD = biome
    public static HashMap<String, List<MerchantRecipe>> villagerTrades = new HashMap<>();
    //stores the Trades of the ShopNPCs -> NPCiD = trades
    public static HashMap<String, EntityType> nonVillagerEntityTypes = new HashMap<>();
    //stores the EntityTypes of the NPCs that aren't Villagers
    public static HashMap<String, String> areaIds = new HashMap<>();
    //stores the areaId the NPC spawns -> NPCiD = areaIdToSpawn
    public static HashMap<String, Location> tpWhenDone = new HashMap<>();
    // stores the locations the player is teleported to, when the quest is done -> questName = tpWhenDone
}
