package com.rena.renamob.entities;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.Pose;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.Effects;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class CalamarAgresivo extends WaterMobEntity {
	
	public CalamarAgresivo(EntityType<? extends WaterMobEntity> type, World p_i48565_2_) {
		super(type, p_i48565_2_);
		this.rand.setSeed((long)this.getEntityId());
	    this.rotationVelocity = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
	    
	}
	
	@Override
	protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
		
		return 1.5F * sizeIn.height;
	}

	public float squidPitch;
	public float prevSquidPitch;
	public float squidYaw;
	public float prevSquidYaw;
	public float squidRotation;
	public float prevSquidRotation;
	public float tentacleAngle;
	public float lastTentacleAngle;
	private float randomMotionSpeed;
	private float rotationVelocity;
	private float rotateSpeed;
	private float randomMotionVecX;
	private float randomMotionVecY;
	private float randomMotionVecZ;

	
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
		
		this.goalSelector.addGoal(0, new CalamarAgresivo.MoveRandomGoal(this));
	    this.goalSelector.addGoal(1, new CalamarAgresivo.FleeGoal());
	    this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 12.0F));
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
	
	protected boolean canTriggerWalking() {
	      return false;
	   }
	
	public void livingTick() {
	      super.livingTick();
	      this.prevSquidPitch = this.squidPitch;
	      this.prevSquidYaw = this.squidYaw;
	      this.prevSquidRotation = this.squidRotation;
	      this.lastTentacleAngle = this.tentacleAngle;
	      this.squidRotation += this.rotationVelocity;
	      if ((double)this.squidRotation > (Math.PI * 2D)) {
	         if (this.world.isRemote) {
	            this.squidRotation = ((float)Math.PI * 2F);
	         } else {
	            this.squidRotation = (float)((double)this.squidRotation - (Math.PI * 2D));
	            if (this.rand.nextInt(10) == 0) {
	               this.rotationVelocity = 1.0F / (this.rand.nextFloat() + 1.0F) * 0.2F;
	            }

	            this.world.setEntityState(this, (byte)19);
	         }
	      }

	      if (this.isInWaterOrBubbleColumn()) {
	         if (this.squidRotation < (float)Math.PI) {
	            float f = this.squidRotation / (float)Math.PI;
	            this.tentacleAngle = MathHelper.sin(f * f * (float)Math.PI) * (float)Math.PI * 0.25F;
	            if ((double)f > 0.75D) {
	               this.randomMotionSpeed = 1.0F;
	               this.rotateSpeed = 1.0F;
	            } else {
	               this.rotateSpeed *= 0.8F;
	            }
	         } else {
	            this.tentacleAngle = 0.0F;
	            this.randomMotionSpeed *= 0.9F;
	            this.rotateSpeed *= 0.99F;
	         }

	         if (!this.world.isRemote) {
	            this.setMotion((double)(this.randomMotionVecX * this.randomMotionSpeed), (double)(this.randomMotionVecY * this.randomMotionSpeed), (double)(this.randomMotionVecZ * this.randomMotionSpeed));
	         }

	         Vector3d vector3d = this.getMotion();
	         float f1 = MathHelper.sqrt(horizontalMag(vector3d));
	         this.renderYawOffset += (-((float)MathHelper.atan2(vector3d.x, vector3d.z)) * (180F / (float)Math.PI) - this.renderYawOffset) * 0.1F;
	         this.rotationYaw = this.renderYawOffset;
	         this.squidYaw = (float)((double)this.squidYaw + Math.PI * (double)this.rotateSpeed * 1.5D);
	         this.squidPitch += (-((float)MathHelper.atan2((double)f1, vector3d.y)) * (180F / (float)Math.PI) - this.squidPitch) * 0.1F;
	      } else {
	         this.tentacleAngle = MathHelper.abs(MathHelper.sin(this.squidRotation)) * (float)Math.PI * 0.25F;
	         if (!this.world.isRemote) {
	            double d0 = this.getMotion().y;
	            if (this.isPotionActive(Effects.LEVITATION)) {
	               d0 = 0.05D * (double)(this.getActivePotionEffect(Effects.LEVITATION).getAmplifier() + 1);
	            } else if (!this.hasNoGravity()) {
	               d0 -= 0.08D;
	            }

	            this.setMotion(0.0D, d0 * (double)0.98F, 0.0D);
	         }

	         this.squidPitch = (float)((double)this.squidPitch + (double)(-90.0F - this.squidPitch) * 0.02D);
	      }

	   }
	
	public void travel(Vector3d travelVector) {
        if (this.isServerWorld() && this.isInWater()) {
            this.moveRelative(this.getAIMoveSpeed(), travelVector);
            this.move(MoverType.SELF, this.getMotion());
            this.setMotion(this.getMotion().scale(0.9D));
            if (this.getAttackTarget() == null) {
                this.setMotion(this.getMotion().add(0.0D, -0.005D, 0.0D));
            }
        } else {
            super.travel(travelVector);
        }
	}
	
	class MoveRandomGoal extends Goal {
	      @SuppressWarnings("unused")
		private final CalamarAgresivo calamar;

	      public MoveRandomGoal(CalamarAgresivo p_i48823_2_) {
	         this.calamar = p_i48823_2_;
	      }

		@Override
		public boolean shouldExecute() {
			return true;
			}
		
		 public void tick() {
	         int i = this.calamar.getIdleTime();
	         if (i > 100) {
	            this.calamar.setMovementVector(0.0F, 0.0F, 0.0F);
	         } else if (this.calamar.getRNG().nextInt(50) == 0 || !this.calamar.inWater || !this.calamar.hasMovementVector()) {
	            float f = this.calamar.getRNG().nextFloat() * ((float)Math.PI * 2F);
	            float f1 = MathHelper.cos(f) * 0.2F;
	            float f2 = -0.1F + this.calamar.getRNG().nextFloat() * 0.2F;
	            float f3 = MathHelper.sin(f) * 0.2F;
	            this.calamar.setMovementVector(f1, f2, f3);
	         }

	      }
		
		
		}

	public void setMovementVector(float randomMotionVecXIn, float randomMotionVecYIn, float randomMotionVecZIn) {
	      this.randomMotionVecX = randomMotionVecXIn;
	      this.randomMotionVecY = randomMotionVecYIn;
	      this.randomMotionVecZ = randomMotionVecZIn;
	   }

	   public boolean hasMovementVector() {
	      return this.randomMotionVecX != 0.0F || this.randomMotionVecY != 0.0F || this.randomMotionVecZ != 0.0F;
	   }
	   
	   
	   
	   
	   class FleeGoal extends Goal {
		      private int tickCounter;

		      private FleeGoal() {
		      }

		      /**
		       * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
		       * method as well.
		       */
		      public boolean shouldExecute() {
		         LivingEntity livingentity = CalamarAgresivo.this.getRevengeTarget();
		         if (CalamarAgresivo.this.isInWater() && livingentity != null) {
		            return CalamarAgresivo.this.getDistanceSq(livingentity) < 100.0D;
		         } else {
		            return false;
		         }
		      }

		      /**
		       * Execute a one shot task or start executing a continuous task
		       */
		      public void startExecuting() {
		         this.tickCounter = 0;
		      }

		      /**
		       * Keep ticking a continuous task that has already been started
		       */
		      @SuppressWarnings("deprecation")
			public void tick() {
		         ++this.tickCounter;
		         LivingEntity livingentity = CalamarAgresivo.this.getRevengeTarget();
		         if (livingentity != null) {
		            Vector3d vector3d = new Vector3d(CalamarAgresivo.this.getPosX() - livingentity.getPosX(), CalamarAgresivo.this.getPosY() - livingentity.getPosY(), CalamarAgresivo.this.getPosZ() - livingentity.getPosZ());
		            BlockState blockstate = CalamarAgresivo.this.world.getBlockState(new BlockPos(CalamarAgresivo.this.getPosX() + vector3d.x, CalamarAgresivo.this.getPosY() + vector3d.y, CalamarAgresivo.this.getPosZ() + vector3d.z));
		            FluidState fluidstate = CalamarAgresivo.this.world.getFluidState(new BlockPos(CalamarAgresivo.this.getPosX() + vector3d.x, CalamarAgresivo.this.getPosY() + vector3d.y, CalamarAgresivo.this.getPosZ() + vector3d.z));
		            if (fluidstate.isTagged(FluidTags.WATER) || blockstate.isAir()) {
		               double d0 = vector3d.length();
		               if (d0 > 0.0D) {
		                  vector3d.normalize();
		                  float f = 3.0F;
		                  if (d0 > 5.0D) {
		                     f = (float)((double)f - (d0 - 5.0D) / 5.0D);
		                  }

		                  if (f > 0.0F) {
		                     vector3d = vector3d.scale((double)f);
		                  }
		               }

		               if (blockstate.isAir()) {
		                  vector3d = vector3d.subtract(0.0D, vector3d.y, 0.0D);
		               }

		               CalamarAgresivo.this.setMovementVector((float)vector3d.x / 20.0F, (float)vector3d.y / 20.0F, (float)vector3d.z / 20.0F);
		            }

		            if (this.tickCounter % 10 == 5) {
		            	CalamarAgresivo.this.world.addParticle(ParticleTypes.BUBBLE, CalamarAgresivo.this.getPosX(), CalamarAgresivo.this.getPosY(), CalamarAgresivo.this.getPosZ(), 0.0D, 0.0D, 0.0D);
		            }

		         }
		      }
		   }
	   

	}






