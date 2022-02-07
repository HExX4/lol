package de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Spawning;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization.Lists;
import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization.NormalEntity;
import de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Variables;
import de.lulwig.lulwig.rpgplugin.Api.Quests.Methods.NormalQuest;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitTask;

import java.util.ArrayList;
import java.util.List;

public class SpawnEntity extends NormalQuest {
    Main plugin;
    public SpawnEntity(Main main) {
        super(main);
        plugin = main;
    }


    public static void spawnEntity(String entityId, Location loc) {
        if (Lists.entityTypeList.get(entityId) != EntityType.PLAYER) {
            LivingEntity rpgEntity = (LivingEntity) loc.getWorld().spawnEntity(loc, Lists.entityTypeList.get(entityId));
            int maxhealth = Lists.baseHealthList.get(entityId);
            if (!rpgEntity.getType().equals(EntityType.ENDER_DRAGON)) {
                rpgEntity.setAI(Variables.entityAI);
            } else {
                rpgEntity.setAI(true);
            }
            rpgEntity.setInvulnerable(Variables.entityInvincible);
            rpgEntity.setCustomName(NormalEntity.entityName(entityId));
            rpgEntity.getPersistentDataContainer().set(NamespacedKey.minecraft("name"), PersistentDataType.STRING, entityId);
            rpgEntity.getPersistentDataContainer().set(NamespacedKey.minecraft("beginmaxhealth"), PersistentDataType.INTEGER, maxhealth);
            rpgEntity.setRemoveWhenFarAway(false);
        } else {
            Player p = (Player) loc.getWorld().spawnEntity(loc, Lists.entityTypeList.get(entityId));
            int maxhealth = Lists.baseHealthList.get(entityId);
            p.setAI(Variables.entityAI);
            p.setInvulnerable(Variables.entityInvincible);
            p.setCustomName(NormalEntity.entityName(entityId));
            p.getPersistentDataContainer().set(NamespacedKey.minecraft("name"), PersistentDataType.STRING, entityId);
            p.getPersistentDataContainer().set(NamespacedKey.minecraft("beginmaxhealth"), PersistentDataType.INTEGER, maxhealth);
        }
    }

    public void spawnEntity(String locationId) {
        Location loc = Lists.entityLocationList.get(locationId);
        String entityId = Lists.getEntityIdList.get(locationId);
        if (!loc.getChunk().isLoaded()) {
            loc.getChunk().load();
        }
        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            public void run() {
                if (Lists.entityTypeList.get(entityId) != EntityType.PLAYER) {
                    LivingEntity rpgEntity = (LivingEntity) loc.getWorld().spawnEntity(loc, Lists.entityTypeList.get(entityId));
                    int maxhealth = Lists.baseHealthList.get(entityId);
                    if (!rpgEntity.getType().equals(EntityType.ENDER_DRAGON)) {
                        rpgEntity.setAI(Variables.entityAI);
                        //Bukkit.broadcastMessage(rpgEntity.getType().name());
                    } else {
                        rpgEntity.setAI(true);
                    }
                    rpgEntity.setInvulnerable(Variables.entityInvincible);
                    rpgEntity.setCustomName(NormalEntity.entityName(entityId));
                    rpgEntity.getPersistentDataContainer().set(NamespacedKey.minecraft("name"), PersistentDataType.STRING, entityId);
                    rpgEntity.getPersistentDataContainer().set(NamespacedKey.minecraft("locationid"), PersistentDataType.STRING, locationId);
                    rpgEntity.getPersistentDataContainer().set(NamespacedKey.minecraft("beginmaxhealth"), PersistentDataType.INTEGER, maxhealth);
                    rpgEntity.setRemoveWhenFarAway(false);
                } else {
                    HumanEntity p = (HumanEntity) loc.getWorld().spawnEntity(loc, Lists.entityTypeList.get(entityId));
                    int maxhealth = Lists.baseHealthList.get(entityId);
                    p.setAI(Variables.entityAI);
                    p.setInvulnerable(Variables.entityInvincible);
                    p.setCustomName(NormalEntity.entityName(entityId));
                    p.getPersistentDataContainer().set(NamespacedKey.minecraft("name"), PersistentDataType.STRING, entityId);
                    p.getPersistentDataContainer().set(NamespacedKey.minecraft("locationid"), PersistentDataType.STRING, locationId);
                    p.getPersistentDataContainer().set(NamespacedKey.minecraft("beginmaxhealth"), PersistentDataType.INTEGER, maxhealth);
                }
            }
        }, 5L);
    }

    public void spawnArea(String areaId) {
        List<String> list = Lists.locationAreaList.get(areaId);

        for (String s : list) {
            spawnEntity(s);
        }
    }
    public void spawnAllAreas() {
        List<String> list = Lists.spawnAtBegin;

        for (String s : list) {
            spawnArea(s);
        }
    }
}