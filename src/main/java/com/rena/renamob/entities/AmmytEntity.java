package com.rena.renamob.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AmmytEntity extends MobEntity{
	
	private int Timer;
	

	public AmmytEntity(EntityType<? extends MobEntity> type, World worldIn) {
		super(type, worldIn);
		
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(0, new SwimGoal(this));
		this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
      
      
	}
	
	
	public static AttributeModifierMap.MutableAttribute setCustomAttributes()
	{
		return MobEntity.func_233666_p_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 60.0D)
				.createMutableAttribute(Attributes.ATTACK_DAMAGE, 5.0D)
				.createMutableAttribute(Attributes.FOLLOW_RANGE, 64.0D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 1.5D);
	
	}
	
	protected int getExperiencePoints(PlayerEntity player) {
		return 1 + this.world.rand.nextInt(4);
	}
	
	
	@Override
	public void livingTick() {
		if(this.world.isRemote) {
			this.Timer = Math.max(0,  this.Timer-1);
		}
		super.livingTick();
	}
	
	@OnlyIn(Dist.CLIENT)
	public void handleStatusUpdate(byte id) {
		if(id==10) {
			this.Timer = 40;
		}else {
			super.handleStatusUpdate(id);
		}
	}
	
	
	

	

}
