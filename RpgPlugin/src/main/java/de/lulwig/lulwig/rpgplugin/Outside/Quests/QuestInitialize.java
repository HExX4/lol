package de.lulwig.lulwig.rpgplugin.Outside.Quests;

import de.lulwig.lulwig.rpgplugin.Api.Quests.Methods.NormalQuest;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

public class QuestInitialize {

    public QuestInitialize() {

        //NormalQuest.newFindQuest("test2", "jeremy", "yaaaaay you found §bJeremy", "find §bJeremy");
        //NormalQuest.newBringEntitiesQuest("test1", "good you killed 3 Zombies", "kill 3 Zombies", entities);
        //NormalQuest.newBringItemsQuest("test3", "you found the Helmet and the weapon!", "find the Helmet and the weapon", itemList);

        List<String> entities = new ArrayList<>();
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        entities.add("moench");
        List<String> items = new ArrayList<>();
        items.add("Holz");
        items.add("Holz");
        List<String> items2 = new ArrayList<>();
        items.add("Joppis Holzschwert");
        List<String> items3 = new ArrayList<>();
        items3.add("Kackhaufen");
        items3.add("Kackhaufen");
        items3.add("Kackhaufen");
        List<String> entities2 = new ArrayList<>();
        entities2.add("dieb");
        entities2.add("dieb");
        entities2.add("dieb");
        entities2.add("dieb");
        entities2.add("dieb");
        entities2.add("dieb");
        entities2.add("dieb");
        entities2.add("dieb");
        List<String> entities3 = new ArrayList<>();
        entities3.add("spinne");
        entities3.add("spinne");
        entities3.add("spinne");
        entities3.add("spinne");
        entities3.add("spinne");
        entities3.add("spinne");
        entities3.add("spinne");
        entities3.add("spinne");
        List<String> items4 = new ArrayList<>();
        items4.add("Coin");
        List<String> entities4 = new ArrayList<>();
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        entities4.add("ork");
        List<String> entities5 = new ArrayList<>();
        entities5.add("drache");
        List<String> entities6 = new ArrayList<>();
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        entities6.add("ork");
        List<String> entities7 = new ArrayList<>();
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        entities7.add("spinne");
        List<String> entities8 = new ArrayList<>();
        entities8.add("spinne");
        entities8.add("spinne");
        entities8.add("spinne");
        entities8.add("spinne");
        entities8.add("spinne");
        entities8.add("spinne");
        entities8.add("spinne");
        entities8.add("spinne");
        entities8.add("spinne");
        entities8.add("spinne");
        entities8.add("spinne");
        List<String> entities9 = new ArrayList<>();
        entities9.add("ork");
        entities9.add("ork");
        entities9.add("ork");
        entities9.add("ork");
        entities9.add("ork");
        entities9.add("spinne");
        entities9.add("spinne");
        entities9.add("spinne");
        entities9.add("spinne");
        entities9.add("spinne");
        entities9.add("deilgagem");

        NormalQuest.newFindQuest("Wiederaufbau1", "harissa", "Danke für deine Hilfe, aber Ayoli ist auch verschwunden. Finde ihn bitte.", "Finde Harissa", null);
        NormalQuest.newFindQuest("Wiederaufbau2", "ayoli", "Wenn du jetzt noch Agave finden würdest, wären alle wieder da!", "Finde Ayoli", null);
        NormalQuest.newFindQuest("Wiederaufbau3", "agave", "Gehe nun zu Jeremy.", "Finde Agave", null);
        NormalQuest.newBringItemsQuest("Wiederaufbau4", "Danke, dass du uns hilfst. Gehe nun zu Fritz, er kann dir helfen.", "Kaufe 2 Holz bei Ryan", items, null);
        NormalQuest.newBringItemsQuest("Spurensuche1", "Danke die Banditen haben ein Lager oben an der Straße.", "Kaufe ein Holzschwert für Joppi bei Ryan", items2, null);
        NormalQuest.newBringItemsQuest("Spurensuche2", "Danke, ich glaube die Angreifer sind die Strße hoch, im Wald.", "füttere Fritzs Tiere und bringe ihm das Beweismaterial", items3, null);
        NormalQuest.newBringEntitiesQuest("Kampfkunst", "Gehe zur Hauptstadt. Dort kann man dir helfen.", "töte 14 Moenche im Dojo", entities, new Location(Bukkit.getServer().getWorld("rpg"), 428, 64, 255), "Poseidons Essstaebchen");
        NormalQuest.newFindQuest("What da dog doin?", "wuffi", "Wuff wuff", "finde Avas Hund Wuffi", null);
        NormalQuest.newBringEntitiesQuest("Wilde Jagd", "Dank dir sind die Straßen jetzt wieder sicher", "töte 8 Diebe", entities2, null, "");
        NormalQuest.newBringEntitiesQuest("tiefgehende Bedrohung", "Danke! jetzt können wir wieder Erz abbauen.", "töte 8 Spinnen", entities3, null, "");
        NormalQuest.newBringItemsQuest("Die Suche", "Im Norden is ein verlassener Stützpunkt, dort könnten die Monster sein. Viel Glück!", "gib Chadwick einen Coin", items4, new Location(Bukkit.getServer().getWorld("rpg"), 142, 63, -953));
        NormalQuest.newBringEntitiesQuest("Die Schlacht", "Suche nun Sven in der Hafenstadt.", "töte 20 Orks", entities4, new Location(Bukkit.getServer().getWorld("rpg"), 1183, 82, -147), "Kriegsaxt");
        NormalQuest.newBringEntitiesQuest("Jagdausflug", "AHH wir werden angegriffen. Schnell, informiere Joshua", "töte den Drachen am Ufer", entities5, null, "");
        NormalQuest.newBringEntitiesQuest("Bastion", "Du hast die Stadt gerettet! Dank dir sind wir sicher. Du solltest auch in der Sumpfstadt nach dem Rechten sehen.", "töte 30 Orks", entities6, new Location(Bukkit.getServer().getWorld("rpg"), -2315, 65, -295), "Zwergenaxt");
        NormalQuest.newBringEntitiesQuest("Falsche Freunde", "Du bist eine Bedrohung für den Magier! Du solltest sterben!", "töte Alle angreifer", entities7, new Location(Bukkit.getServer().getWorld("rpg"), 2912, 63, 140), "Edles Schwert");
        NormalQuest.newBringEntitiesQuest("Verhöhr", "Ich hoffe du warst erfolgreich. Ich bring dich jetzt zum König.", "finde und verhöhre die Spione", entities8, new Location(Bukkit.getServer().getWorld("rpg"), 304, 113, 205), "Brief");
        NormalQuest.newBringEntitiesQuest("Die letzte Schlacht", "cool du hast das spiel durchgespielt yaaay jetzt kannst du dich freuen", "töte den bösen Magier und seine Lakeien", entities9, null, "§r§5" + "ganz wichtiger Artifakt");
    }

}