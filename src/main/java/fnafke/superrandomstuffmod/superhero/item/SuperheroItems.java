package fnafke.superrandomstuffmod.superhero.item;

import fnafke.superrandomstuffmod.SuperRandomStuffMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

/**
 * Collection class for all the Superhero items
 */
public class SuperheroItems {

    public static final Item TESTING_ITEM = register("testing_item", Item::new, new Item.Properties());

    /**
     * Register the item
     * @param name  The name of the item
     * @param itemFactory   Specify how the item will be created
     * @param settings  Item settings
     * @return The item instance
     * @param <T>
     */
    public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
        // Create the item key.
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(SuperRandomStuffMod.MOD_ID, name));

        // Create the item instance.
        T item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static void initialize() {
    }
}
