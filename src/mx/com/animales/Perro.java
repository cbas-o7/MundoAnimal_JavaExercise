package mx.com.animales;

public class Perro extends Animal {

    public Perro (String nombre, int edad) {
        super(nombre,edad);
    }

    @Override
    public String hacerSonido() {
        return "Guau";
    }

    @Override
    public String moverse() {
        return "Corre";
    }
}
