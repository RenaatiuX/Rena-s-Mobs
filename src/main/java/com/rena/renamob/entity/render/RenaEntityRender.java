package com.rena.renamob.entity.render;

import com.rena.renamob.RenaMob;
import com.rena.renamob.entities.AmmytEntity;
import com.rena.renamob.entity.model.AmmytEntityModel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenaEntityRender extends MobRenderer<AmmytEntity, AmmytEntityModel>{
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(RenaMob.MODID,
			"textures/entity/ammyt_entity.png");
	
	public RenaEntityRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new AmmytEntityModel(), 0.7f);
	}
	
	
	public ResourceLocation getEntityTexture(AmmytEntity entity) {
		return TEXTURE;
	};
}
