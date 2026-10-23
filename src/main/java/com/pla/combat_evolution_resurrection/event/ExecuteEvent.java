package com.pla.combat_evolution_resurrection.event;

import com.pla.combat_evolution_resurrection.CombatEvolution_Resurrection;
import com.pla.combat_evolution_resurrection.compat.CdMoveset;
import com.pla.combat_evolution_resurrection.compat.WeaponsOfMiracles;
import com.pla.combat_evolution_resurrection.gameasset.CombatEvolutionResurrectionExecutionType;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.shelmarow.combat_evolution.api.event.RegisterCustomExecutionEvent;
import yesman.epicfight.world.capabilities.item.CapabilityItem;

@Mod.EventBusSubscriber(modid = CombatEvolution_Resurrection.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ExecuteEvent {
    @SubscribeEvent
    public static void registerExecution(RegisterCustomExecutionEvent event){
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.SWORD, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> CombatEvolutionResurrectionExecutionType.SWORD));
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.FIST, CombatEvolutionResurrectionExecutionType.FIST);
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.SPEAR, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> CombatEvolutionResurrectionExecutionType.SPEAR));
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.GREATSWORD, CombatEvolutionResurrectionExecutionType.GREATSWORD);
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.TRIDENT, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> CombatEvolutionResurrectionExecutionType.TRIDENT));
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.TACHI, CombatEvolutionResurrectionExecutionType.TACHI);
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.DAGGER, CapabilityItem.Styles.ONE_HAND, CombatEvolutionResurrectionExecutionType.DAGGER);
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.DAGGER, CapabilityItem.Styles.TWO_HAND, CombatEvolutionResurrectionExecutionType.DUAL_DAGGER);
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.LONGSWORD, CapabilityItem.Styles.COMMON, ((item, livingEntityPatch) -> CombatEvolutionResurrectionExecutionType.LONGSWORD));
        event.registerExecutionByCategory(CapabilityItem.WeaponCategories.UCHIGATANA, CombatEvolutionResurrectionExecutionType.KATANA);
        if (ModList.get().isLoaded("cdmoveset")) {
            CdMoveset.registerCdmovesetExecute(event);
        }
        if (ModList.get().isLoaded("wom")) {
            WeaponsOfMiracles.registerWomExecute(event);
        }
    }
}
