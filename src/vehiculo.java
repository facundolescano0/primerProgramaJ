public abstract class Vehiculo implements Pintable {
    protected int ruedas;
    protected int posicion;


    public Vehiculo() {
        this.posicion = 0;
    }

    public avanzar() {
        this.posicion += this.ruedas;
    }

    public int posicionActual() {
        return this.posicion;
    }

    public abstract void pintar(){

    }

    public setearRuedas(int cantidadDeRuedas) {
        this.ruedas = cantidadDeRuedas;
        this.posicion = 0;
    }

}