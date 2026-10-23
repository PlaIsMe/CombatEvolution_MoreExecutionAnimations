package com.pla.combat_evolution_resurrection.compat;

import com.pla.combat_evolution_resurrection.gameasset.CombatEvolutionResurrectionExecutionType;
import net.corruptdog.cdm.world.CorruptWeaponCategories;
import net.shelmarow.combat_evolution.api.event.RegisterCustomExecutionEvent;
import yesman.epicfight.world.capabilities.item.CapabilityItem;

public class CdMoveset {
    public static void registerCdmovesetExecute(RegisterCustomExecutionEvent event) {
        event.registerExecutionByCategory(CorruptWeaponCategories.GREAT_TACHI, CombatEvolutionResurrectionExecutionType.TACHI);
        event.registerExecutionByCategory(CorruptWeaponCategories.KATANA, CombatEvolutionResurrectionExecutionType.KATANA);
        event.registerExecutionByCategory(CorruptWeaponCategories.PHANTOM_KATANA, CombatEvolutionResurrectionExecutionType.KATANA);
        event.registerExecutionByCategory(CorruptWeaponCategories.S_DAGGER, CapabilityItem.Styles.ONE_HAND, CombatEvolutionResurrectionExecutionType.DAGGER);
        event.registerExecutionByCategory(CorruptWeaponCategories.S_DAGGER, CapabilityItem.Styles.TWO_HAND, CombatEvolutionResurrectionExecutionType.DUAL_DAGGER);
        event.registerExecutionByCategory(CorruptWeaponCategories.S_GREATSWORD, CapabilityItem.Styles.TWO_HAND, CombatEvolutionResurrectionExecutionType.GREATSWORD);
        event.registerExecutionByCategory(CorruptWeaponCategories.S_GREATSWORD, CapabilityItem.Styles.ONE_HAND, CombatEvolutionResurrectionExecutionType.DUAL_GREATSWORD);
        event.registerExecutionByCategory(CorruptWeaponCategories.S_LONGSWORD, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> CombatEvolutionResurrectionExecutionType.LONGSWORD));
        event.registerExecutionByCategory(CorruptWeaponCategories.S_SPEAR, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> CombatEvolutionResurrectionExecutionType.SPEAR));
        event.registerExecutionByCategory(CorruptWeaponCategories.S_SWORD, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> CombatEvolutionResurrectionExecutionType.SWORD));
        event.registerExecutionByCategory(CorruptWeaponCategories.S_TACHI, CombatEvolutionResurrectionExecutionType.TACHI);
        event.registerExecutionByCategory(CorruptWeaponCategories.YAMATO, CombatEvolutionResurrectionExecutionType.YAMATO);
    }
}
