package model.services;
import model.Emergencia;

public class Ambulancia implements Responder{
    private int recursosDisponibles; // Número de ambulancias disponibles
    private String ubicacion; // Ubicación actual de la estación de bomberos

    // Constructor
    public Ambulancia(int recursosDisponibles, String ubicacion) {
        this.recursosDisponibles = recursosDisponibles;
        this.ubicacion = ubicacion;
    }
    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        if ("Accidente_vehicular".equalsIgnoreCase(emergencia.getTipoEmergencia())) {
            if (recursosDisponibles > 0) {
                System.out.println("Ambulancia atendiendo un " + emergencia.getTipoEmergencia() + " en " + emergencia.getDireccion());
                System.out.println("Gravedad: " + emergencia.getNivelGravedad());
                recursosDisponibles--; // Reducir recursos después de asignarlos
            } else {
                System.out.println("No hay recursos disponibles para atender esta emergencia.");
            }
        } else {
            System.out.println("Esta emergencia no es relevante para las ambulancias.");
        }
    }
    @Override
    public void evaluarEstado(Emergencia emergencia) {
        System.out.println("Estado de recursos disponibles: " + recursosDisponibles);
        if (recursosDisponibles > 0) {
            System.out.println("Ambulancias disponibles para atender emergencias.");
        } else {
            System.out.println("Ambulancias no disponibles en este momento.");
        }
        
    }

     // Métodos adicionales
     public int getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
