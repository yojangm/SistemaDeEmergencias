package model;
public class Emergencia {
   public  String tipoEmergencia;
   private String direccion;
   public  String telefono;
   public  String fecha;
   public  String gravedad;
   
   // metodo constructor
   public Emergencia(String tipoEmergencia, String direccion, String telefono, String fecha, String gravidad) {
      this.tipoEmergencia = tipoEmergencia;
      this.direccion = direccion;
      this.telefono = telefono;
      this.fecha = fecha;
      this.gravedad = gravidad;
   }

   
   // metodos accesores

    public String getTipoEmergencia() {
        return tipoEmergencia;
    }

    public void setTipoEmergencia(String tipoEmergencia) {
        this.tipoEmergencia = tipoEmergencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGravidad() {
        return gravedad;
    }

    public void setGravidad(String gravedad) {
        this.gravedad = gravedad;
    }

    public void mostrarInformacionEmergencia() {
        System.out.println("Tipo de emergencia: " + tipoEmergencia);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Fecha: " + fecha);
        System.out.println("Gravedad: " + gravedad);
    }

   
}
