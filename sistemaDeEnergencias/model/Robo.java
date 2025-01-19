package model;

import utils.NivelGravedad;

public class Robo  extends Emergencia{
  

    // Constructor
    public Robo( String direccion, String telefono, String fecha, NivelGravedad nivelGravedad) {
        super("Robo", direccion, telefono, fecha, nivelGravedad);
     
    }



}
