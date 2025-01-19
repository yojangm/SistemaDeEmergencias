package model;


import utils.NivelGravedad;

public class Emergencia {
   public  String tipoEmergencia;
   private String direccion;
   public  String telefono;
   public  String fecha;
   private NivelGravedad nivelGravedad;
   
   // metodo constructor
   public Emergencia(String tipoEmergencia, String direccion, String telefono, String fecha, NivelGravedad nivelGravedad) {
      this.tipoEmergencia = tipoEmergencia;
      this.direccion = direccion;
      this.telefono = telefono;
      this.fecha = fecha;
      this.nivelGravedad = nivelGravedad;
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

    public NivelGravedad getNivelGravedad() {
        return nivelGravedad;
    }

    public void setNivelGravedad(NivelGravedad nivelGravedad) {
        this.nivelGravedad = nivelGravedad;
    }

    public void mostrarInformacionEmergencia() {
        System.out.println("Tipo de emergencia: " + tipoEmergencia);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Fecha: " + fecha);
        System.out.println("Gravedad: " + nivelGravedad);
    }

   
}
