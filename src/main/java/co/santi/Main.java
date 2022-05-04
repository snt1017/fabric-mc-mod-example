package co.santi;

import co.santi.items.CustomBlock;
import co.santi.items.CustomFood;
import co.santi.items.CustomItem;
import co.santi.statuseffects.CustomStatusEffects;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {

    public static final String MOD_ID = "co-santi";


    @Override
    public void onInitialize() {
        CustomStatusEffects.registerEffects();
        CustomItem.registerItems();
        CustomFood.registerFood();
        CustomBlock.registerBlocks();
    }
}
