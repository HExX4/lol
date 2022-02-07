package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Listeners;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization.Lists;
import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Spawning.SpawnEntity;
import de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Variables;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataType;

public class EntityRespawnListener extends SpawnEntity implements Listener {

    public EntityRespawnListener(Main main) {
        super(main);
    }

    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        //Bukkit.broadcastMessage("§9DeathEvent §6Triggered");
        String locationTag = e.getEntity().getPersistentDataContainer().get(NamespacedKey.minecraft("locationid"), PersistentDataType.STRING);
        //Bukkit.broadcastMessage(locationTag);

        if (!(e.getEntity() instanceof Player) && Variables.entityRespawn) {
            if (locationTag != null && Lists.entityRespawn.get(locationTag)) {
                spawnEntity(locationTag);
            } else {
                //Bukkit.broadcastMessage("§cthis entity has no locationId");
                //that is only while I'm programming, we can put it out at the end.
            }
        }
    }

}
