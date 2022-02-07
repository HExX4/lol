package de.lulwig.lulwig.rpgplugin.Api.Quests.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuestList {

    public static List<String> allQuestList = new ArrayList<>();
    //stores all the questNames -> questName
    public static HashMap<String, String> doneDialogs = new HashMap<>();
    //stores the Dialog that is said by the NPC when the Quest is done
    // -> questName = doneDialog
    public static HashMap<String, String> descriptions = new HashMap<>();
    //stores the Description that is printed out when the quest is added and when it's done
    // -> questName = description

    public static HashMap<String, String> findNPCQuests = new HashMap<>();
    //stores the NPCiDs for the findNPCQuests -> questName = NPCiDtoFind
    public static HashMap<String, List<String>> bringItemsLists = new HashMap<>();
    //stores the Lists of Items you have to find in the bringItemsQuests
    // -> questName = List<itemName>
    public static HashMap<String, List<String>> bringEntitiesLists = new HashMap<>();
    //stores the Lists of Entities you have to find in the bringEntitiesQuests
    // -> questName = List<entityId>
    public static HashMap<String, String> specialDrops = new HashMap<>();
    //stores the special drops that drop when the quest is done -> questName = specialDrop

}
