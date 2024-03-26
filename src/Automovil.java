public class Automovil extends Vehiculo{

    private boolean estaPintado;
    public Automovil(){
        super();
        estaPintado = false;
        this.ruedas=4;
    }

    public void pintar(){
        this.estaPintado = true;
    }
}

