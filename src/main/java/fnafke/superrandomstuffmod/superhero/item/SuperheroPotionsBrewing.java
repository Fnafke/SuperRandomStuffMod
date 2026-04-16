package fnafke.superrandomstuffmod.superhero.item;

import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.alchemy.Potion;

/**
 * Class used for creating new brewing recipes for Superhero potions.
 */
public class SuperheroPotionsBrewing {

    /**
     * Build the brewing recipe
     * @param initPotion The initial potion.
     * @param ingredient    What item is used as ingredient.
     * @param outputPotion  The potion you're trying to brew.
     */
    public static void build (Holder<Potion> initPotion, Item ingredient, Holder<Potion> outputPotion) {
        FabricPotionBrewingBuilder.BUILD.register(builder -> {
            builder.addMix(
                    // Input potion.
                    initPotion,
                    // Ingredient
                    ingredient,
                    // Output potion.
                    outputPotion
            );
        });
    }
}
