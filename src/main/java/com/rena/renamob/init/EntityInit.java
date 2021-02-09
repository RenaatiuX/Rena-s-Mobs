package com.rena.renamob.init;

import com.rena.renamob.RenaMob;
import com.rena.renamob.entities.AmmytEntity;
import com.rena.renamob.entities.CalamarAgresivoEntity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {
	
	  public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
	            RenaMob.MODID);

	  public static final RegistryObject<EntityType<AmmytEntity>> AMMYT_ENTITY = ENTITY_TYPES
			  .register("ammyt_entity",
					  	() -> EntityType.Builder.<AmmytEntity>create(AmmytEntity::new, EntityClassification.CREATURE)
					  	.size(1.9f, 2.0f)
					  	.build(new ResourceLocation(RenaMob.MODID, "ammyt_entity").toString()));
	  
	  public static final RegistryObject<EntityType<CalamarAgresivoEntity>> CALAMAR_AGRESIVO = ENTITY_TYPES
			  .register("calamar_agresivo",
					  	() -> EntityType.Builder.<CalamarAgresivoEntity>create(CalamarAgresivoEntity::new, EntityClassification.CREATURE)
					  	.size(1.0f, 2.0f)
					  	.build(new ResourceLocation(RenaMob.MODID, "calamar_agresivo").toString()));
	  
	 
	  
	  
	  
	  
	  @SuppressWarnings("unused")
	  private static <T extends Entity> RegistryObject<EntityType<T>> register(String key, EntityType.IFactory<T> factoryIn, EntityClassification classificationIn, float size1, float size2) {
	        return ENTITY_TYPES.register(key, () -> EntityType.Builder.create(factoryIn, classificationIn)
	                .size(size1, size2)
	                .build(new ResourceLocation(RenaMob.MODID, key).toString()));
	    }
	  
	  public static void register(IEventBus eventBus) {
	        ENTITY_TYPES.register(eventBus);
	        RenaMob.LOGGER.info("Rena's Mobs: Entity Types Registered!");
	    }
	 
	 
}
