package net.fuchsia.flavourcraft;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fuchsia.flavourcraft.init.FCItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FCItemGroups {

    public static final ItemGroup COOKED = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FlavourCraft.MOD_ID, "fc_cooked"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fc_cooked"))
                    .icon(() -> new ItemStack(FCItems.FRIED_EGG.asItem())).entries((displayContext, entries) -> {
                        entries.add(FCItems.FRIED_EGG);



                    }).build());


    public static void registerItemGroups() {
        FlavourCraft.LOGGER.info("Registering Item Groups for " + FlavourCraft.MOD_ID);
    }

}
