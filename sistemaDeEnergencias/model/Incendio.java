package model;
public class Incendio  extends Emergencia{
    public  String tipoIncendio;

    // Constructor
    public Incendio(String tipoIncendio, String direccion, String telefono, String fecha, String gravedad) {
        super(tipoIncendio, direccion, telefono, fecha, gravedad);
        this.tipoIncendio = tipoIncendio;
    }

}
