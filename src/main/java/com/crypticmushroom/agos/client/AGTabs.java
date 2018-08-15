package com.crypticmushroom.agos.client;

import com.crypticmushroom.agos.block.AGBlocks;
import com.crypticmushroom.agos.item.AGItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class AGTabs {

    public static final CreativeTabs tabItem = new CreativeTabs("agos_items") {
        @Override
        public ItemStack getTabIconItem() {
                return new ItemStack(AGItems.borelecIngot);
        }
    };

    public static final CreativeTabs tabBlock = new CreativeTabs("agos_blocks") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(AGBlocks.borelecOre);
        }
    };
}
