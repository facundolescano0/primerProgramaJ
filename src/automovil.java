public class Automovil extends Vehiculo{

    private boolean estaPintado;
    public automovil(){
        super();
        estaPintado = false;
        this.ruedas=4;
    }
    public void pintar(){
        this.estaPintada = true;
    }
}
