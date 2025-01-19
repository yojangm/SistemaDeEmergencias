package model;
import utils.tipoEmergencia;
public class Incendio  extends Emergencia{
  

    // Constructor
    public Incendio( String direccion, String telefono, String fecha, String gravedad) {
        super("Incendio", direccion, telefono, fecha, gravedad);
        
    }

}
