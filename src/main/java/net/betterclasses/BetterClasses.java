package net.betterclasses;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;



public class BetterClasses implements ModInitializer {

    private static final String MOD_ID = "betterclasses";

    public static final Item FABRIC_ITEM = new TestItem(new Item.Settings().group(ItemGroup.MISC));

    public static void registerItem(Item item, String identifier) {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, identifier), item);
    }

    @Override
    public void onInitialize() {
        registerItem(FABRIC_ITEM, "test_item");
    }
}
