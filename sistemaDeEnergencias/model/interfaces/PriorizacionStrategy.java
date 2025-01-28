package model.interfaces;

import java.util.List;

import model.Emergencia;

public interface PriorizacionStrategy {
    void priorizarEmergencias(List<Emergencia> emergencias);
}
