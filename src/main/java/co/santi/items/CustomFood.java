package co.santi.items;

import co.santi.Main;
import co.santi.statuseffects.BadBreathStatusEffect;
import co.santi.statuseffects.CustomStatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class CustomFood {

    public static final String ONION_NAME = "onion";
    public static final Item ONION = new Item(
            new Item.Settings().group(ItemGroup.FOOD).food(
                    new FoodComponent.Builder().hunger(1).saturationModifier(1.2f).statusEffect(
                            new StatusEffectInstance(CustomStatusEffects.BBSE, 60 * 20), 1f
                    ).build()
            )
    );

    public static final String ONION_MEAT_NAME = "onion-meat";
    public static final Item ONION_MEAT = new Item(
            new Item.Settings().group(ItemGroup.FOOD).food(
                    new FoodComponent.Builder().hunger(10).saturationModifier(22f).build()
            )
    );


    public static void registerFood(){
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, ONION_NAME), ONION);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, ONION_MEAT_NAME), ONION_MEAT);
    }


}
