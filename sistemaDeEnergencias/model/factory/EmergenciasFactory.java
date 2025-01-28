package model.factory;

import model.Emergencia;
import model.accidenteVehicular;
import model.Incendio;
import model.Robo;
import utils.TipoEmergencia;
import utils.NivelGravedad;

public class EmergenciasFactory {

    public static Emergencia crearEmergencia(TipoEmergencia tipoEmergencia, String direccion, String telefono, String fecha, NivelGravedad nivelGravedad,int nunDeVehiculosInvolucrados) {

        switch (tipoEmergencia) {
            case ACCIDENTEVEHICULAR:
                return new accidenteVehicular(tipoEmergencia, direccion, telefono, fecha, nivelGravedad, nunDeVehiculosInvolucrados);
            case ROBO:
                return new Robo(tipoEmergencia, direccion, telefono, fecha, nivelGravedad);
            case INCENDIO:
                return new Incendio(tipoEmergencia, direccion, telefono, fecha, nivelGravedad);
            default:
                return null;
        }

    }

}
