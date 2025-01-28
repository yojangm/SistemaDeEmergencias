package model.Strategy;

import java.util.Comparator;
import java.util.List;

import model.Emergencia;
import model.interfaces.PriorizacionStrategy;

public class PriorizacionPorgravedadStrategy implements PriorizacionStrategy{

    @Override
    public void priorizarEmergencias(List<Emergencia> emergencias) {
        // Realizar la priorización por gravedad
        emergencias.sort(Comparator.comparing(e -> e.getNivelGravedad().ordinal()));
        
        // Agregamos la lógica para los niveles de gravedad
        for (Emergencia emergencia : emergencias) {
            switch (emergencia.getNivelGravedad()) {
                case ALTO:
                System.out.println("Priorizando emergencia de alta gravedad de tipo " + emergencia.getTipoEmergencia() + " en " + emergencia.getDireccion());
                break;
                case MEDIO:
                System.out.println("Priorizando emergencia de media gravedad de tipo " + emergencia.getTipoEmergencia() + " en " + emergencia.getDireccion());
                break;
                case BAJO:
                System.out.println("Priorizando emergencia de baja gravedad de tipo " + emergencia.getTipoEmergencia() + " en " + emergencia.getDireccion());
                    break;
                default:
                System.out.println("Nivel de gravedad no válido para esta emergencia.");
                    break;
            }
        }

    }
}
