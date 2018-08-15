package com.crypticmushroom.agos.block;

import com.crypticmushroom.agos.Agos;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import static net.minecraft.block.material.Material.ROCK;

public class BlockBase extends Block {

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public BlockBase(String name) {
        this(ROCK, name);
    }

    public void registerItemModel(Item itemBlock) {
        Agos.proxy.registerItemRenderer(itemBlock,0, name);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
