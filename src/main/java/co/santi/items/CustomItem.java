package co.santi.items;

import co.santi.Main;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomItem {


    public static final String TOPAZ_NAME = "topaz";
    public static final Item TOPAZ = new Item(new Item.Settings().group(ItemGroup.MATERIALS).maxCount(16));

    public static final BlockItem TOPAZ_BLOCK_ITEM = new BlockItem(CustomBlock.TOPAZ_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));


    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, TOPAZ_NAME), TOPAZ);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, CustomBlock.TOPAZ_BLOCK_NAME), TOPAZ_BLOCK_ITEM);
    }
}
