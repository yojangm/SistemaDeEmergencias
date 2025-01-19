package model;
import utils.tipoEmergencia;
public class accidenteVehicular  extends Emergencia{
   

    // Constructor
    public accidenteVehicular(String direccion, String telefono, String fecha, String gravedad, int nunDeVehiculosInvolucrados) {
        super( "Accidente_Vehicular", direccion, telefono, fecha, gravedad);
        
    }

}
