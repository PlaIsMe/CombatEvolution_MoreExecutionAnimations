package com.pla.combat_evolution_resurrection.compat;

import com.pla.annoyingvillagers.init.AnnoyingVillagersModItems;
import com.pla.combat_evolution_resurrection.gameasset.CombatEvolutionResurrectionExecutionType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.shelmarow.combat_evolution.api.event.RegisterCustomExecutionEvent;
import net.shelmarow.combat_evolution.execution.ExecutionTypeManager;
import yesman.epicfight.world.capabilities.item.CapabilityItem;
import yesman.epicfight.world.capabilities.item.WeaponCategory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnnoyingVillagers {
    private static final List<ResourceLocation> listAvSwords = new ArrayList<>(Arrays.asList(
            AnnoyingVillagersModItems.BLACK_FIRE_SWORD.getId(),
            AnnoyingVillagersModItems.BLUE_FLAME_SWORD.getId(),
            AnnoyingVillagersModItems.CLOW_SWORD.getId(),
            AnnoyingVillagersModItems.DIAMOND_ATTRACTOR_SWORD.getId(),
            AnnoyingVillagersModItems.DIAMOND_BLASTER_SWORD.getId(),
            AnnoyingVillagersModItems.DIAMOND_SABRE.getId(),
            AnnoyingVillagersModItems.DNAX_HOOKED_SWORD.getId(),
            AnnoyingVillagersModItems.FLANKER_HOOKED_SWORD.getId(),
            AnnoyingVillagersModItems.JADE_SWORD.getId(),
            AnnoyingVillagersModItems.NETHERITE_GREATBLADE.getId(),
            AnnoyingVillagersModItems.PALADIN_SWORD.getId(),
            AnnoyingVillagersModItems.RED_DIAMOND_SWORD.getId(),
            AnnoyingVillagersModItems.RUBY_SWORD.getId(),
            AnnoyingVillagersModItems.RUBY_KNIGHT_SWORD.getId(),
            AnnoyingVillagersModItems.THUNDER_DIAMOND_BLADE.getId()
    ));

    public static void registerAvExecute(RegisterCustomExecutionEvent event) {
        event.RegisterExecutionByItem(AnnoyingVillagersModItems.OBSIDIAN_WEAPON.getId(), CombatEvolutionResurrectionExecutionType.WRESTLING);
        event.RegisterExecutionByItem(AnnoyingVillagersModItems.SHADOW_OBSIDIAN_WEAPON.getId(), CombatEvolutionResurrectionExecutionType.WRESTLING);
        event.registerExecutionByItem(AnnoyingVillagersModItems.SHADOW_OBSIDIAN_PILLAR.getId(), ExecutionTypeManager.TACHI_TYPE);
        event.registerExecutionByItem(AnnoyingVillagersModItems.SHADOW_OBSIDIAN_SWORD.getId(), ExecutionTypeManager.TACHI_TYPE);
        event.RegisterExecutionByItem(AnnoyingVillagersModItems.BEDROCK_WEAPON.getId(), CombatEvolutionResurrectionExecutionType.WRESTLING_BACK);
        event.RegisterExecutionByItem(AnnoyingVillagersModItems.NULL_WEAPON.getId(), CombatEvolutionResurrectionExecutionType.STRANGLE);
        event.RegisterExecutionByItem(AnnoyingVillagersModItems.ENDER_AEGIS.getId(), CombatEvolutionResurrectionExecutionType.FIST);
        event.RegisterExecutionByItem(AnnoyingVillagersModItems.CRAFTING_TABLE.getId(), CombatEvolutionResurrectionExecutionType.DUAL_GREATSWORD);
        event.RegisterExecutionByItem(AnnoyingVillagersModItems.BLUE_DEMON_TRIDENT.getId(), CombatEvolutionResurrectionExecutionType.TRIDENT);
        event.registerExecutionByItem(AnnoyingVillagersModItems.GREAT_SWORD.getId(), CapabilityItem.Styles.COMMON, (item, livingEntityPatch) -> {
            WeaponCategory weaponCategory = livingEntityPatch.getHoldingItemCapability(InteractionHand.OFF_HAND).getWeaponCategory();
            if (livingEntityPatch.isOffhandItemValid() && weaponCategory == CapabilityItem.WeaponCategories.SHIELD) {
                return CombatEvolutionResurrectionExecutionType.SHIELD;
            }
            return CombatEvolutionResurrectionExecutionType.STAB;
        });
        event.registerExecutionByItem(AnnoyingVillagersModItems.WOOPIE_THE_SWORD.getId(), CapabilityItem.Styles.COMMON, (item, livingEntityPatch) -> {
            WeaponCategory weaponCategory = livingEntityPatch.getHoldingItemCapability(InteractionHand.OFF_HAND).getWeaponCategory();
            if (livingEntityPatch.isOffhandItemValid() && weaponCategory == CapabilityItem.WeaponCategories.SHIELD) {
                return CombatEvolutionResurrectionExecutionType.SHIELD;
            }
            return CombatEvolutionResurrectionExecutionType.STAB;
        });
        listAvSwords.forEach(avSword -> {
            event.registerExecutionByItem(avSword, CapabilityItem.Styles.ONE_HAND, (item, livingEntityPatch) -> {
                WeaponCategory weaponCategory = livingEntityPatch.getHoldingItemCapability(InteractionHand.OFF_HAND).getWeaponCategory();
                if (livingEntityPatch.isOffhandItemValid() && weaponCategory == CapabilityItem.WeaponCategories.SHIELD) {
                    return CombatEvolutionResurrectionExecutionType.SHIELD;
                }
                return CombatEvolutionResurrectionExecutionType.STAB;
            });
            event.registerExecutionByItem(avSword, CapabilityItem.Styles.TWO_HAND, CombatEvolutionResurrectionExecutionType.DUAL_STAB);
        });
    }
}
