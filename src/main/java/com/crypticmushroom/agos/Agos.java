package com.crypticmushroom.agos;

import com.crypticmushroom.agos.logger.AGLogDev;
import com.crypticmushroom.agos.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Agos.MOD_ID, name = Agos.NAME, version = Agos.VERSION, acceptedMinecraftVersions = Agos.MC_VERSIONS, updateJSON = Agos.UPDATE_JSON)
public class Agos
{
    public static final String MOD_ID = "ag";
    public static final String NAME = "Agos";
    public static final String VERSION = "1.0-dev";
    public static final String MC_VERSIONS = "[1.12.2]";
    public static final String UPDATE_JSON = "https://raw.githubusercontent.com/cipherzerox/Villmark/master/update.json";

    @SidedProxy(clientSide = "com.crypticmushroom.agos.proxy.ClientProxy", serverSide = "com.crypticmushroom.agos.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Instance(MOD_ID)
    private static Agos instance;

    public static Agos instance()
    {
        return instance;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        AGLogDev.printInfo("Running Pre-Initialization...");

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        AGLogDev.printInfo("Running Initialization...");

        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        AGLogDev.printInfo("Running Post-Initialization...");

        proxy.postInit(event);
    }
}
