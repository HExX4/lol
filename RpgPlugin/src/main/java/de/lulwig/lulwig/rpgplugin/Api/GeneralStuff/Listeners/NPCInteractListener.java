package de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Listeners;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Spawning.SpawnEntity;
import de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Lists.AllNPCList;
import de.lulwig.lulwig.rpgplugin.Api.Quests.Lists.QuestList;
import de.lulwig.lulwig.rpgplugin.Api.Quests.Methods.NormalQuest;
import de.lulwig.lulwig.rpgplugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.awt.geom.GeneralPath;
import java.util.List;

public class NPCInteractListener extends SpawnEntity implements Listener {

    Main plugin;

    public NPCInteractListener(Main main) {
        super(main);
        plugin = main;
    }

    @EventHandler
    public void onInteract(PlayerInteractEntityEvent e) {
        if (e.getHand().equals(EquipmentSlot.HAND)) {
            Entity entity = e.getRightClicked();
            Player p = e.getPlayer();
            if (entity.isInvulnerable()) {
                String NPCiD = entity.getPersistentDataContainer().get(NamespacedKey.minecraft("npcid"), PersistentDataType.STRING);
                if (!AllNPCList.villagerTrades.containsKey(NPCiD)) {
                    e.setCancelled(true);
                }
                List<String> list = AllNPCList.conversations.get(NPCiD);
                String name = AllNPCList.getNPCnames.get(NPCiD);

                long delay = 0;

                if (AllNPCList.checkQuestNames.containsKey(NPCiD)) {
                    String checkQuest = AllNPCList.checkQuestNames.get(NPCiD);
                    if (getDone(p, checkQuest)) {
                        doneQuest(p, checkQuest);
                        p.sendMessage("§8[" + name + "§8] §7" + QuestList.doneDialogs.get(checkQuest));
                        p.teleport(AllNPCList.tpWhenDone.get(checkQuest));
                    } else if (!getDone(p, checkQuest)) {
                        if (QuestList.findNPCQuests.containsKey(checkQuest) && getActiveQuests(p).contains(checkQuest) && QuestList.findNPCQuests.get(checkQuest).equals(NPCiD)) {
                            doneQuest(p, checkQuest);
                        } else {
                            for (String s : list) {
                                long delay2 = delay + 5L;
                                Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> p.sendMessage("§8[" + name + "§8] §7" + s), delay2);
                            }
                        }
                    }
                } else {
                    for (String s : list) {
                        long delay2 = delay + 5L;
                        Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, () -> p.sendMessage("§8[" + name + "§8] §7" + s), delay2);
                    }
                }

                //p.sendMessage("AllNPCList.tellQuestNames.containsKey(NPCiD) §6" + Boolean.toString(AllNPCList.tellQuestNames.containsKey(NPCiD)));
                //p.sendMessage("!getDone(p, AllNPCList.tellQuestNames.get(NPCiD)) §6" + Boolean.toString(!getDone(p, AllNPCList.tellQuestNames.get(NPCiD))));

                if (AllNPCList.tellQuestNames.containsKey(NPCiD) && !getDone(p, AllNPCList.tellQuestNames.get(NPCiD))) {
                    if (getActiveQuests(p).isEmpty()) {
                        activateQuest(p, AllNPCList.tellQuestNames.get(NPCiD));
                        if (AllNPCList.areaIds.containsKey(NPCiD)) {
                            spawnArea(AllNPCList.areaIds.get(NPCiD));
                        }
                    } else {
                        p.sendMessage("§8[§c" + "Achtung" + "§8] §7" + "du hast noch eine Quest am laufen, bitte beende diese davor.");
                    }
                }
            } else {
                GeneralListener.onFeedAnimal(e);
            }
        }
    }
}
