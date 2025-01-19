public class accidenteVehicular  extends Emergencia{
    public int nunDeVehiculosInvolucrados;

    // Constructor
    public accidenteVehicular(String tipoEmergencia, String direccion, String telefono, String fecha, String gravedad, int nunDeVehiculosInvolucrados) {
        super(tipoEmergencia, direccion, telefono, fecha, gravedad);
        this.nunDeVehiculosInvolucrados = nunDeVehiculosInvolucrados;
    }

}
