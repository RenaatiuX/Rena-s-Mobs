package com.rena.renamob.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.rena.renamob.RenaMob;
import com.rena.renamob.entities.CalamarAgresivoEntity;
import com.rena.renamob.entity.model.CalamarAgresivoModel;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;

public class CalamarAgresivoRender extends MobRenderer<CalamarAgresivoEntity, CalamarAgresivoModel>{
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(RenaMob.MODID,
			"textures/entity/calamar_entity.png");
	
	public CalamarAgresivoRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new CalamarAgresivoModel(), 0.7f);
	}
	
	
	public ResourceLocation getEntityTexture(CalamarAgresivoEntity entity) {
		return TEXTURE;
	}
	
	protected void applyRotations(SquidEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
	      float f = MathHelper.lerp(partialTicks, entityLiving.prevSquidPitch, entityLiving.squidPitch);
	      float f1 = MathHelper.lerp(partialTicks, entityLiving.prevSquidYaw, entityLiving.squidYaw);
	      matrixStackIn.translate(0.0D, 0.5D, 0.0D);
	      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180.0F - rotationYaw));
	      matrixStackIn.rotate(Vector3f.XP.rotationDegrees(f));
	      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(f1));
	      matrixStackIn.translate(0.0D, (double)-1.2F, 0.0D);
	   }
	


	   /**
	    * Defines what float the third param in setRotationAngles of ModelBase is
	    */
	   protected float handleRotationFloat(SquidEntity livingBase, float partialTicks) {
	      return MathHelper.lerp(partialTicks, livingBase.lastTentacleAngle, livingBase.tentacleAngle);
	   }

}