package model;

import utils.NivelGravedad;
import utils.TipoEmergencia;

public class accidenteVehicular  extends Emergencia{
   

    // Constructor
    public accidenteVehicular(TipoEmergencia tipoEmergencia, String direccion, String telefono, String fecha, NivelGravedad nivelGravedad, int nunDeVehiculosInvolucrados) {
        super( tipoEmergencia, direccion, telefono, fecha, nivelGravedad);
        
    }

}
