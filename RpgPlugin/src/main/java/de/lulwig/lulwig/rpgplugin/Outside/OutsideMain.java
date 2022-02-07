package de.lulwig.lulwig.rpgplugin.Outside;

import de.lulwig.lulwig.rpgplugin.Api.Entities.Entities.Spawning.SpawnEntity;
import de.lulwig.lulwig.rpgplugin.Main;
import de.lulwig.lulwig.rpgplugin.Outside.Entities.EntityInitialize;
import de.lulwig.lulwig.rpgplugin.Outside.Entities.NPCInitialize;
import de.lulwig.lulwig.rpgplugin.Outside.Item.ItemInitialize;
import de.lulwig.lulwig.rpgplugin.Outside.Quests.QuestInitialize;

public class OutsideMain extends SpawnEntity {

    public OutsideMain(Main main) {
        super(main);
        new ItemInitialize();
        new EntityInitialize();
        new NPCInitialize();
        new QuestInitialize();
        spawnAllAreas();
    }

}
