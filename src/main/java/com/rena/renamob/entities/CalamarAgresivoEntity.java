package com.rena.renamob.entities;



import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Pose;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class CalamarAgresivoEntity extends SquidEntity {
	
	public CalamarAgresivoEntity(EntityType<? extends SquidEntity> type, World worldIn) {
		super(type, worldIn);
		
	}


	public float squidPitch;
	public float prevSquidPitch;
	public float squidYaw;
	public float prevSquidYaw;
	public float squidRotation;
	public float prevSquidRotation;
	public float tentacleAngle;
	public float lastTentacleAngle;

	
	protected void registerGoals() {
		super.registerGoals();
		
	    this.goalSelector.addGoal(1, new LookAtGoal(this, PlayerEntity.class, 12.0F));
	    this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 0.6f, true));
	    this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
	}
	
	public static AttributeModifierMap.MutableAttribute setCustomAttributes()
	{
		return MobEntity.func_233666_p_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 60.0D)
				.createMutableAttribute(Attributes.ATTACK_DAMAGE, 5.0D)
				.createMutableAttribute(Attributes.FOLLOW_RANGE, 64.0D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5D);
	
	}
	
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
	      return sizeIn.height * 1.7F;
	   }
	
	@Override
	public boolean canSpawn(IWorld worldIn, SpawnReason spawnReasonIn) {
		return this.getPosY() > 45 && this.getPosY() < this.world.getSeaLevel();
	}
	   

}






