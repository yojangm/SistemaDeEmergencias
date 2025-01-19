public class Bomberos implements Responder{

    private int recursosDisponibles; // Número de camiones disponibles
    private String ubicacion; // Ubicación actual de la estación de bomberos

    // Constructor
    public Bomberos(int recursosDisponibles, String ubicacion) {
        this.recursosDisponibles = recursosDisponibles;
        this.ubicacion = ubicacion;
    }
    @Override
    public void atenderEmergencia(Emergencia emergencia) {
        if ("Incendio".equalsIgnoreCase(emergencia.getTipoEmergencia())) {
            if (recursosDisponibles > 0) {
                System.out.println("Bomberos atendiendo un " + emergencia.getTipoEmergencia() + " en " + emergencia.getDireccion());
                System.out.println("Gravedad: " + emergencia.getGravidad());
                recursosDisponibles--; // Reducir recursos después de asignarlos
            } else {
                System.out.println("No hay recursos disponibles para atender esta emergencia.");
            }
        } else {
            System.out.println("Esta emergencia no es relevante para los bomberos.");
        }
    }
    @Override
    public void evaluarEstado(Emergencia emergencia) {
        System.out.println("Estado de recursos disponibles: " + recursosDisponibles);
        if (recursosDisponibles > 0) {
            System.out.println("Bomberos disponibles para atender emergencias.");
        } else {
            System.out.println("Bomberos no disponibles en este momento.");
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
