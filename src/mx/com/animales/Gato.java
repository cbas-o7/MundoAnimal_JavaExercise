package mx.com.animales;

public class Gato extends Animal{
    public Gato (String nombre, int edad) {
        super(nombre,edad);
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }

    @Override
    public String moverse() {
        return  "Camina";
    }
}
