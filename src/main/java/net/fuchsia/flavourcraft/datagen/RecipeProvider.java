package net.fuchsia.flavourcraft.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fuchsia.flavourcraft.init.FCItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class RecipeProvider extends FabricRecipeProvider  {

    private static final List<ItemConvertible> EGG_SMELTABLES = List.of(Items.EGG);
    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, EGG_SMELTABLES, RecipeCategory.MISC, FCItems.FRIED_EGG, 0.1f,40,"egg");

    }
}
