package model;

import utils.NivelGravedad;
import utils.TipoEmergencia;

public class Robo  extends Emergencia{
  

    // Constructor
    public Robo(TipoEmergencia tipoEmergencia, String direccion, String telefono, String fecha, NivelGravedad nivelGravedad) {
        super(tipoEmergencia, direccion, telefono, fecha, nivelGravedad);
     
    }



}
