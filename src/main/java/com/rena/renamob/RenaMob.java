package com.rena.renamob;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.rena.renamob.entities.AmmytEntity;
import com.rena.renamob.entities.CalamarAgresivoEntity;
import com.rena.renamob.init.EntityInit;
import com.rena.renamob.init.ItemInit;
import com.rena.renamob.world.gen.ModEntityPlacement;
import com.rena.renamob.world.gen.ModEntitySpawns;

import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(RenaMob.MODID)
public class RenaMob {
	
	
	public static final String MODID = "renamob";
	public static final Logger LOGGER = LogManager.getLogger();
	public static final ItemGroup RENAITEM_GROUP = new RenaItemGroup("renatab");
	

	public RenaMob() {
		
		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		bus.addListener(this::setup);
		bus.addListener(this::clientSetup);
		
		ItemInit.ITEMS.register(bus);
		EntityInit.ENTITY_TYPES.register(bus);
		
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	
	
	private void setup(final FMLCommonSetupEvent event) {
		
		ModEntityPlacement.spawnPlacement();
		
	}
	
	@SubscribeEvent
	public void onBiomeLoad(BiomeLoadingEvent event) {
		ModEntitySpawns.onBiomesLoad(event);
	}
	
	private void clientSetup(final FMLClientSetupEvent event) {
		
		event.enqueueWork(() -> {
			
			GlobalEntityTypeAttributes.put(EntityInit.AMMYT_ENTITY.get(), AmmytEntity.setCustomAttributes().create());
			GlobalEntityTypeAttributes.put(EntityInit.CALAMAR_AGRESIVO.get(), CalamarAgresivoEntity.setCustomAttributes().create());
			
		});
	}
	
	
	
	
	public static class RenaItemGroup extends ItemGroup 
	{
		
		
		public RenaItemGroup(String label)
		{
			super(label);
		}

		@Override
		public ItemStack createIcon() 
		{
			return new ItemStack(ItemInit.RENA_TAB.get());
		}
	}
	
	
	
	
	

}
