package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Listeners;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization.Lists;
import de.lulwig.lulwig.rpgplugin.Api.Entities.Player.Players;
import de.lulwig.lulwig.rpgplugin.Api.Item.Lists.AllItemsList;
import de.lulwig.lulwig.rpgplugin.Api.Item.Lists.AttributeList;
import de.lulwig.lulwig.rpgplugin.Api.Item.Methods.NormalItem;
import de.lulwig.lulwig.rpgplugin.Api.Leveling.Level;
import de.lulwig.lulwig.rpgplugin.Api.Quests.Methods.NormalQuest;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;

import java.text.DecimalFormat;
import java.util.Random;

public class EntityDamageListener extends NormalQuest implements Listener {
    public EntityDamageListener(Main plugin) {
        super(plugin);
    }

    public double currentHpCalculate(Entity entity, int maxHealth) {
        if (entity.getPersistentDataContainer().get(NamespacedKey.minecraft("beginhealth"), PersistentDataType.DOUBLE) != null) {
            // the entity has the thing
            return entity.getPersistentDataContainer().get(NamespacedKey.minecraft("beginhealth"), PersistentDataType.DOUBLE);
        } else {
            // the entity doesn't have the thing
            return maxHealth;
        }
    }
    public double weaponDmg(Player p, int defense) {
        ItemStack itemInMainHand = p.getInventory().getItemInMainHand();
        if (itemInMainHand.getType() == Material.AIR || !AttributeList.attributes.containsKey(itemInMainHand)) {
            return getbaseDamage(p);
        } else {
            if (!itemInMainHand.getItemMeta().getDisplayName().equals("§r§5" + "ganz wichtiger Artifakt")) {
                return AttributeList.attributes.get(itemInMainHand) + getbaseDamage(p);
            } else {
                return 1 + defense;
            }
        }
    }
    public double damage(int defense, double weaponDmg) {
        if (weaponDmg - defense <= 0) {
            return 0;
        } else {
            return weaponDmg - defense;
        }
    }

