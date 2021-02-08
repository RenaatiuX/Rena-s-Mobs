package com.rena.renamob.world.gen;

import com.rena.renamob.RenaMob;
import com.rena.renamob.init.EntityInit;

import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RenaMob.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEntitySpawns {
	
	
	public static void onBiomesLoad(BiomeLoadingEvent event) {
		
        if (event.getCategory() == Biome.Category.DESERT)
            event.getSpawns().getSpawner(EntityClassification.AMBIENT).add(new MobSpawnInfo.Spawners(EntityInit.AMMYT_ENTITY.get(), 100, 1, 10));
    }
}