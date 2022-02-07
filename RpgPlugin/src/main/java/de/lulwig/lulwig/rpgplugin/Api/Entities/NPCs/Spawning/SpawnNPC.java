package de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Spawning;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization.Lists;
import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization.NormalEntity;
import de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Lists.AllNPCList;
import de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Variables;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.BoundingBox;

import java.util.List;
import java.util.function.Predicate;

public class SpawnNPC {

    public static void spawnAllNPCs() {
        List<String> list = AllNPCList.allNPCsList;

        for (String s : list) {
            spawnNPC(s);
        }
    }

    public static void spawnNPC(String NPCiD) {
        Location loc = AllNPCList.NPClocations.get(NPCiD);
        if (!AllNPCList.nonVillagerEntityTypes.containsKey(NPCiD)) {

            Villager rpgEntity = (Villager) loc.getWorld().spawnEntity(loc, EntityType.VILLAGER);
            rpgEntity.setAI(false);
            rpgEntity.setInvulnerable(true);
            rpgEntity.setCustomName(AllNPCList.getNPCnames.get(NPCiD));
            rpgEntity.getPersistentDataContainer().set(NamespacedKey.minecraft("name"), PersistentDataType.STRING, NPCiD);
            rpgEntity.setProfession(AllNPCList.villagerProfession.get(NPCiD));
            rpgEntity.setVillagerType(AllNPCList.villagerBiomes.get(NPCiD));
            rpgEntity.setAgeLock(true);
            rpgEntity.getPersistentDataContainer().set(NamespacedKey.minecraft("npcid"), PersistentDataType.STRING, NPCiD);
            if (AllNPCList.villagerTrades.containsKey(NPCiD)) {
                rpgEntity.getPersistentDataContainer().set(NamespacedKey.minecraft("shop"), PersistentDataType.STRING, "true");
                rpgEntity.setRecipes(AllNPCList.villagerTrades.get(NPCiD));
            } else {
                rpgEntity.getPersistentDataContainer().set(NamespacedKey.minecraft("shop"), PersistentDataType.STRING, "false");
            }
            if (AllNPCList.isChild.get(NPCiD)) {
                rpgEntity.setBaby();
            } else {
                rpgEntity.setAdult();
            }
            rpgEntity.setRemoveWhenFarAway(false);
        } else {

            LivingEntity rpgEntity = (LivingEntity) loc.getWorld().spawnEntity(loc, AllNPCList.nonVillagerEntityTypes.get(NPCiD));
            rpgEntity.setAI(false);
            rpgEntity.setInvulnerable(true);
            rpgEntity.setCustomName(AllNPCList.getNPCnames.get(NPCiD));
            rpgEntity.getPersistentDataContainer().set(NamespacedKey.minecraft("name"), PersistentDataType.STRING, NPCiD);
            rpgEntity.getPersistentDataContainer().set(NamespacedKey.minecraft("npcid"), PersistentDataType.STRING, NPCiD);
            rpgEntity.setRemoveWhenFarAway(false);
        }
    }

}
