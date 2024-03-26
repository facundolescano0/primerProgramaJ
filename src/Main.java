import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllI
public class Main {
    public static void avanzarAutomovil(Vehiculo miVehiculo){
        miVehiculo.setearRuedas(4);
        miVehiculo.avanzar();
        System.out.println(miVehiculo.posicionActual());
    }

    public static void pintar(List<Pintable> pintables){
        for(int i=0 ; i<pintables.size();i++){
            Pintable pintable = pintables.get(i);
            pintable.pintar();
            pintables.get(i).pintar();
        }
    }

    public static void main(String[] args) {
        Automovil miAuto = new Automovil();
        avanzarAutomovil(miAuto);
        List<Pintable> vehiculos = new ArrayList<Pintable>();
        vehiculos.add(miAuto);
        pintar(vehiculos);
    }
}
