package wafflebender.wafflesscythes.item;

import com.mojang.datafixers.types.templates.Tag;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import wafflebender.wafflesscythes.WafflesScythes;

import javax.swing.text.html.HTML;

public class ModItems {
    public static final Item WOODEN_SCYTHE = registerItem("wooden_scythe", new SwordItem(ToolMaterials.WOOD, 6, -3.2f, new FabricItemSettings()));
    public static final Item STONE_SCYTHE = registerItem("stone_scythe", new SwordItem(ToolMaterials.STONE, 7, -3.2f, new FabricItemSettings()));
    public static final Item IRON_SCYTHE = registerItem("iron_scythe", new SwordItem(ToolMaterials.IRON, 6, -3.1f, new FabricItemSettings()));
    public static final Item GOLDEN_SCYTHE = registerItem("golden_scythe", new SwordItem(ToolMaterials.GOLD, 6, -3f, new FabricItemSettings()));
    public static final Item DIAMOND_SCYTHE = registerItem("diamond_scythe", new SwordItem(ToolMaterials.DIAMOND, 5, -3f, new FabricItemSettings()));
    public static final Item NETHERITE_SCYTHE = registerItem("netherite_scythe", new SwordItem(ToolMaterials.NETHERITE, 5, -3f, new FabricItemSettings()));

    private static void addItemsToCombatItemGroup(FabricItemGroupEntries entries) {
        entries.add(WOODEN_SCYTHE);
        entries.add(STONE_SCYTHE);
        entries.add(IRON_SCYTHE);
        entries.add(GOLDEN_SCYTHE);
        entries.add(DIAMOND_SCYTHE);
        entries.add(NETHERITE_SCYTHE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WafflesScythes.MODID, name), item);
    }

    public static void registerModItems() {
        WafflesScythes.LOGGER.info("Registering mod items for "+ WafflesScythes.MODID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatItemGroup);
    }
}
