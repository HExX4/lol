package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Listeners;

import de.lulwig.lulwig.rpgplugin.Api.Item.Methods.NormalItem;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityBreedEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntityTransformEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.persistence.PersistentDataType;

public class GeneralListener implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        //e.setCancelled(true);
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        e.getEntity().getWorld().setSpawnLocation(e.getEntity().getLocation());
    }

    @EventHandler
    public void onZombieChange(EntityTransformEvent e) {
        if (e.getTransformReason().equals(EntityTransformEvent.TransformReason.DROWNED)) {
            e.setCancelled(true);
        }
    }

    public static void onFeedAnimal(PlayerInteractEntityEvent e) {
        Entity entity = e.getRightClicked();
        Player p = e.getPlayer();
        String entityId = entity.getPersistentDataContainer().get(NamespacedKey.minecraft("name"), PersistentDataType.STRING);
         if (entityId.equals("tick") || entityId.equals("trick") || entityId.equals("track")) {
             if (e.getHand().equals(EquipmentSlot.HAND)) {
                 if (p.getInventory().getItemInMainHand().equals(NormalItem.getItem("Weizen"))) {
                     p.getInventory().addItem(NormalItem.getItem("Kackhaufen"));
                 }
             }
         }
    }
}
