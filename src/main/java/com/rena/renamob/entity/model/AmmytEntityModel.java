package com.rena.renamob.entity.model;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.rena.renamob.entities.AmmytEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class AmmytEntityModel extends EntityModel<AmmytEntity> {
	private final ModelRenderer Cabeza;
	private final ModelRenderer PataAtrasIzqui;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Cuerpo;
	private final ModelRenderer cube_r4;
	private final ModelRenderer PataDere;
	private final ModelRenderer cube_r5;
	private final ModelRenderer PataIzqui;
	private final ModelRenderer cube_r6;
	private final ModelRenderer PataAtraDere;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public AmmytEntityModel() {
		textureWidth = 128;
		textureHeight = 128;

		Cabeza = new ModelRenderer(this);
		Cabeza.setRotationPoint(0.0F, -0.9038F, -0.5962F);
		Cabeza.setTextureOffset(0, 61).addBox(-4.5F, -5.5962F, -29.4038F, 9.0F, 9.0F, 7.0F, 0.0F, false);
		Cabeza.setTextureOffset(102, 56).addBox(-3.5F, -3.5962F, -35.4038F, 7.0F, 4.0F, 6.0F, 0.0F, false);
		Cabeza.setTextureOffset(0, 94).addBox(-4.0F, 0.4038F, -35.9038F, 8.0F, 3.0F, 7.0F, 0.0F, false);
		Cabeza.setTextureOffset(48, 90).addBox(-4.0F, 0.4038F, -42.9038F, 8.0F, 3.0F, 7.0F, 0.0F, false);
		Cabeza.setTextureOffset(6, 0).addBox(-4.0F, -0.5962F, -42.9038F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(10, 8).addBox(-2.0F, -1.5962F, -42.9038F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(10, 6).addBox(1.0F, -1.5962F, -42.9038F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(0, 0).addBox(-0.5F, -0.5962F, -42.9038F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(4, 0).addBox(3.0F, -0.5962F, -42.9038F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(10, 2).addBox(4.0F, -1.5962F, -42.9038F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(8, 5).addBox(-4.0F, -1.5962F, -42.9038F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(10, 4).addBox(4.0F, -0.5962F, -40.9038F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(6, 0).addBox(-4.0F, -0.5962F, -40.9038F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(10, 0).addBox(4.0F, -1.5962F, -38.9038F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(8, 0).addBox(-4.0F, -1.5962F, -38.9038F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(10, 10).addBox(4.0F, -0.5962F, -36.9038F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(4, 0).addBox(-4.0F, -0.5962F, -36.9038F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(8, 9).addBox(4.0F, -1.5962F, -34.9038F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(0, 7).addBox(-4.0F, -1.5962F, -34.9038F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(8, 2).addBox(4.0F, -0.5962F, -32.9038F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(0, 0).addBox(-4.0F, -0.5962F, -32.9038F, 0.0F, 1.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(6, 9).addBox(4.0F, -1.5962F, -30.9038F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(0, 3).addBox(-4.0F, -1.5962F, -30.9038F, 0.0F, 2.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(64, 13).addBox(-3.0F, -2.5962F, -41.4038F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		Cabeza.setTextureOffset(0, 0).addBox(-10.0F, -10.0962F, -24.4038F, 20.0F, 20.0F, 12.0F, 0.0F, false);
		Cabeza.setTextureOffset(64, 0).addBox(-5.0F, 2.9038F, -27.4038F, 10.0F, 8.0F, 5.0F, 0.0F, false);

		PataAtrasIzqui = new ModelRenderer(this);
		PataAtrasIzqui.setRotationPoint(8.0F, 5.5825F, 38.1295F);
		PataAtrasIzqui.setTextureOffset(42, 101).addBox(-3.0F, 15.4175F, -30.1295F, 6.0F, 3.0F, 7.0F, 0.0F, false);
		PataAtrasIzqui.setTextureOffset(52, 4).addBox(-2.5F, 16.4175F, -32.1295F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		PataAtrasIzqui.setTextureOffset(45, 36).addBox(1.5F, 16.4175F, -32.1295F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		PataAtrasIzqui.setTextureOffset(45, 32).addBox(-0.5F, 16.4175F, -32.1295F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 3.9175F, -30.1295F);
		PataAtrasIzqui.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(32, 67).addBox(-2.5F, -0.9226F, 1.9063F, 5.0F, 5.0F, 9.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, 6.9175F, -23.1295F);
		PataAtrasIzqui.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 32).addBox(0.0F, 0.5F, 0.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -1.0825F, -25.1295F);
		PataAtrasIzqui.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.4363F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(79, 79).addBox(-3.0F, -0.5F, -2.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);

		Cuerpo = new ModelRenderer(this);
		Cuerpo.setRotationPoint(0.0F, 24.0F, 0.0F);
		Cuerpo.setTextureOffset(54, 54).addBox(-8.0F, -29.0F, 9.0F, 16.0F, 14.0F, 8.0F, 0.0F, false);
		Cuerpo.setTextureOffset(0, 32).addBox(-7.0F, -28.0F, -7.0F, 14.0F, 12.0F, 17.0F, 0.0F, false);
		Cuerpo.setTextureOffset(56, 24).addBox(-8.0F, -29.0F, -13.0F, 16.0F, 14.0F, 8.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -27.0F, 15.5F);
		Cuerpo.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7418F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(45, 39).addBox(-1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 7.0F, 0.0F, false);

		PataDere = new ModelRenderer(this);
		PataDere.setRotationPoint(-8.0F, 7.3333F, 15.5833F);
		PataDere.setTextureOffset(94, 96).addBox(-2.5F, 6.6667F, -27.5833F, 5.0F, 9.0F, 6.0F, 0.0F, false);
		PataDere.setTextureOffset(94, 46).addBox(-3.5F, 13.6667F, -29.5833F, 7.0F, 3.0F, 7.0F, 0.0F, false);
		PataDere.setTextureOffset(4, 2).addBox(-3.0F, 14.6667F, -31.5833F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		PataDere.setTextureOffset(0, 0).addBox(-0.5F, 14.6667F, -31.5833F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		PataDere.setTextureOffset(0, 8).addBox(2.0F, 14.6667F, -31.5833F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -0.8333F, -26.5833F);
		PataDere.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(88, 7).addBox(-3.0F, -0.5F, -2.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);

		PataIzqui = new ModelRenderer(this);
		PataIzqui.setRotationPoint(9.0F, 7.3333F, 15.5833F);
		PataIzqui.setTextureOffset(72, 96).addBox(-2.5F, 6.6667F, -27.5833F, 5.0F, 9.0F, 6.0F, 0.0F, false);
		PataIzqui.setTextureOffset(95, 69).addBox(-3.5F, 13.6667F, -29.5833F, 7.0F, 3.0F, 7.0F, 0.0F, false);
		PataIzqui.setTextureOffset(52, 8).addBox(2.0F, 14.6667F, -31.5833F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		PataIzqui.setTextureOffset(0, 4).addBox(-0.5F, 14.6667F, -31.5833F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		PataIzqui.setTextureOffset(4, 6).addBox(-3.0F, 14.6667F, -31.5833F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -0.8333F, -26.5833F);
		PataIzqui.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1745F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 77).addBox(-3.0F, -0.5F, -2.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);

		PataAtraDere = new ModelRenderer(this);
		PataAtraDere.setRotationPoint(-8.0F, 5.5825F, 38.1295F);
		PataAtraDere.setTextureOffset(23, 98).addBox(-3.0F, 15.4175F, -30.1295F, 6.0F, 3.0F, 7.0F, 0.0F, false);
		PataAtraDere.setTextureOffset(52, 0).addBox(-2.5F, 16.4175F, -32.1295F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		PataAtraDere.setTextureOffset(49, 34).addBox(-0.5F, 16.4175F, -32.1295F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		PataAtraDere.setTextureOffset(45, 40).addBox(1.5F, 16.4175F, -32.1295F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, 6.9175F, -23.1295F);
		PataAtraDere.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(103, 79).addBox(0.0F, 0.5F, 0.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 3.9175F, -30.1295F);
		PataAtraDere.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(51, 76).addBox(-2.5F, -0.9226F, 1.9063F, 5.0F, 5.0F, 9.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -1.0825F, -25.1295F);
		PataAtraDere.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.4363F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(24, 81).addBox(-3.0F, -0.5F, -2.0F, 6.0F, 11.0F, 6.0F, 0.0F, false);
	}

	
	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Cabeza.render(matrixStack, buffer, packedLight, packedOverlay);
		PataAtrasIzqui.render(matrixStack, buffer, packedLight, packedOverlay);
		Cuerpo.render(matrixStack, buffer, packedLight, packedOverlay);
		PataDere.render(matrixStack, buffer, packedLight, packedOverlay);
		PataIzqui.render(matrixStack, buffer, packedLight, packedOverlay);
		PataAtraDere.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(AmmytEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// TODO Auto-generated method stub
		
	}
}