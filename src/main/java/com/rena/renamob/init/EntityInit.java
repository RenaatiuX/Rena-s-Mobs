package com.rena.renamob.init;

import com.rena.renamob.RenaMob;
import com.rena.renamob.entities.AmmytEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
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
	  
	 
	  
}
