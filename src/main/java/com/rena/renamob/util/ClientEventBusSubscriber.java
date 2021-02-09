package com.rena.renamob.util;

import com.rena.renamob.RenaMob;
import com.rena.renamob.entity.render.CalamarAgresivoRender;
import com.rena.renamob.entity.render.RenaEntityRender;
import com.rena.renamob.init.EntityInit;
import com.rena.renamob.objects.item.ModSpawnEggItem;

import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = RenaMob.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
	
	 @SubscribeEvent
	 public static void onClientSetup(FMLClientSetupEvent event) {
		 
		 RenderingRegistry.registerEntityRenderingHandler(EntityInit.AMMYT_ENTITY.get(), RenaEntityRender::new);
		 RenderingRegistry.registerEntityRenderingHandler(EntityInit.CALAMAR_AGRESIVO.get(), CalamarAgresivoRender::new);
		 
	 }
	 
	 @SubscribeEvent(priority = EventPriority.LOWEST)
	 public static void onPostRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
	      ModSpawnEggItem.initUnaddedEggs();
	    }
	 
	

}
