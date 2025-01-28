package model;

import utils.NivelGravedad;
import utils.TipoEmergencia;

public class Incendio  extends Emergencia{
  

    // Constructor
    public Incendio(TipoEmergencia tipoEmergencia, String direccion, String telefono, String fecha, NivelGravedad nivelGravedad) {
        super(tipoEmergencia, direccion, telefono, fecha, nivelGravedad);
        
    }

}
