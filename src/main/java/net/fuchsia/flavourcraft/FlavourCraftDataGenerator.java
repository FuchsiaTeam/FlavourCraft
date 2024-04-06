package net.fuchsia.flavourcraft;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fuchsia.flavourcraft.datagen.ModelProvider;
import net.fuchsia.flavourcraft.datagen.RecipeProvider;

public class FlavourCraftDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModelProvider::new);
		pack.addProvider(RecipeProvider::new);

	}
}
