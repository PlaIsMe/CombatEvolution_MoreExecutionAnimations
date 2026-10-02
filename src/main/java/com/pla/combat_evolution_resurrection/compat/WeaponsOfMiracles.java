package com.pla.combat_evolution_resurrection.compat;

import com.pla.combat_evolution_resurrection.gameasset.CombatEvolutionResurrectionExecutionType;
import net.shelmarow.combat_evolution.api.event.RegisterCustomExecutionEvent;
import reascer.wom.world.capabilities.item.WOMWeaponCategories;

public class WeaponsOfMiracles {
    public static void registerWomExecute(RegisterCustomExecutionEvent event) {
        event.registerExecutionByCategory(WOMWeaponCategories.TORMENT, CombatEvolutionResurrectionExecutionType.GREATSWORD);
        event.registerExecutionByCategory(WOMWeaponCategories.ENDERBLASTER, CombatEvolutionResurrectionExecutionType.FIST);
        event.registerExecutionByCategory(WOMWeaponCategories.NAPOLEON, CombatEvolutionResurrectionExecutionType.SPEAR);
    }
}