    public void onPlayerAttacksNormalEntity(EntityDamageByEntityEvent e) {
        Entity damager = e.getDamager();
        LivingEntity entity = (LivingEntity) e.getEntity();
        if (!entity.hasAI()) {
            entity.setAI(true);
        }
        String entityId = entity.getPersistentDataContainer().get(NamespacedKey.minecraft("name"), PersistentDataType.STRING);
        // the damager is a Player and the hp of the attacked entity has to be multiplied
        Player p = (Player) damager;
        int level = getLevel(p);
        int defense = Lists.baseDefenseList.get(entityId);
        double weaponDmg = weaponDmg(p, defense);
        double eventDamage = damage(defense, weaponDmg);

        String OgName = Lists.entityIdNamesList.get(entityId);
        int maxhealth = entity.getPersistentDataContainer().get(NamespacedKey.minecraft("beginmaxhealth"), PersistentDataType.INTEGER);
        int entitymaxhealth = Lists.baseHealthList.get(entityId);
        int maxHP = entitymaxhealth * level;
        double beginHP = currentHpCalculate(entity, maxhealth);
        double percentage = beginHP / maxhealth;
        double newHP = maxHP * percentage;
        double currentHP;

        currentHP = newHP - eventDamage;
            /*Bukkit.broadcastMessage("§6level = §9" + level);
            Bukkit.broadcastMessage("§6defense = §5" + "1 * " + level + " = §9" + defense);
            Bukkit.broadcastMessage("§6weaponDmg = §5" + "weapon.damage * strength = §9" + weaponDmg);
            Bukkit.broadcastMessage("§6eventDamage = §9" + eventDamage);
            Bukkit.broadcastMessage("§6OgName = §9" + OgName);
            Bukkit.broadcastMessage("§6maxhealth = §9" + maxhealth);
            Bukkit.broadcastMessage("§6entitymaxhealth = §9" + entitymaxhealth);
            Bukkit.broadcastMessage("§6maxHP = §5" + entitymaxhealth + " * " + level + " = §9" + maxHP);
            Bukkit.broadcastMessage("§6beginHP = §9" + beginHP);
            //Bukkit.broadcastMessage("§6percentage = §5" + beginHP + " / " + maxhealth + " = §9" + percentage);
            //Bukkit.broadcastMessage("§6newHP = §5" + maxHP + " * " + percentage + " = §9" + newHP);
            Bukkit.broadcastMessage("§6currentHP = §5" + newHP + " - " + eventDamage + " = §9" + currentHP);*/


        String name = "§9" + OgName + " §a" + currentHP + "§7/§6" + maxHP;
        entity.getPersistentDataContainer().set(NamespacedKey.minecraft("beginhealth"), PersistentDataType.DOUBLE, currentHP);
        entity.getPersistentDataContainer().set(NamespacedKey.minecraft("beginmaxhealth"), PersistentDataType.INTEGER, maxHP);
        entity.setCustomName(name);

        if (currentHP <= 0) {
            onXpGet(p, Lists.entityExperienceList.get(entityId));
            Random random = new Random();
            int randNum = random.nextInt(2);
            if (randNum == 1) {
                p.getInventory().addItem(NormalItem.getItem("coin"));
            }
            // by a specific chance it's gonna drop a coin
            LivingEntity entity1 = entity;
            entity1.setHealth(0);
            if (getEntitiesToFind(p).contains(entityId)) {
                String questName = getActiveQuests(p).get(0);
                tickOffEntity(p, questName, entityId);
            }
        }
    }
    public void onEntityAttacksPlayer(EntityDamageByEntityEvent e) {
        // the damager is not a Player and we only have to change the hp not subtract anything from it because it didn't take damage
        Entity damager = e.getDamager();
        Player p = (Player) e.getEntity();
        String entityId = damager.getPersistentDataContainer().get(NamespacedKey.minecraft("name"), PersistentDataType.STRING);
        // the damager is a Player and the hp of the attacked entity has to be multiplied
        int level = getLevel(p);

        String OgName = Lists.entityIdNamesList.get(entityId);
        int maxhealth = damager.getPersistentDataContainer().get(NamespacedKey.minecraft("beginmaxhealth"), PersistentDataType.INTEGER);
        int entitymaxhealth = Lists.baseHealthList.get(entityId);
        int maxHP = entitymaxhealth * level;
        // and we have to subtract the damage from the hp
        double beginHP = currentHpCalculate(damager, maxhealth);
        double percentage = beginHP / maxhealth;
        double newHP = maxHP * percentage;
            /*Bukkit.broadcastMessage("§6level = §9" + level);
            Bukkit.broadcastMessage("§6defense = §5" + "1 * " + level + " = §9" + defense);
            Bukkit.broadcastMessage("§6weaponDmg = §5" + "weapon.damage * strength = §9" + weaponDmg);
            Bukkit.broadcastMessage("§6eventDamage = §9" + eventDamage);
            Bukkit.broadcastMessage("§6OgName = §9" + OgName);
            Bukkit.broadcastMessage("§6maxhealth = §9" + maxhealth);
            Bukkit.broadcastMessage("§6entitymaxhealth = §9" + entitymaxhealth);
            Bukkit.broadcastMessage("§6maxHP = §5" + entitymaxhealth + " * " + level + " = §9" + maxHP);
            Bukkit.broadcastMessage("§6beginHP = §9" + beginHP);
            Bukkit.broadcastMessage("§6percentage = §5" + beginHP + " / " + maxhealth + " = §9" + percentage);
            Bukkit.broadcastMessage("§6newHP = §5" + maxHP + " * " + percentage + " = §9" + newHP);
            Bukkit.broadcastMessage("§6currentHP = §5" + newHP + " - " + eventDamage + " = §9" + currentHP);
            */
        String name = "§9" + OgName + " §a" + newHP + "§7/§6" + maxHP;
        damager.getPersistentDataContainer().set(NamespacedKey.minecraft("beginhealth"), PersistentDataType.DOUBLE, newHP);
        damager.getPersistentDataContainer().set(NamespacedKey.minecraft("beginmaxhealth"), PersistentDataType.INTEGER, maxHP);
        damager.setCustomName(name);
        double damage;
        if (damager instanceof EnderDragon) {
            damage = 1;
        } else {
            damage = Lists.baseDamageList.get(entityId) + level - getFullDefense(p);
        }
        //Bukkit.broadcastMessage("§6damage: §9" + damage);
        lowerHealth(p, damage);
        // here we have to put the code to subtract lives from ourselves
    }
    public void onPlayerAttacksBossEntity(EntityDamageByEntityEvent e) {}

    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent e) {
        e.setCancelled(true);
        Entity damager = e.getDamager();
        Entity entity = e.getEntity();
        //String entityId = entity.getPersistentDataContainer().get(NamespacedKey.minecraft("name"), PersistentDataType.STRING);

        if (damager instanceof Player && !entity.isInvulnerable()) {
            if (entity.getPersistentDataContainer().get(NamespacedKey.minecraft("boss"), PersistentDataType.STRING) == null) {
                onPlayerAttacksNormalEntity(e);
            } else {
                onPlayerAttacksBossEntity(e);
            }
        } else if (!(damager instanceof Player) && entity instanceof Player) {
            onEntityAttacksPlayer(e);
        }

    }

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            e.setCancelled(true);
        }
    }

}
