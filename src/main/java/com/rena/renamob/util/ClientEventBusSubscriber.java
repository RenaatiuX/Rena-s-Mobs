package com.rena.renamob.util;

import com.rena.renamob.RenaMob;
import com.rena.renamob.entity.render.RenaEntityRender;
import com.rena.renamob.init.EntityInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = RenaMob.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	 @SubscribeEvent
	 public static void onClientSetup(FMLClientSetupEvent event) {
		 
		 RenderingRegistry.registerEntityRenderingHandler(EntityInit.AMMYT_ENTITY.get(), RenaEntityRender::new);
		 
	 }
	 
	

}
