package ejemplo;

public abstract class Personaje {

    String nombre;
    String descripcion;
    long tamano;
    int poder;
    int vida;

    public Personaje() {}

    public void moverse() {}

    public void mostrarVida() {
        System.out.println("La vida es " + vida);
    }

    public void mostrarPoder() {
        System.out.println("El poder es " + poder);
    }
}





