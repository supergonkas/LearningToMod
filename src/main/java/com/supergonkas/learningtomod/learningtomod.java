package com.supergonkas.learningtomod;

import com.supergonkas.learningtomod.configuration.ConfigurationHandler;
import com.supergonkas.learningtomod.proxy.IProxy;
import com.supergonkas.learningtomod.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.Mod_NAME , version = Reference.Version )

//public class leaningtomod {
//
//    public static final String ID = "leaningtomod";
//    public static final String NAME = "leaningtomod";
//    public static final String VERSION = "1.7.2-1.0";
//}
//

public class learningtomod {

    @Mod.Instance("learningtomod")
    public static learningtomod instance;

    @SidedProxy(clientSide = Reference.Client_Proxy_Class, serverSide = Reference.Server_Proxy_class)
    public static IProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.Init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}