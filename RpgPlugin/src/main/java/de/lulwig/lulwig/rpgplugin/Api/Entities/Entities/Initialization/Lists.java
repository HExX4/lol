package de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization;

import com.google.common.cache.AbstractCache;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lists {

    public static List<String> entityNames = new ArrayList<>();
    // stores all the Normal entity Names
    public static List<String> entityIds = new ArrayList<>();
    // stores all the entityIds
    public static HashMap<String, String> entityIdNamesList = new HashMap<>();
    // stores the entityNames and the Ids -> entityId = entityName
    public static HashMap<String, String> locationIdList = new HashMap<>();
    // stores the locationIds -> entityId = locationId
    public static HashMap<String, String> getEntityIdList = new HashMap<>();
    // stores the entityIds -> locationId = entityId

    public static HashMap<String, EntityType> entityTypeList = new HashMap<>();
    // stores the entityTypes -> entityId = entityType
    public static HashMap<String, Integer> baseHealthList = new HashMap<>();
    // stores the baseHealths -> entityId = baseHealth
    public static HashMap<String, Integer> baseDamageList = new HashMap<>();
    // stores the baseDamages -> entityId = baseDamage
    public static HashMap<String, Integer> baseDefenseList = new HashMap<>();
    // stores the baseDefenses -> entityId = baseDefense

    public static HashMap<String, Location> entityLocationList = new HashMap<>();
    // stores the locations -> locationId = location
    public static HashMap<String, List<String>> locationAreaList = new HashMap<>();
    // stores the location Areas -> areaId = List<locationId>
    public static HashMap<String, Integer> entityExperienceList = new HashMap<>();
    // stores the xP you get from an Entity when it dies -> entityId = baseXp
    public static HashMap<String, Boolean> entityRespawn = new HashMap<>();
    // stores if the entity will respawn after you kill it -> entityId = respawn
    public static List<String> spawnAtBegin = new ArrayList<>();
    // stores if the entity spawn at the beginning -> entityId = spawnAtBegin
}
