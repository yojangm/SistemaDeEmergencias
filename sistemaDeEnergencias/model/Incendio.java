package model;

import utils.NivelGravedad;

public class Incendio  extends Emergencia{
  

    // Constructor
    public Incendio( String direccion, String telefono, String fecha, NivelGravedad nivelGravedad) {
        super("Incendio", direccion, telefono, fecha, nivelGravedad);
        
    }

}
