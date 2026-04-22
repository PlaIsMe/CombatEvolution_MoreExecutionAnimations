package com.pla.combat_evolution_resurrection.event;

import com.pla.combat_evolution_resurrection.CombatEvolution_Resurrection;
import com.pla.combat_evolution_resurrection.compat.WeaponsOfMiracles;
import com.pla.combat_evolution_resurrection.compat.AnnoyingVillagers;
import com.pla.combat_evolution_resurrection.gameasset.CombatEvolutionResurrectionExecutionType;
import net.corruptdog.cdm.world.CorruptWeaponCategories;
import net.minecraft.world.InteractionHand;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.shelmarow.combat_evolution.api.event.RegisterCustomExecutionEvent;
import yesman.epicfight.world.capabilities.item.CapabilityItem;
import yesman.epicfight.world.capabilities.item.WeaponCategory;

@Mod.EventBusSubscriber(modid = CombatEvolution_Resurrection.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExecuteEvent {
    @SubscribeEvent
    public static void registerExecution(RegisterCustomExecutionEvent event){
        if (ModList.get().isLoaded("annoyingvillagers")) {
            AnnoyingVillagers.registerAvExecute(event);
        }
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.SWORD, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> {
            WeaponCategory weaponCategory = livingEntityPatch.getHoldingItemCapability(InteractionHand.OFF_HAND).getWeaponCategory();
            if (livingEntityPatch.isOffhandItemValid() && weaponCategory == CapabilityItem.WeaponCategories.SHIELD) {
                return CombatEvolutionResurrectionExecutionType.SHIELD;
            }
            return CombatEvolutionResurrectionExecutionType.SWORD;
        }));
        event.RegisterExecutionByCategory(CapabilityItem.WeaponCategories.FIST, CombatEvolutionResurrectionExecutionType.FIST);
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.SPEAR, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> {
            WeaponCategory weaponCategory = livingEntityPatch.getHoldingItemCapability(InteractionHand.OFF_HAND).getWeaponCategory();
            if (livingEntityPatch.isOffhandItemValid() && weaponCategory == CapabilityItem.WeaponCategories.SHIELD) {
                return CombatEvolutionResurrectionExecutionType.SHIELD;
            }
            return CombatEvolutionResurrectionExecutionType.SPEAR;
        }));
        event.RegisterExecutionByCategory(CapabilityItem.WeaponCategories.GREATSWORD, CombatEvolutionResurrectionExecutionType.GREATSWORD);
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.TRIDENT, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> {
            WeaponCategory weaponCategory = livingEntityPatch.getHoldingItemCapability(InteractionHand.OFF_HAND).getWeaponCategory();
            if (livingEntityPatch.isOffhandItemValid() && weaponCategory == CapabilityItem.WeaponCategories.SHIELD) {
                return CombatEvolutionResurrectionExecutionType.SHIELD;
            }
            return CombatEvolutionResurrectionExecutionType.TRIDENT;
        }));
        event.RegisterExecutionByCategory(CapabilityItem.WeaponCategories.TACHI, CombatEvolutionResurrectionExecutionType.TACHI);
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.DAGGER, CapabilityItem.Styles.ONE_HAND, CombatEvolutionResurrectionExecutionType.DAGGER);
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.DAGGER, CapabilityItem.Styles.TWO_HAND, CombatEvolutionResurrectionExecutionType.DUAL_DAGGER);
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.LONGSWORD, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> {
            WeaponCategory weaponCategory = livingEntityPatch.getHoldingItemCapability(InteractionHand.OFF_HAND).getWeaponCategory();
            if (livingEntityPatch.isOffhandItemValid() && weaponCategory == CapabilityItem.WeaponCategories.SHIELD) {
                return CombatEvolutionResurrectionExecutionType.SHIELD;
            }
            return CombatEvolutionResurrectionExecutionType.LONGSWORD;
        }));
        event.RegisterExecutionByCategory(CapabilityItem.WeaponCategories.UCHIGATANA, CombatEvolutionResurrectionExecutionType.KATANA);
        event.RegisterExecutionByCategory(CorruptWeaponCategories.GREAT_TACHI, CombatEvolutionResurrectionExecutionType.TACHI);
        event.RegisterExecutionByCategory(CorruptWeaponCategories.KATANA, CombatEvolutionResurrectionExecutionType.KATANA);
        event.RegisterExecutionByCategory(CorruptWeaponCategories.PHANTOM_KATANA, CombatEvolutionResurrectionExecutionType.KATANA);
        event.registerExecutionByCategory(CorruptWeaponCategories.S_DAGGER, CapabilityItem.Styles.ONE_HAND, CombatEvolutionResurrectionExecutionType.DAGGER);
        event.registerExecutionByCategory(CorruptWeaponCategories.S_DAGGER, CapabilityItem.Styles.TWO_HAND, CombatEvolutionResurrectionExecutionType.DUAL_DAGGER);
        event.registerExecutionByCategory(CorruptWeaponCategories.S_GREATSWORD, CapabilityItem.Styles.TWO_HAND, CombatEvolutionResurrectionExecutionType.GREATSWORD);
        event.registerExecutionByCategory(CorruptWeaponCategories.S_GREATSWORD, CapabilityItem.Styles.ONE_HAND, CombatEvolutionResurrectionExecutionType.DUAL_GREATSWORD);
        event.registerExecutionByCategory(CorruptWeaponCategories.S_LONGSWORD, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> {
            WeaponCategory weaponCategory = livingEntityPatch.getHoldingItemCapability(InteractionHand.OFF_HAND).getWeaponCategory();
            if (livingEntityPatch.isOffhandItemValid() && weaponCategory == CapabilityItem.WeaponCategories.SHIELD) {
                return CombatEvolutionResurrectionExecutionType.SHIELD;
            }
            return CombatEvolutionResurrectionExecutionType.LONGSWORD;
        }));
        event.registerExecutionByCategory(CorruptWeaponCategories.S_SPEAR, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> {
            WeaponCategory weaponCategory = livingEntityPatch.getHoldingItemCapability(InteractionHand.OFF_HAND).getWeaponCategory();
            if (livingEntityPatch.isOffhandItemValid() && weaponCategory == CapabilityItem.WeaponCategories.SHIELD) {
                return CombatEvolutionResurrectionExecutionType.SHIELD;
            }
            return CombatEvolutionResurrectionExecutionType.SPEAR;
        }));
        event.registerExecutionByCategory(CorruptWeaponCategories.S_SWORD, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> {
            WeaponCategory weaponCategory = livingEntityPatch.getHoldingItemCapability(InteractionHand.OFF_HAND).getWeaponCategory();
            if (livingEntityPatch.isOffhandItemValid() && weaponCategory == CapabilityItem.WeaponCategories.SHIELD) {
                return CombatEvolutionResurrectionExecutionType.SHIELD;
            }
            return CombatEvolutionResurrectionExecutionType.SWORD;
        }));
        event.RegisterExecutionByCategory(CorruptWeaponCategories.S_TACHI, CombatEvolutionResurrectionExecutionType.TACHI);
        event.RegisterExecutionByCategory(CorruptWeaponCategories.YAMATO, CombatEvolutionResurrectionExecutionType.YAMATO);
        if (ModList.get().isLoaded("wom")) {
            WeaponsOfMiracles.registerAvExecute(event);
        }
    }
}
