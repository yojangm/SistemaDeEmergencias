package model.factory;


import model.Emergencia;
import model.accidenteVehicular;
import model.Incendio;
import model.Robo;
import utils.TipoEmergencia;
import utils.NivelGravedad;

public class EmergenciasFactory {

    public static Emergencia crearEmergencia(TipoEmergencia tipo, String direccion, String telefono, String fecha, NivelGravedad nivelGravedad,int nunDeVehiculosInvolucrados) {

        switch (tipo) {
            case ACCIDENTEVEHICULAR:
                return new accidenteVehicular(direccion, telefono, fecha, nivelGravedad, nunDeVehiculosInvolucrados);
            case ROBO:
                return new Robo(direccion, telefono, fecha, nivelGravedad);
            case INCENDIO:
                return new Incendio(direccion, telefono, fecha, nivelGravedad);
            default:
                return null;
        }

    }

}
