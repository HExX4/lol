package de.lulwig.lulwig.rpgplugin.Outside.Entities;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Initialization.NormalEntity;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;

import java.util.HashMap;

public class EntityInitialize {

    public EntityInitialize() {
        entities();
    }

    public void entities() {
        //NormalEntity.newRpgEntity("zombie", "Zombie", EntityType.ZOMBIE, 10, 20, 1, 1);
        //NormalEntity.addEntityLocation("zombie", "1", new Location(Bukkit.getServer().getWorld("rpg"), 337, 112, 207), "test", false);
        NormalEntity.newRpgEntity("ork", "Ork", EntityType.ZOMBIE, 10, 100, 10, 5);
        NormalEntity.newRpgEntity("moench", "Moench", EntityType.DROWNED, 15, 120, 15, 5);
        NormalEntity.newRpgEntity("dieb", "Dieb", EntityType.ENDERMAN, 20, 100, 20, 5);
        NormalEntity.newRpgEntity("spinne", "Spinne", EntityType.SPIDER, 30, 200, 20, 15);
        NormalEntity.newRpgEntity("tick", "Tick", EntityType.DONKEY, 1000, 1000, 1000, 1000);
        NormalEntity.newRpgEntity("trick", "Trick", EntityType.COW, 1000, 1000, 1000, 1000);
        NormalEntity.newRpgEntity("track", "Track", EntityType.SHEEP, 1000, 1000, 1000, 1000);
        NormalEntity.newRpgEntity("drache", "Drache", EntityType.ENDER_DRAGON, 50, 250, 1, 0);

        NormalEntity.newRpgEntity("granur", "Granur", EntityType.IRON_GOLEM, 100, 250, 35, 20);
        NormalEntity.newRpgEntity("slither", "Slither", EntityType.ENDERMAN, 200, 250, 50, 10);
        NormalEntity.newRpgEntity("deilgagem", "Deilgagem", EntityType.WITHER, 3000, 400, 80, 30);

        NormalEntity.addEntityLocation("moench", "1", new Location(Bukkit.getServer().getWorld("rpg"), -2437, 65, -306), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "2", new Location(Bukkit.getServer().getWorld("rpg"), -2437, 65, -308), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "3", new Location(Bukkit.getServer().getWorld("rpg"), -2437, 65, -310), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "4", new Location(Bukkit.getServer().getWorld("rpg"), -2437, 65, -312), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "5", new Location(Bukkit.getServer().getWorld("rpg"), -2437, 65, -314), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "6", new Location(Bukkit.getServer().getWorld("rpg"), -2437, 65, -316), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "7", new Location(Bukkit.getServer().getWorld("rpg"), -2437, 65, -318), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "8", new Location(Bukkit.getServer().getWorld("rpg"), -2437, 65, -320), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "9", new Location(Bukkit.getServer().getWorld("rpg"), -2437, 65, -304), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "10", new Location(Bukkit.getServer().getWorld("rpg"), -2442, 65, -312), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "11", new Location(Bukkit.getServer().getWorld("rpg"), -2442, 65, -306), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "12", new Location(Bukkit.getServer().getWorld("rpg"), -2442, 65, -304), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "13", new Location(Bukkit.getServer().getWorld("rpg"), -2442, 65, -318), "dojo", false, false);
        NormalEntity.addEntityLocation("moench", "14", new Location(Bukkit.getServer().getWorld("rpg"), -2442, 65, -320), "dojo", false, false);

        NormalEntity.addEntityLocation("ork", "15", new Location(Bukkit.getServer().getWorld("rpg"), -2265, 71, 1293), "angriffdorf", false, true);
        NormalEntity.addEntityLocation("ork", "16", new Location(Bukkit.getServer().getWorld("rpg"), -2275, 71, 1286), "angriffdorf", false, true);
        NormalEntity.addEntityLocation("ork", "17", new Location(Bukkit.getServer().getWorld("rpg"), -2280, 71, 1290), "angriffdorf", false, true);
        NormalEntity.addEntityLocation("ork", "18", new Location(Bukkit.getServer().getWorld("rpg"), -2288, 72, 1289), "angriffdorf", false, true);
        NormalEntity.addEntityLocation("ork", "19", new Location(Bukkit.getServer().getWorld("rpg"), -2281, 72, 1281), "angriffdorf", false, true);
        NormalEntity.addEntityLocation("ork", "20", new Location(Bukkit.getServer().getWorld("rpg"), -2279, 72, 1275), "angriffdorf", false, true);
        NormalEntity.addEntityLocation("ork", "21", new Location(Bukkit.getServer().getWorld("rpg"), -2286, 72, 1275), "angriffdorf", false, true);
        NormalEntity.addEntityLocation("ork", "22", new Location(Bukkit.getServer().getWorld("rpg"), -2289, 72, 1272), "angriffdorf", false, true);
        NormalEntity.addEntityLocation("ork", "23", new Location(Bukkit.getServer().getWorld("rpg"), -2265, 70, 1298), "angriffdorf", false, true);
        NormalEntity.addEntityLocation("ork", "24", new Location(Bukkit.getServer().getWorld("rpg"), -2299, 72, 1288), "angriffdorf", false, true);

        NormalEntity.addEntityLocation("tick", "a", new Location(Bukkit.getServer().getWorld("rpg"), -2264, 72, 1223), "tiere", false, true);
        NormalEntity.addEntityLocation("trick", "b", new Location(Bukkit.getServer().getWorld("rpg"), -2266, 72, 1224), "tiere", false, true);
        NormalEntity.addEntityLocation("track", "c", new Location(Bukkit.getServer().getWorld("rpg"), -2269, 72, 1223), "tiere", false, true);

        NormalEntity.addEntityLocation("dieb", "25", new Location(Bukkit.getServer().getWorld("rpg"), -2198, 73, 1120), "strasse", true, false);
        NormalEntity.addEntityLocation("dieb", "27", new Location(Bukkit.getServer().getWorld("rpg"), -2198, 73, 1126), "strasse", true, false);
        NormalEntity.addEntityLocation("dieb", "28", new Location(Bukkit.getServer().getWorld("rpg"), -2202, 73, 1122), "strasse", true, false);
        NormalEntity.addEntityLocation("dieb", "29", new Location(Bukkit.getServer().getWorld("rpg"), -2201, 73, 1125), "strasse", true, false);
        NormalEntity.addEntityLocation("dieb", "30", new Location(Bukkit.getServer().getWorld("rpg"), -2200, 74, 1119), "strasse", true, false);

        NormalEntity.addEntityLocation("spinne", "31", new Location(Bukkit.getServer().getWorld("rpg"), 219, 63, 113), "miene", true, false);
        NormalEntity.addEntityLocation("spinne", "32", new Location(Bukkit.getServer().getWorld("rpg"), 218, 63, 127), "miene", true, false);
        NormalEntity.addEntityLocation("spinne", "33", new Location(Bukkit.getServer().getWorld("rpg"), 222, 60, 135), "miene", true, false);
        NormalEntity.addEntityLocation("spinne", "34", new Location(Bukkit.getServer().getWorld("rpg"), 225, 60, 139), "miene", true, false);
        NormalEntity.addEntityLocation("spinne", "35", new Location(Bukkit.getServer().getWorld("rpg"), 231, 61, 137), "miene", true, false);
        NormalEntity.addEntityLocation("spinne", "36", new Location(Bukkit.getServer().getWorld("rpg"), 238, 64, 142), "miene", true, false);
        NormalEntity.addEntityLocation("spinne", "37", new Location(Bukkit.getServer().getWorld("rpg"), 234, 66, 136), "miene", true, false);
        NormalEntity.addEntityLocation("spinne", "38", new Location(Bukkit.getServer().getWorld("rpg"), 242, 63, 145), "miene", true, false);

        NormalEntity.addEntityLocation("dieb", "39", new Location(Bukkit.getServer().getWorld("rpg"), 261, 96, 329), "hauptstadt", false, false);
        NormalEntity.addEntityLocation("dieb", "40", new Location(Bukkit.getServer().getWorld("rpg"), 250, 96, 334), "hauptstadt", false, false);
        NormalEntity.addEntityLocation("dieb", "41", new Location(Bukkit.getServer().getWorld("rpg"), 256, 96, 333), "hauptstadt", false, false);
        NormalEntity.addEntityLocation("dieb", "42", new Location(Bukkit.getServer().getWorld("rpg"), 252, 96, 329), "hauptstadt", false, false);
        NormalEntity.addEntityLocation("dieb", "43", new Location(Bukkit.getServer().getWorld("rpg"), 248, 96, 332), "hauptstadt", false, false);
        NormalEntity.addEntityLocation("dieb", "44", new Location(Bukkit.getServer().getWorld("rpg"), 260, 96, 332), "hauptstadt", false, false);
        NormalEntity.addEntityLocation("dieb", "45", new Location(Bukkit.getServer().getWorld("rpg"), 263, 96, 325), "hauptstadt", false, false);
        NormalEntity.addEntityLocation("dieb", "46", new Location(Bukkit.getServer().getWorld("rpg"), 259, 96, 322), "hauptstadt", false, false);

        NormalEntity.addEntityLocation("ork", "47", new Location(Bukkit.getServer().getWorld("rpg"), 141, 63, -953), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "48", new Location(Bukkit.getServer().getWorld("rpg"), 142, 63, -951), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "49", new Location(Bukkit.getServer().getWorld("rpg"), 144, 64, -959), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "50", new Location(Bukkit.getServer().getWorld("rpg"), 149, 64, -965), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "51", new Location(Bukkit.getServer().getWorld("rpg"), 140, 65, -976), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "52", new Location(Bukkit.getServer().getWorld("rpg"), 148, 64, -981), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "53", new Location(Bukkit.getServer().getWorld("rpg"), 154, 64, -990), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "54", new Location(Bukkit.getServer().getWorld("rpg"), 145, 63, -995), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "55", new Location(Bukkit.getServer().getWorld("rpg"), 138, 65, -991), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "56", new Location(Bukkit.getServer().getWorld("rpg"), 142, 65, -1005), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "57", new Location(Bukkit.getServer().getWorld("rpg"), 152, 64, -1008), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "58", new Location(Bukkit.getServer().getWorld("rpg"), 148, 65, -1012), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "59", new Location(Bukkit.getServer().getWorld("rpg"), 141, 65, -1006), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "60", new Location(Bukkit.getServer().getWorld("rpg"), 115, 68, -991), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "61", new Location(Bukkit.getServer().getWorld("rpg"), 119, 68, -984), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "62", new Location(Bukkit.getServer().getWorld("rpg"), 124, 68, -985), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "63", new Location(Bukkit.getServer().getWorld("rpg"), 127, 67, -1000), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "64", new Location(Bukkit.getServer().getWorld("rpg"), 135, 66, -1004), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "65", new Location(Bukkit.getServer().getWorld("rpg"), 172, 63, -982), "stuetzpunkt", true, true);
        NormalEntity.addEntityLocation("ork", "67", new Location(Bukkit.getServer().getWorld("rpg"), 178, 63, -972), "stuetzpunkt", true, true);

        NormalEntity.addEntityLocation("drache", "68", new Location(Bukkit.getServer().getWorld("rpg"), 1227, 64, -337), "ufer", false, true);

        NormalEntity.addEntityLocation("ork", "69", new Location(Bukkit.getServer().getWorld("rpg"), 1114, 73, -250), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "70", new Location(Bukkit.getServer().getWorld("rpg"), 1119, 73, -251), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "71", new Location(Bukkit.getServer().getWorld("rpg"), 1112, 73, -249), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "72", new Location(Bukkit.getServer().getWorld("rpg"), 1117, 73, -242), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "73", new Location(Bukkit.getServer().getWorld("rpg"), 1111, 73, -240), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "74", new Location(Bukkit.getServer().getWorld("rpg"), 1123, 69, -239), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "75", new Location(Bukkit.getServer().getWorld("rpg"), 1122, 72, -256), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "76", new Location(Bukkit.getServer().getWorld("rpg"), 1125, 69, -247), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "77", new Location(Bukkit.getServer().getWorld("rpg"), 1102, 69, -230), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "78", new Location(Bukkit.getServer().getWorld("rpg"), 1104, 69, -222), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "79", new Location(Bukkit.getServer().getWorld("rpg"), 1114, 69, -220), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "80", new Location(Bukkit.getServer().getWorld("rpg"), 1126, 69, -221), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "81", new Location(Bukkit.getServer().getWorld("rpg"), 1116, 72, -232), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "82", new Location(Bukkit.getServer().getWorld("rpg"), 1117, 73, -258), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "83", new Location(Bukkit.getServer().getWorld("rpg"), 1115, 72, -265), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "84", new Location(Bukkit.getServer().getWorld("rpg"), 1111, 72, -262), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "85", new Location(Bukkit.getServer().getWorld("rpg"), 1102, 69, -268), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "86", new Location(Bukkit.getServer().getWorld("rpg"), 1098, 69, -262), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "87", new Location(Bukkit.getServer().getWorld("rpg"), 1093, 71, -266), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "88", new Location(Bukkit.getServer().getWorld("rpg"), 1085, 69, -261), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "89", new Location(Bukkit.getServer().getWorld("rpg"), 1087, 70, -250), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "90", new Location(Bukkit.getServer().getWorld("rpg"), 1085, 69, -237), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "91", new Location(Bukkit.getServer().getWorld("rpg"), 1077, 69, -234), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "92", new Location(Bukkit.getServer().getWorld("rpg"), 1089, 71, -228), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "93", new Location(Bukkit.getServer().getWorld("rpg"), 1069, 69, -236), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "94", new Location(Bukkit.getServer().getWorld("rpg"), 1065, 69, -235), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "95", new Location(Bukkit.getServer().getWorld("rpg"), 1063, 70, -248), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "96", new Location(Bukkit.getServer().getWorld("rpg"), 1050, 69, -251), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "97", new Location(Bukkit.getServer().getWorld("rpg"), 1055, 69, -257), "hafenstadt", false, false);
        NormalEntity.addEntityLocation("ork", "98", new Location(Bukkit.getServer().getWorld("rpg"), 1062, 69, -268), "hafenstadt", false, false);

        NormalEntity.addEntityLocation("granur", "y", new Location(Bukkit.getServer().getWorld("rpg"), 1121, 73, -247), "hafenstadt", false, false);

        NormalEntity.addEntityLocation("ork", "99", new Location(Bukkit.getServer().getWorld("rpg"), -2315, 65, -295), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "100", new Location(Bukkit.getServer().getWorld("rpg"), -2311, 65, -294), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "101", new Location(Bukkit.getServer().getWorld("rpg"), -2320, 65, -284), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "102", new Location(Bukkit.getServer().getWorld("rpg"), -2319, 65, -272), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "103", new Location(Bukkit.getServer().getWorld("rpg"), -2315, 65, -270), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "104", new Location(Bukkit.getServer().getWorld("rpg"), -2319, 65, -265), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "105", new Location(Bukkit.getServer().getWorld("rpg"), -2314, 65, -260), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "106", new Location(Bukkit.getServer().getWorld("rpg"), -2312, 65, -257), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "107", new Location(Bukkit.getServer().getWorld("rpg"), -2310, 68, -253), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "108", new Location(Bukkit.getServer().getWorld("rpg"), -2318, 65, -251), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "109", new Location(Bukkit.getServer().getWorld("rpg"), -2319, 65, -249), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "110", new Location(Bukkit.getServer().getWorld("rpg"), -2321, 65, -247), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "111", new Location(Bukkit.getServer().getWorld("rpg"), -2327, 65, -251), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "112", new Location(Bukkit.getServer().getWorld("rpg"), -2326, 65, -237), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "113", new Location(Bukkit.getServer().getWorld("rpg"), -2324, 65, -234), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "114", new Location(Bukkit.getServer().getWorld("rpg"), -2326, 65, -233), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "115", new Location(Bukkit.getServer().getWorld("rpg"), -2325, 65, -231), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "116", new Location(Bukkit.getServer().getWorld("rpg"), -2327, 65, -230), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "117", new Location(Bukkit.getServer().getWorld("rpg"), -2332, 65, -233), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "118", new Location(Bukkit.getServer().getWorld("rpg"), -2329, 65, -234), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "119", new Location(Bukkit.getServer().getWorld("rpg"), -2322, 65, -232), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "120", new Location(Bukkit.getServer().getWorld("rpg"), -2322, 65, -236), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "121", new Location(Bukkit.getServer().getWorld("rpg"), -2318, 65, -230), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "122", new Location(Bukkit.getServer().getWorld("rpg"), -2316, 65, -233), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "123", new Location(Bukkit.getServer().getWorld("rpg"), -2315, 65, -225), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "124", new Location(Bukkit.getServer().getWorld("rpg"), -2311, 65, -226), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "125", new Location(Bukkit.getServer().getWorld("rpg"), -2313, 65, -220), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "126", new Location(Bukkit.getServer().getWorld("rpg"), -2310, 65, -218), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "127", new Location(Bukkit.getServer().getWorld("rpg"), -2311, 65, -213), "sumpfstadt", false, false);
        NormalEntity.addEntityLocation("ork", "128", new Location(Bukkit.getServer().getWorld("rpg"), -2308, 65, -210), "sumpfstadt", false, false);

        NormalEntity.addEntityLocation("spinne", "129", new Location(Bukkit.getServer().getWorld("rpg"), 2932, 63, 118), "gefängnis", true, false);
        NormalEntity.addEntityLocation("spinne", "130", new Location(Bukkit.getServer().getWorld("rpg"), 2931, 63, 117), "gefängnis", true, false);
        NormalEntity.addEntityLocation("spinne", "131", new Location(Bukkit.getServer().getWorld("rpg"), 2932, 63, 108), "gefängnis", true, false);
        NormalEntity.addEntityLocation("spinne", "132", new Location(Bukkit.getServer().getWorld("rpg"), 2939, 63, 108), "gefängnis", true, false);
        NormalEntity.addEntityLocation("spinne", "133", new Location(Bukkit.getServer().getWorld("rpg"), 2939, 63, 114), "gefängnis", true, false);
        NormalEntity.addEntityLocation("spinne", "134", new Location(Bukkit.getServer().getWorld("rpg"), 2922, 63, 113), "gefängnis", true, false);
        NormalEntity.addEntityLocation("spinne", "135", new Location(Bukkit.getServer().getWorld("rpg"), 2917, 63, 108), "gefängnis", true, false);
        NormalEntity.addEntityLocation("spinne", "136", new Location(Bukkit.getServer().getWorld("rpg"), 2921, 63, 119), "gefängnis", true, false);
        NormalEntity.addEntityLocation("spinne", "137", new Location(Bukkit.getServer().getWorld("rpg"), 2923, 63, 104), "gefängnis", true, false);
        NormalEntity.addEntityLocation("spinne", "138", new Location(Bukkit.getServer().getWorld("rpg"), 2930, 65, 106), "gefängnis", true, false);
        NormalEntity.addEntityLocation("spinne", "139", new Location(Bukkit.getServer().getWorld("rpg"), 2929, 65, 120), "gefängnis", true, false);

        NormalEntity.addEntityLocation("slither", "x", new Location(Bukkit.getServer().getWorld("rpg"), 2940, 63, 113), "gefängnis", false, false);

        NormalEntity.addEntityLocation("ork", "140", new Location(Bukkit.getServer().getWorld("rpg"), 498, 80, -1940), "magierburg", false, false);
        NormalEntity.addEntityLocation("ork", "141", new Location(Bukkit.getServer().getWorld("rpg"), 498, 80, -1934), "magierburg", false, false);
        NormalEntity.addEntityLocation("ork", "142", new Location(Bukkit.getServer().getWorld("rpg"), 498, 80, -1928), "magierburg", false, false);
        NormalEntity.addEntityLocation("ork", "143", new Location(Bukkit.getServer().getWorld("rpg"), 498, 80, -1922), "magierburg", false, false);
        NormalEntity.addEntityLocation("ork", "144", new Location(Bukkit.getServer().getWorld("rpg"), 498, 80, -1916), "magierburg", false, false);
        NormalEntity.addEntityLocation("spinne", "145", new Location(Bukkit.getServer().getWorld("rpg"), 509, 80, -1916), "magierburg", false, false);
        NormalEntity.addEntityLocation("spinne", "146", new Location(Bukkit.getServer().getWorld("rpg"), 509, 80, -1922), "magierburg", false, false);
        NormalEntity.addEntityLocation("spinne", "147", new Location(Bukkit.getServer().getWorld("rpg"), 509, 80, -1928), "magierburg", false, false);
        NormalEntity.addEntityLocation("spinne", "148", new Location(Bukkit.getServer().getWorld("rpg"), 509, 80, -1934), "magierburg", false, false);
        NormalEntity.addEntityLocation("spinne", "149", new Location(Bukkit.getServer().getWorld("rpg"), 509, 80, -1940), "magierburg", false, false);

        NormalEntity.addEntityLocation("deilgagem", "z", new Location(Bukkit.getServer().getWorld("rpg"), 501, 67, -1921), "magierburg", false, false);

        NormalEntity.addEntityLocation("spinne", "150", new Location(Bukkit.getServer().getWorld("rpg"), -2315, 69, -225), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "151", new Location(Bukkit.getServer().getWorld("rpg"), -2313, 69, -218), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "152", new Location(Bukkit.getServer().getWorld("rpg"), -2310, 71, -222), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "153", new Location(Bukkit.getServer().getWorld("rpg"), -2308, 69, -228), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "154", new Location(Bukkit.getServer().getWorld("rpg"), -2310, 69, -236), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "155", new Location(Bukkit.getServer().getWorld("rpg"), -2315, 69, -234), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "156", new Location(Bukkit.getServer().getWorld("rpg"), -2320, 69, -232), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "157", new Location(Bukkit.getServer().getWorld("rpg"), -2312, 69, -216), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "158", new Location(Bukkit.getServer().getWorld("rpg"), -2308, 69, -210), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "159", new Location(Bukkit.getServer().getWorld("rpg"), -2303, 70, -209), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "160", new Location(Bukkit.getServer().getWorld("rpg"), -2316, 71, -240), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "161", new Location(Bukkit.getServer().getWorld("rpg"), -2299, 69, -252), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "162", new Location(Bukkit.getServer().getWorld("rpg"), -2322, 65, -249), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "163", new Location(Bukkit.getServer().getWorld("rpg"), -2318, 73, -225), "fürstverrat", false, false);
        NormalEntity.addEntityLocation("spinne", "164", new Location(Bukkit.getServer().getWorld("rpg"), -2315, 71, -217), "fürstverrat", false, false);
    }

}
