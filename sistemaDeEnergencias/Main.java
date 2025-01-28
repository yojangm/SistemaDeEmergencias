import java.util.ArrayList;
import java.util.List;

import model.Emergencia;
import model.Strategy.PriorizacionContext;
import model.Strategy.PriorizacionPorgravedadStrategy;
import utils.NivelGravedad;
import utils.TipoEmergencia;

public class Main {
 
    public static void main(String[] args) {
        
        // Crear una lista de emergencias
        List<Emergencia> emergencias = new ArrayList<>();
        emergencias.add(new Emergencia(TipoEmergencia.ACCIDENTEVEHICULAR, "Direccion 1","Telefono 1", "Fecha 1", NivelGravedad.BAJO));
        emergencias.add(new Emergencia(TipoEmergencia.ROBO, "Direccion 2","Telefono 2", "Fecha 2", NivelGravedad.MEDIO));
        emergencias.add(new Emergencia(TipoEmergencia.INCENDIO, "Direccion 3", "Telefono 3", "Fecha 3", NivelGravedad.ALTO));

        // Crear un contexto de priorización
        PriorizacionContext context = new PriorizacionContext(new PriorizacionPorgravedadStrategy());

        // Priorizar las emergencias
        context.priorizarEmergencias(emergencias);
        
    }
}
