import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void avanzarAutomovil(Vehiculo miVehiculo){
        miAuto.setearRuedas(4);
        miAuto.avanzar();
        System.out.println(miAuto.posicionActual());
    }

    public static void pintar(list<Pintable> pintables){
        for(int i=0 ; i<pintables.size();i++){
            Pintable pintable = pintables.get(i);
            pintable.pintar();
            pintables.get(i).pintar();
        }
    }

    public static void main(String[] args) {
        Automovil miAuto = new Automovil();
        avanzarAutomovil(miAuto);
        list<pintable> vehiculos = new ArrayList<>();
        vehiculos.add(miAuto);
        pintar(vehiculos);
    }
}
