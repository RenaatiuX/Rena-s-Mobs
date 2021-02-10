package com.rena.renamob.entities.ia;

import com.rena.renamob.entities.CalamarAgresivoEntity;

import net.minecraft.entity.ai.goal.MeleeAttackGoal;

public class CalamarAgresivoAIMelee extends MeleeAttackGoal {

    public CalamarAgresivoAIMelee(CalamarAgresivoEntity calamaragresivo, double v, boolean b) {
        super(calamaragresivo, v, b);
    }

    public boolean shouldExecute(){
        if(this.attacker.getAttackTarget() == null || ((CalamarAgresivoEntity)this.attacker).canAttack(this.attacker.getAttackTarget())){
            return false;
        }
        return super.shouldExecute();
    }
}
