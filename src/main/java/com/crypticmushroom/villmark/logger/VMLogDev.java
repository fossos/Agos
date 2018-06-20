package com.crypticmushroom.villmark.logger;

import com.crypticmushroom.villmark.VMConfig;
import com.crypticmushroom.villmark.VMCore;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * NOTE:
 * Developer mode logging and debug logging
 * are two very different things.
 */
public class VMLogDev
{
    public static final Logger logDev = LogManager.getLogger(VMCore.NAME + " Developer Mode");

    public static void printInfo(Object messageDevelop)
    {
        if(VMConfig.other.developer.developerMode)
        {
            logDev.info(messageDevelop.toString());
        }
        else
        {
            printDebug(messageDevelop);
        }
    }

    public static void printWarn(Object messageDevelop)
    {
        if(VMConfig.other.developer.developerMode)
        {
            logDev.warn(messageDevelop.toString());
        }
        else
        {
            printDebug(messageDevelop);
        }
    }

    public static void printError(Object messageDevelop)
    {
        if(VMConfig.other.developer.developerMode)
        {
            logDev.error(messageDevelop.toString());
        }
        else
        {
            printDebug(messageDevelop);
        }
    }

    public static void printDebug(Object messageDevelop)
    {
        logDev.debug(messageDevelop);
    }
}
