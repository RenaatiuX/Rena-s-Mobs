package com.rena.renamob.world.gen;
import com.rena.renamob.entities.AmmytEntity;
import com.rena.renamob.entities.CalamarAgresivoEntity;
import com.rena.renamob.init.EntityInit;

import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.world.gen.Heightmap;


public class ModEntityPlacement {
	
	public static void spawnPlacement() {
        EntitySpawnPlacementRegistry.register(EntityInit.AMMYT_ENTITY.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AmmytEntity::canSpawnOn);
        EntitySpawnPlacementRegistry.register(EntityInit.CALAMAR_AGRESIVO.get(), EntitySpawnPlacementRegistry.PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, CalamarAgresivoEntity::func_223365_b);
       
    }
	
	
	

}
