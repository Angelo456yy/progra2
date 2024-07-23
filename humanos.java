package ejemplo;

public class Humano extends Personaje implements Heroe {
    
    @Override
    public void moverse() {}

    @Override
    public void mostrarVida() {
        return 0;
    }

    @Override
    public void mostrarPoder() {}

    @Override
    public void atacar() {}

    @Override
    public void defender() {}

    @Override
    public void recibirAtaque() {}
}
