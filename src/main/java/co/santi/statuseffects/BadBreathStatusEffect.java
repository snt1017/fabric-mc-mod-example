package co.santi.statuseffects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class BadBreathStatusEffect extends StatusEffect {
    public static final String BBSE_NAME = "bad-breath";

    protected BadBreathStatusEffect() {
        super(StatusEffectCategory.NEUTRAL, 0xeaf7e6);
    }

    // This method is called every tick to check whether it should apply the status effect or not
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 50 >> amplifier;
        if (i > 0) {
            return duration % i == 0;
        } else {
            return true;
        }
    }

    // This method is called when it applies the status effect.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        // When entity is player
        if (entity instanceof PlayerEntity) {
            ((PlayerEntity) entity).damage(DamageSource.MAGIC, 0.1f);
        }
    }
}
