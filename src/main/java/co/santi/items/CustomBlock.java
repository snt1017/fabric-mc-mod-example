package co.santi.items;

import co.santi.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CustomBlock {

    public static final String TOPAZ_BLOCK_NAME = "topaz-block";
    public static final Block TOPAZ_BLOCK = new Block(
            FabricBlockSettings.of(Material.STONE).
                    breakByTool(FabricToolTags.PICKAXES, 2).requiresTool().
                    strength(4.5f, 4.5f).sounds(BlockSoundGroup.STONE)
    );


    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, TOPAZ_BLOCK_NAME), TOPAZ_BLOCK);
    }




}
