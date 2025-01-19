package model.services;
import model.Emergencia;

public interface Responder {
   void atenderEmergencia(Emergencia emergencia);
   void evaluarEstado(Emergencia emergencia);
}
