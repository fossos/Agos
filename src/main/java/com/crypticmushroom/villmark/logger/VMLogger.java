package com.crypticmushroom.villmark.logger;

import com.crypticmushroom.villmark.VMCore;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VMLogger
{
    public static final Logger log = LogManager.getLogger(VMCore.NAME);

    public static void printInfo(Object messageInfo)
    {
        log.info(messageInfo.toString());
    }

    public static void printWarn(Object messageWarn)
    {
        log.warn(messageWarn.toString());
    }

    public static void printError(Object messageError)
    {
        log.error(messageError.toString());
    }

    // Developer mode logging and debug logging are two very different things.
    // I moved Developer logging methods into VMLogDev
    public static void printDebug(Object messageDebug)
    {
        log.debug(messageDebug.toString());
    }
}
