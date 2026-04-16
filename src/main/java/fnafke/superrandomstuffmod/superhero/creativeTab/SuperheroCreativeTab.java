package fnafke.superrandomstuffmod.superhero.creativeTab;

import fnafke.superrandomstuffmod.SuperRandomStuffMod;
import fnafke.superrandomstuffmod.superhero.item.SuperheroItems;
import fnafke.superrandomstuffmod.superhero.item.SuperheroPotions;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.component.ItemLore;
import net.minecraft.world.level.ItemLike;

import java.util.List;

public class SuperheroCreativeTab {
    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(),
            Identifier.fromNamespaceAndPath(SuperRandomStuffMod.MOD_ID,
                    "creative_tab")
    );

    public static final CreativeModeTab CUSTOM_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(Items.DIAMOND_HOE))
            .title(Component.translatable("creativeTab.superrandomstuffmod.superhero"))
            .displayItems((params, output) -> {
                output.accept(SuperheroItems.TESTING_ITEM);

                ItemStack potion = new ItemStack(Items.POTION);
                potion.set(DataComponents.POTION_CONTENTS, new PotionContents(SuperheroPotions.TESTING_POTION));
                output.accept(potion);

                ItemStack splashPotion = new ItemStack(Items.SPLASH_POTION);
                splashPotion.set(DataComponents.POTION_CONTENTS, new PotionContents(SuperheroPotions.TESTING_POTION));
                output.accept(splashPotion);

                ItemStack lingeringPotion = new ItemStack(Items.LINGERING_POTION);
                lingeringPotion.set(DataComponents.POTION_CONTENTS, new PotionContents(SuperheroPotions.TESTING_POTION));
                output.accept(lingeringPotion);

                ItemStack potionArrow = new ItemStack(Items.TIPPED_ARROW);
                potionArrow.set(DataComponents.POTION_CONTENTS, new PotionContents(SuperheroPotions.TESTING_POTION));
                output.accept(potionArrow);

                // And custom ItemStacks
                ItemStack stack = new ItemStack(Items.SEA_PICKLE);
                stack.set(DataComponents.ITEM_NAME, Component.literal("Pickle Rick"));
                stack.set(DataComponents.LORE, new ItemLore(List.of(Component.literal("I'm pickle riiick!!"))));
                output.accept(stack);
            })
            .build();

    public static void initialize() {
        // Register the group.
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_CREATIVE_TAB_KEY, CUSTOM_CREATIVE_TAB);
    }
}
