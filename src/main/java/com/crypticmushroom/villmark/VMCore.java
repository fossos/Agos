package com.crypticmushroom.villmark;

import com.crypticmushroom.villmark.logger.VMLogDev;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Hey computer nerds. In this code, VM means, Villmark, not Virtual Machine. ;)
 */

@Mod(modid = VMCore.MOD_ID, name = VMCore.NAME, version = VMCore.VERSION, acceptedMinecraftVersions = VMCore.MC_VERSIONS, updateJSON = VMCore.UPDATE_JSON)
public class VMCore
{
    public static final String MOD_ID = "villmark";
    public static final String NAME = "Villmark";
    public static final String VERSION = "1.0-dev";
    public static final String MC_VERSIONS = "[1.12.2]";
    public static final String UPDATE_JSON = "https://raw.githubusercontent.com/cipherzerox/Villmark/master/update.json";

    @SidedProxy(clientSide = "com.crypticmushroom.villmark.client.ClientProxy", serverSide = "com.crypticmushroom.villmark.server.ServerProxy")
    public static CommonProxy proxy;
    @Instance(MOD_ID)
    private static VMCore instance;

    public static VMCore instance()
    {
        return instance;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        VMLogDev.printInfo("Running Pre-Initialization...");

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        VMLogDev.printInfo("Running Initialization...");

        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        VMLogDev.printInfo("Running Post-Initialization...");

        proxy.postInit(event);
    }
}
