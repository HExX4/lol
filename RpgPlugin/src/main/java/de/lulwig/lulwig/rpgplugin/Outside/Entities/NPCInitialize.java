package de.lulwig.lulwig.rpgplugin.Outside.Entities;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization.NormalEntity;
import de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Initialization.NormalNPC;
import de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Spawning.SpawnNPC;
import de.lulwig.lulwig.rpgplugin.Api.Item.Lists.AllItemsList;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MerchantRecipe;

import java.util.ArrayList;
import java.util.List;

public class NPCInitialize {
    public NPCInitialize() {
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "harissa", "§5Harissa", "Wiederaufbau2", "Wiederaufbau1", Villager.Profession.NONE, Villager.Type.PLAINS, false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "ayoli", "§5Ayoli", "Wiederaufbau3", "Wiederaufbau2", Villager.Profession.NONE, Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "agave", "§5Agave", "", "Wiederaufbau3", Villager.Profession.NONE, Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "joppi", "§5Joppi  ", "Spurensuche1", "Spurensuche1", Villager.Profession.NONE, Villager.Type., true, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "fritz", "§5Fritz", "Spurensuche2", "Spurensuche2", Villager.Profession.FARMER, Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), -2340, 65, -261), "dela", "§6Dela", "Kampfkunst", "Kampfkunst", Villager.Profession.WEAPONSMITH, Villager.Type.SWAMP, false, "Wir helfen dir gerne im Kampf gegen die Monster,", "aber erst musst du unser Dojo von Monstern befreien.", "", "", "", "dojo");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "ava", "§5Ava", "What da dog doin?", "", Villager.Profession.NONE, Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "karl", "§5Karl", "Wilde Jagd", "Wilde Jagd", Villager.Profession.TOOLSMITH, Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "edward", "§5Edward", "Die letzte Schlacht", "", Villager.Profession.CARTOGRAPHER, Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "joshua", "§5Joshua", "Bastion", "Bastion", Villager.Profession.CLERIC, Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "braptor", "§5Braptor", "Falsche Freunde", "Falsche Freunde", Villager.Profession.FLETCHER, Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "bryan", "§5Bryan", "Wiederaufbau1", "", Villager.Profession.FLETCHER, Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "nick", "§5Nick", "tiefgehende Bedrohung", "tiefgehende Bedrohung", Villager.Profession., Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "chadwick", "§5Chadwick", "Die Suche", "Die Suche", Villager.Profession., Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "sven", "§5Sven", "Jagdausflug", "Jagdausflug", Villager.Profession., Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "ferdinand", "§5Ferdinand", "Bastion", "Bastion", Villager.Profession., Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "georg", "§5Georg", "Verhöhr", "Verhöhr", Villager.Profession., Villager.Type., false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "arthur", "§5Arthur", "Die Schlacht", "Die Schlacht", Villager.Profession., Villager.Type., false, "", "", "", "", "", "");

        SpawnNPC.spawnAllNPCs();
    }

    private List<MerchantRecipe> recipes() {
        List<MerchantRecipe> recipes = new ArrayList<>();
        MerchantRecipe recipe = new MerchantRecipe(AllItemsList.allItems.get(""), 1);
        ItemStack itemStack = AllItemsList.allItems.get("coin");
        itemStack.setAmount(0);
        recipe.addIngredient(itemStack);
        recipe.setExperienceReward(false);
        recipes.add(recipe);
        itemStack.setAmount(1);

        return recipes;
    }

}
