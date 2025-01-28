package model.Strategy;

import java.util.List;

import model.Emergencia;
import model.interfaces.PriorizacionStrategy;

public class PriorizacionContext {

    private PriorizacionStrategy strategy;

    public PriorizacionContext(PriorizacionStrategy strategy) {
        this.strategy = strategy;
    }

    public void priorizarEmergencias(List<Emergencia> emergencias) {
        strategy.priorizarEmergencias(emergencias);
    }

}
