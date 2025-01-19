package model;
public class Robo  extends Emergencia{
    public String tipoRobo;

    // Constructor
    public Robo(String tipoRobo, String direccion, String telefono, String fecha, String gravedad) {
        super(tipoRobo, direccion, telefono, fecha, gravedad);
        this.tipoRobo = tipoRobo;
    }



}
