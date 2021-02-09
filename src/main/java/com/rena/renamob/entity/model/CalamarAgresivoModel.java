package com.rena.renamob.entity.model;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.rena.renamob.entities.CalamarAgresivo;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class CalamarAgresivoModel extends EntityModel<CalamarAgresivo> {
	private final ModelRenderer Cabeza;
	private final ModelRenderer TentaculoIzquierdo;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer TentaculoDerecho;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer TentaculoAtrasIzquie;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer TentaculoAtrasDere;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;

	public CalamarAgresivoModel() {
		textureWidth = 64;
		textureHeight = 64;

		Cabeza = new ModelRenderer(this);
		Cabeza.setRotationPoint(0.0F, 11.0F, 0.0F);
		Cabeza.setTextureOffset(18, 18).addBox(-3.0F, -21.0F, 0.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		Cabeza.setTextureOffset(0, 0).addBox(-3.0F, -36.0F, 0.0F, 6.0F, 14.0F, 6.0F, 0.0F, false);
		Cabeza.setTextureOffset(24, 13).addBox(-2.0F, -22.0F, 1.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Cabeza.setTextureOffset(24, 7).addBox(-2.0F, -15.0F, 1.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		Cabeza.setTextureOffset(24, 0).addBox(-2.0F, -39.0F, 1.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		Cabeza.setTextureOffset(16, 30).addBox(-1.0F, -44.0F, 2.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		Cabeza.setTextureOffset(0, 0).addBox(-0.5F, -49.0F, 2.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(24, 30).addBox(-4.0F, -36.0F, 3.0F, 1.0F, 10.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(28, 30).addBox(-5.0F, -36.0F, 3.0F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(18, 20).addBox(-5.0F, -37.0F, 3.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(24, 9).addBox(-4.0F, -39.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(24, 2).addBox(-3.0F, -41.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(24, 13).addBox(-2.0F, -43.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(18, 21).addBox(1.0F, -41.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(22, 22).addBox(1.0F, -43.0F, 3.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(24, 7).addBox(2.0F, -39.0F, 3.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(18, 5).addBox(2.0F, -37.0F, 3.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(16, 20).addBox(3.0F, -36.0F, 3.0F, 1.0F, 10.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(26, 30).addBox(4.0F, -36.0F, 3.0F, 1.0F, 9.0F, 0.0F, 0.0F, false);
		Cabeza.setTextureOffset(18, 2).addBox(-1.0F, -19.0F, -0.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Cabeza.setTextureOffset(18, 0).addBox(-1.5F, -20.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		TentaculoIzquierdo = new ModelRenderer(this);
		TentaculoIzquierdo.setRotationPoint(1.75F, -1.4688F, 1.5F);
		TentaculoIzquierdo.setTextureOffset(0, 20).addBox(-0.75F, -0.5313F, -0.5F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		TentaculoIzquierdo.setTextureOffset(36, 30).addBox(-1.25F, 19.4688F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		TentaculoIzquierdo.setTextureOffset(36, 18).addBox(-0.25F, 19.4688F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		TentaculoIzquierdo.setTextureOffset(38, 1).addBox(-0.75F, 24.4688F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.25F, 7.9688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.setTextureOffset(16, 31).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.25F, 9.9688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.setTextureOffset(22, 31).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.25F, 11.9688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.setTextureOffset(32, 30).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.25F, 13.9688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.setTextureOffset(32, 31).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.25F, 15.9688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.setTextureOffset(34, 30).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.25F, 17.9688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.setTextureOffset(34, 31).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.75F, 5.4688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.setTextureOffset(36, 8).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.75F, 7.4688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.setTextureOffset(36, 9).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.75F, 9.4688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.setTextureOffset(36, 10).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-1.75F, 11.4688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.setTextureOffset(36, 13).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-1.75F, 13.4688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.setTextureOffset(36, 14).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.75F, 15.4688F, -0.5F);
		TentaculoIzquierdo.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.7854F);
		cube_r12.setTextureOffset(36, 15).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		TentaculoDerecho = new ModelRenderer(this);
		TentaculoDerecho.setRotationPoint(-1.25F, -1.4688F, 1.5F);
		TentaculoDerecho.setTextureOffset(12, 20).addBox(-0.75F, -0.5313F, -0.5F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		TentaculoDerecho.setTextureOffset(36, 36).addBox(-0.25F, 19.4688F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		TentaculoDerecho.setTextureOffset(30, 35).addBox(-1.25F, 19.4688F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		TentaculoDerecho.setTextureOffset(38, 0).addBox(-0.75F, 24.4688F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.25F, 9.9688F, -0.5F);
		TentaculoDerecho.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.setTextureOffset(26, 15).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.25F, 7.9688F, -0.5F);
		TentaculoDerecho.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.setTextureOffset(26, 14).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.75F, 5.4688F, -0.5F);
		TentaculoDerecho.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.setTextureOffset(22, 37).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.75F, 7.4688F, -0.5F);
		TentaculoDerecho.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.setTextureOffset(32, 37).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.25F, 11.9688F, -0.5F);
		TentaculoDerecho.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.setTextureOffset(26, 16).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.75F, 9.4688F, -0.5F);
		TentaculoDerecho.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.setTextureOffset(16, 38).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.75F, 11.4688F, -0.5F);
		TentaculoDerecho.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.setTextureOffset(18, 38).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.25F, 13.9688F, -0.5F);
		TentaculoDerecho.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
		cube_r20.setTextureOffset(16, 30).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.25F, 15.9688F, -0.5F);
		TentaculoDerecho.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.7854F);
		cube_r21.setTextureOffset(22, 30).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.75F, 13.4688F, -0.5F);
		TentaculoDerecho.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
		cube_r22.setTextureOffset(20, 38).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.75F, 15.4688F, -0.5F);
		TentaculoDerecho.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7854F);
		cube_r23.setTextureOffset(22, 38).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.25F, 17.9688F, -0.5F);
		TentaculoDerecho.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.setTextureOffset(34, 32).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		TentaculoAtrasIzquie = new ModelRenderer(this);
		TentaculoAtrasIzquie.setRotationPoint(1.75F, -1.4688F, 4.5F);
		TentaculoAtrasIzquie.setTextureOffset(4, 20).addBox(-0.75F, -0.5313F, -0.5F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		TentaculoAtrasIzquie.setTextureOffset(30, 30).addBox(-0.25F, 19.4688F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		TentaculoAtrasIzquie.setTextureOffset(32, 38).addBox(-0.75F, 24.4688F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
		TentaculoAtrasIzquie.setTextureOffset(4, 0).addBox(-1.25F, 19.4688F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-1.75F, 13.4688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		cube_r25.setTextureOffset(36, 3).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-1.75F, 11.4688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.setTextureOffset(36, 2).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-1.75F, 9.4688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.7854F);
		cube_r27.setTextureOffset(36, 1).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-1.75F, 7.4688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.7854F);
		cube_r28.setTextureOffset(36, 0).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.75F, 5.4688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
		cube_r29.setTextureOffset(34, 33).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.25F, 7.9688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.7854F);
		cube_r30.setTextureOffset(20, 23).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.25F, 9.9688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.7854F);
		cube_r31.setTextureOffset(24, 15).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.25F, 11.9688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.7854F);
		cube_r32.setTextureOffset(24, 16).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.25F, 13.9688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.7854F);
		cube_r33.setTextureOffset(25, 0).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.25F, 15.9688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 0.7854F);
		cube_r34.setTextureOffset(26, 1).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.25F, 17.9688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 0.7854F);
		cube_r35.setTextureOffset(26, 13).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-1.75F, 15.4688F, -0.5F);
		TentaculoAtrasIzquie.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, -0.7854F);
		cube_r36.setTextureOffset(36, 7).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		TentaculoAtrasDere = new ModelRenderer(this);
		TentaculoAtrasDere.setRotationPoint(-1.25F, -1.4688F, 4.5F);
		TentaculoAtrasDere.setTextureOffset(8, 20).addBox(-0.75F, -0.5313F, -0.5F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		TentaculoAtrasDere.setTextureOffset(34, 34).addBox(-0.25F, 19.4688F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		TentaculoAtrasDere.setTextureOffset(32, 32).addBox(-1.25F, 19.4688F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		TentaculoAtrasDere.setTextureOffset(38, 38).addBox(-0.75F, 24.4688F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-1.75F, 15.4688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, -0.7854F);
		cube_r37.setTextureOffset(20, 37).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.25F, 17.9688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, 0.7854F);
		cube_r38.setTextureOffset(18, 23).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-1.75F, 13.4688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, -0.7854F);
		cube_r39.setTextureOffset(18, 37).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.25F, 15.9688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, 0.7854F);
		cube_r40.setTextureOffset(22, 21).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-1.75F, 9.4688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, -0.7854F);
		cube_r41.setTextureOffset(36, 35).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-1.75F, 11.4688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, -0.7854F);
		cube_r42.setTextureOffset(16, 37).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.25F, 13.9688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 0.0F, 0.7854F);
		cube_r43.setTextureOffset(11, 20).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.25F, 11.9688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0F, 0.7854F);
		cube_r44.setTextureOffset(7, 20).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.25F, 9.9688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, 0.0F, 0.7854F);
		cube_r45.setTextureOffset(3, 20).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-1.75F, 7.4688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, -0.7854F);
		cube_r46.setTextureOffset(36, 23).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.25F, 7.9688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, 0.7854F);
		cube_r47.setTextureOffset(4, 5).addBox(-1.5F, -1.5F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-1.75F, 5.4688F, -0.5F);
		TentaculoAtrasDere.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, -0.7854F);
		cube_r48.setTextureOffset(36, 16).addBox(-0.5F, 1.0F, 0.5F, 1.0F, 1.0F, 0.0F, 0.0F, false);
	}


	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Cabeza.render(matrixStack, buffer, packedLight, packedOverlay);
		TentaculoIzquierdo.render(matrixStack, buffer, packedLight, packedOverlay);
		TentaculoDerecho.render(matrixStack, buffer, packedLight, packedOverlay);
		TentaculoAtrasIzquie.render(matrixStack, buffer, packedLight, packedOverlay);
		TentaculoAtrasDere.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(CalamarAgresivo entityIn, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// TODO Auto-generated method stub
		
	}
}