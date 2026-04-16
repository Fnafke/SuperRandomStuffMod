package fnafke.superrandomstuffmod.superhero.item;

import fnafke.superrandomstuffmod.SuperRandomStuffMod;
import net.fabricmc.fabric.api.registry.FabricPotionBrewingBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is the collection class for all the Superhero potions.
 * When creating new potions, these go here.
 */
public class SuperheroPotions {
    public static final Logger LOGGER = LoggerFactory.getLogger(SuperheroPotions.class);
    private SuperheroPotions() {}

    // === Potion Creation START ===
    public static final Holder<Potion> TESTING_POTION = register(
                "testing_potion",
                        new Potion("testing_potion", new MobEffectInstance(MobEffects.STRENGTH, 9600))
            );

    // === Potion Creation END ===

    /**
     * Used for registering a potion
     * @param name The name of the potion
     * @param potion The potion class
     * @return The registered potion
     */
    private static Holder<Potion> register(String name, Potion potion) {
        return Registry.registerForHolder(
                BuiltInRegistries.POTION,
                Identifier.fromNamespaceAndPath(SuperRandomStuffMod.MOD_ID, name),
                potion
        );
    }

    /**
     * This function is used for initializing all the potions.
     * This function is also used for creating new brewing recipes.
     */
    public static void initialize() {
        LOGGER.info("LOADING NEW POTIONS");
        SuperheroPotionsBrewing.build(Potions.WATER, Items.OBSIDIAN, TESTING_POTION);
    }
}