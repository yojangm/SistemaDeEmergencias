package model;

import utils.NivelGravedad;

public class accidenteVehicular  extends Emergencia{
   

    // Constructor
    public accidenteVehicular(String direccion, String telefono, String fecha, NivelGravedad nivelGravedad, int nunDeVehiculosInvolucrados) {
        super( "AccidenteVehicular", direccion, telefono, fecha, nivelGravedad);
        
    }

}
