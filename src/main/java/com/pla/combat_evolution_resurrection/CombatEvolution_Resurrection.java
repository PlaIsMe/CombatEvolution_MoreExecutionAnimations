package com.pla.combat_evolution_resurrection;
import com.pla.combat_evolution_resurrection.event.ExecuteEvent;
import com.pla.combat_evolution_resurrection.gameasset.CombatEvolutionResurrectionAnimations;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;

@Mod(CombatEvolution_Resurrection.MODID)
public class CombatEvolution_Resurrection {
    public static final String MODID = "combat_evolution_resurrection";

    public CombatEvolution_Resurrection(IEventBus modEventBus) {
        // Combat Evolution posts this event only on its own mod bus.
        ModList.get().getModContainerById("combat_evolution").orElseThrow()
                .getEventBus().addListener(ExecuteEvent::registerExecution);
        modEventBus.addListener(CombatEvolutionResurrectionAnimations::registerAnimations);
    }
}
