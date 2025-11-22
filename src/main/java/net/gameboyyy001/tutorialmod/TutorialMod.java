package net.gameboyyy001.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.gameboyyy001.tutorialmod.block.ModBlocks;
import net.gameboyyy001.tutorialmod.item.ModItems;
import net.gameboyyy001.tutorialmod.item_groups.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();
    }
}