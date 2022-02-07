package de.lulwig.lulwig.rpgplugin;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Spawning.SpawnEntity;
import de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Spawning.SpawnNPC;
import de.lulwig.lulwig.rpgplugin.Api.Entities.Player.Players;
import de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Commands.*;
import de.lulwig.lulwig.rpgplugin.Api.GeneralStuff.Listeners.*;
import de.lulwig.lulwig.rpgplugin.Api.Leveling.Level;
import de.lulwig.lulwig.rpgplugin.Outside.OutsideMain;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        FileConfiguration config = getConfig();

        config.options().copyDefaults(true);
        saveConfig();

        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");

        PluginManager manager = Bukkit.getPluginManager();
        manager.registerEvents(new JoinQuitListener(this), this);
        manager.registerEvents(new EntityRespawnListener(this), this);
        manager.registerEvents(new EntityDamageListener(this), this);
        manager.registerEvents(new NPCInteractListener(this), this);
        manager.registerEvents(new GeneralListener(), this);
        //manager.registerEvents(new );
        getCommand("hub").setExecutor(new HubCommand(this));
        getCommand("everyhub").setExecutor(new EveryHubCommand(this));
        getCommand("giverpg").setExecutor(new GiveRpgCommand());
        getCommand("giverpg").setTabCompleter(new GiveRpgTabCompleter());
        getCommand("config").setExecutor(new ConfigCommand(this));
        getCommand("config").setTabCompleter(new ConfigTabCompleter());
        getCommand("level").setExecutor(new LevelCommand(this));
        getCommand("spawnentity").setExecutor(new SpawnEntityCommand(this));
        getCommand("spawnentity").setTabCompleter(new SpawnEntityTabCompleter());
        getCommand("entityrespawn").setExecutor(new EntityRespawnCommand());
        getCommand("entityrespawn").setTabCompleter(new EntityRespawnTabCompleter());

        new Level(this);
        new de.lulwig.lulwig.rpgplugin.Outside.Leveling.Level(this);
        new Players(this);
        new SpawnEntity(this);

        new OutsideMain(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
