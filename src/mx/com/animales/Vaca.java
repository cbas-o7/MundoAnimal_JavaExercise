package mx.com.animales;

public class Vaca extends Animal{

    public Vaca (String nombre, int edad) {
        super(nombre,edad);
    }

    @Override
    public String hacerSonido() {
        return "Muuu";
    }

    @Override
    public String moverse() {
        return "Camina";
    }
}
