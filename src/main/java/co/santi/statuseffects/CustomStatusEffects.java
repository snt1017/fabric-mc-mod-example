package co.santi.statuseffects;

import co.santi.Main;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomStatusEffects {

    public static final StatusEffect BBSE = new BadBreathStatusEffect();


    public static void registerEffects(){
        Registry.register(Registry.STATUS_EFFECT, new Identifier(Main.MOD_ID, BadBreathStatusEffect.BBSE_NAME), BBSE);
    }



}
