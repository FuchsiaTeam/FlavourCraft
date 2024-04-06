package net.fuchsia.flavourcraft.init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fuchsia.flavourcraft.FlavourCraft;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FCItems {
    public static final Item FRIED_EGG = registerItem("fried_egg", new Item(new FabricItemSettings().food(FoodComponents.APPLE)));


    public static void registerModItems()
    {
            ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(FCItems::addItemsToIngredientItemGroup);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
       entries.add(FRIED_EGG);
   }


    public static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(FlavourCraft.MOD_ID, name), item);
    }
}

