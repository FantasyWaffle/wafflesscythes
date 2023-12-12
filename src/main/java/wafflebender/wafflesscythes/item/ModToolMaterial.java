package wafflebender.wafflesscythes.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    WOODEN_SCYTHE(-1, 59, 1f, 6f, 15, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    STONE_SCYTHE(-1, 59, 1f, 8f, 5, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    IRON_SCYTHE(-1, 59, 1f, 8f, 14, () -> Ingredient.fromTag(ItemTags.IRON_ORES)),
    GOLDEN_SCYTHE(-1, 59, 1f, 6f, 22, () -> Ingredient.fromTag(ItemTags.GOLD_ORES)),
    DIAMOND_SCYTHE(-1, 59, 1f, 8f, 10, () -> Ingredient.fromTag(ItemTags.DIAMOND_ORES)),
    NETHERITE_SCYTHE(-1, 59, 1f, 9f, 15, () -> Ingredient.fromTag(null));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
