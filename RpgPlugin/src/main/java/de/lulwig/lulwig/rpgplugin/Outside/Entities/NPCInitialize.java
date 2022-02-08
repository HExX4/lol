package de.lulwig.lulwig.rpgplugin.Outside.Entities;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization.NormalEntity;
import de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Initialization.NormalNPC;
import de.lulwig.lulwig.rpgplugin.Api.Entities.NPCs.Spawning.SpawnNPC;
import de.lulwig.lulwig.rpgplugin.Api.Item.Lists.AllItemsList;
import de.lulwig.lulwig.rpgplugin.Api.Item.Methods.NormalItem;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.MerchantRecipe;

import java.util.ArrayList;
import java.util.List;

public class NPCInitialize {
    public NPCInitialize() {
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "harissa", "§5Harissa", "Wiederaufbau2", "Wiederaufbau1", Villager.Profession.NONE, Villager.Type.PLAINS, false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "ayoli", "§5Ayoli", "Wiederaufbau3", "Wiederaufbau2", Villager.Profession.NONE, Villager.Type.PLAINS, false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "agave", "§5Agave", "", "Wiederaufbau3", Villager.Profession.NONE, Villager.Type.PLAINS, false, "", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "joppi", "§5Joppi  ", "Spurensuche1", "Spurensuche1", Villager.Profession.NONE, Villager.Type.PLAINS, true, "Wenn du mir ein Schwert kaufst, sag ich dir wo die Halunken sind!", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "fritz", "§5Fritz", "Spurensuche2", "Spurensuche2", Villager.Profession.FARMER, Villager.Type.PLAINS, false, "Ich habe eine Idee, wo die Angreifer sind.", "Könntest du davor meine Tiere füttern?", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), -2340, 65, -261), "dela", "§6Dela", "Kampfkunst", "Kampfkunst", Villager.Profession.WEAPONSMITH, Villager.Type.SWAMP, false, "Wir helfen dir gerne im Kampf gegen die Monster,", "aber erst musst du unser Dojo von Monstern befreien.", "", "", "", "dojo");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "ava", "§5Ava", "What da dog doin?", "", Villager.Profession.NONE, Villager.Type.SAVANNA, true, "Ich habe meinen Hund verloren.", "Kannst du mir helfen ihn wiederzufinden?", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "karl", "§5Karl", "Wilde Jagd", "Wilde Jagd", Villager.Profession.TOOLSMITH, Villager.Type.SAVANNA, false, "Diese verdammten Diebe machen die Stadt unsicher.", "Kannst du sie jagen?", "", "", "", "hauptstadt");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "edward", "§5Edward", "Die letzte Schlacht", "", Villager.Profession.CARTOGRAPHER, Villager.Type.SAVANNA, false, "Du hast herausgefunden wer das Königreich bedroht?", "Hier hast du königliche Ausrüstung, besiege diesen Magier!", "", "", "", "magierburg");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "joshua", "§5Joshua", "Bastion", "Bastion", Villager.Profession.CLERIC, Villager.Type.SNOW, false, "Danke, dass du gekommen bist, um uns zu warnen.", "Du musst uns helfen die Stadt zu verteidigen", "", "", "", "hafenstadt");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "braptor", "§5Braptor", "Falsche Freunde", "Falsche Freunde", Villager.Profession.FLETCHER, Villager.Type.SWAMP, false, "Mal sehen wie du gegen diese Monster ankommst!", "", "", "", "", "fürstverrat");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "bryan", "§5Bryan", "Wiederaufbau1", "", Villager.Profession.FLETCHER, Villager.Type.PLAINS, false, "Ich brauche deine Hilfe!", "Kannst du Harissa wiederfinden?", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "nick", "§5Nick", "tiefgehende Bedrohung", "tiefgehende Bedrohung", Villager.Profession.MASON, Villager.Type.SAVANNA, false, "In der Miene sind Monster.", "Bitte beseitige sie.", "", "", "", "miene");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "chadwick", "§5Chadwick", "Die Suche", "Die Suche", Villager.Profession.ARMORER, Villager.Type.SWAMP, false, "Gib mir einen Coin, dann helfe ich dir.", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "sven", "§5Sven", "Jagdausflug", "Jagdausflug", Villager.Profession.FLETCHER, Villager.Type.TAIGA, false, "Bevor ich dich zum fürsten vorlasse musst du beweisen, dass du würdig bist.", "töte das Monster am anderen Ufer", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "georg", "§5Georg", "Verhöhr", "Verhöhr", Villager.Profession.WEAPONSMITH, Villager.Type.SAVANNA, false, "Der Spion ist in einer der Zellen. Viel Glück!", "", "", "", "", "gefängnis");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "jeremy", "§5Jeremy", "Wiederaufbau4", "Wiederaufbau4", Villager.Profession.MASON, Villager.Type.PLAINS, false, "Kannst du ein bisschen Holz bei Ryan für uns kaufen?", "", "", "", "", "");
        NormalNPC.newNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "arthur", "§5Arthur", "Die Schlacht", "Die Schlacht", Villager.Profession.WEAPONSMITH, Villager.Type.SAVANNA, false, "Töte bitte ein paar dieser Angreifer.", "Ich schaffe das alleine nicht.", "", "", "", "");

        NormalNPC.newAnimalNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "wuffi", "§6Wuffi", "", "What da dog doin?", EntityType.WOLF, "Wuff wuff", "", "", "", "", "");

        NormalNPC.newShopNPC(new Location(Bukkit.getServer().getWorld("rpg"), , , ), "ryan", "§6Ryan", recipes(), Villager.Profession.FLETCHER, Villager.Type.PLAINS, false, "", "", "", "", "", "");

        SpawnNPC.spawnAllNPCs();
    }

    private List<MerchantRecipe> recipes() {
        List<MerchantRecipe> recipes = new ArrayList<>();
        MerchantRecipe recipe = new MerchantRecipe(NormalItem.getItem("Holz"), 2);
        MerchantRecipe recipe2 = new MerchantRecipe(NormalItem.getItem("Weizen"), 1);
        MerchantRecipe recipe3 = new MerchantRecipe(NormalItem.getItem("Joppis Holzschwert"), 1);
        ItemStack itemStack = AllItemsList.allItems.get("coin");
        itemStack.setAmount(1);
        recipe.addIngredient(itemStack);
        recipe.setExperienceReward(false);
        recipe2.addIngredient(itemStack);
        recipe2.setExperienceReward(false);
        recipe3.addIngredient(itemStack);
        recipe3.setExperienceReward(false);
        recipes.add(recipe);
        recipes.add(recipe2);
        recipes.add(recipe3);
        itemStack.setAmount(1);

        return recipes;
    }

}
