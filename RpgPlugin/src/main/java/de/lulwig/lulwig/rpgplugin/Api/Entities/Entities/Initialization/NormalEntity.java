package de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization;

import de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Initialization.NormalNPC;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class NormalEntity {

    public static String entityName(String entityId) {
        int maxhealth = Lists.baseHealthList.get(entityId);
        String OgName = Lists.entityIdNamesList.get(entityId);

        String name = "§9" + OgName + " §a" + maxhealth + "§7/§6" + maxhealth;
        return name;
    }

    public static void addEntityLocation(String entityId, String locationId, Location loc, String areaId, boolean respawn, boolean spawnAtBegin) {

        Lists.getEntityIdList.put(locationId, entityId);
        Lists.locationIdList.put(entityId, locationId);
        Lists.entityLocationList.put(locationId, loc);
        Lists.entityRespawn.put(locationId, respawn);
        if (spawnAtBegin && !Lists.spawnAtBegin.contains(areaId)) {
            NormalNPC.addIfNotNull(Lists.spawnAtBegin, areaId);
        }

        if (!Lists.locationAreaList.containsKey(areaId)) {
            List<String> list = new ArrayList<>();
            list.add(locationId);
            Lists.locationAreaList.put(areaId, list);
        } else {
            List<String> list = Lists.locationAreaList.get(areaId);
            list.add(locationId);
        }
    }
    public static void newRpgEntity(String entityId, String name, EntityType type, int baseXp, int baseHealth, int baseDamage, int baseDefense) {
        Lists.entityTypeList.put(entityId, type);
        Lists.baseHealthList.put(entityId, baseHealth);
        Lists.baseDamageList.put(entityId, baseDamage);
        Lists.baseDefenseList.put(entityId, baseDefense);
        Lists.entityExperienceList.put(entityId, baseXp);

        Lists.entityIds.add(entityId);
        Lists.entityNames.add(name);
        Lists.entityIdNamesList.put(entityId, name);
    }

}
