package com.rena.renamob.entity.render;

import com.rena.renamob.RenaMob;
import com.rena.renamob.entities.CalamarAgresivoEntity;
import com.rena.renamob.entity.model.CalamarAgresivoModel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class CalamarAgresivoRender extends MobRenderer<CalamarAgresivoEntity, CalamarAgresivoModel>{
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(RenaMob.MODID,
			"textures/entity/calamar_entity.png");
	
	public CalamarAgresivoRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new CalamarAgresivoModel(), 0.7f);
	}
	
	
	public ResourceLocation getEntityTexture(CalamarAgresivoEntity entity) {
		return TEXTURE;
	};

}