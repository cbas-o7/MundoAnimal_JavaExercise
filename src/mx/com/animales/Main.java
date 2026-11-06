import mx.com.animales.Animal;
import mx.com.animales.Gato;
import mx.com.animales.Vaca;
import mx.com.animales.Perro;

void main(String[] args) {
    //Animal animales [] = new Animal[3];
    ArrayList<Animal> animales = new ArrayList<>();

    Vaca vaca1 = new Vaca("Manuel",12);
    Perro perro1 = new Perro("Andy",2);
    Gato gato1 = new Gato("Jorge",6);
    animales.add(vaca1);
    animales.add(perro1);
    animales.add(gato1);

    for (Animal a : animales) {
        System.out.printf("%s | %s | %s \n", a.mostrarInformacion(), a.hacerSonido(), a.moverse());
    }
}