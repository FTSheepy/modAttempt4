package com.example.Inits;

import com.example.Blocks.ExampleBlock;
import com.example.examplemod.ExampleMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);
    public static final RegistryObject<Block> EXAMPLE_CUBE_BLOCK = BLOCKS.register("example_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL)));
    public static final RegistryObject<Block> EXAMPLE_CUBE_BLOCKK = BLOCKS.register("example_blockk", ExampleBlock::new);



}
