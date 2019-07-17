package net.dyeo.xpdiary.proxy

import net.dyeo.xpdiary.XPDiary
import net.dyeo.xpdiary.gui.GuiHandler
import net.dyeo.xpdiary.gui.GuiHandlerRegistry
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.network.NetworkRegistry

open class CommonProxy
{
    open fun preInit(event: FMLPreInitializationEvent)
    {
    }

    open fun init(event: FMLInitializationEvent)
    {
        registerGuiHandler()
    }

    open fun postInit(event: FMLPostInitializationEvent)
    {
    }

    private fun registerGuiHandler()
    {
        NetworkRegistry.INSTANCE.registerGuiHandler(XPDiary, GuiHandlerRegistry)
        GuiHandlerRegistry.registerGuiHandler(GuiHandler, GuiHandler.id)
    }
}