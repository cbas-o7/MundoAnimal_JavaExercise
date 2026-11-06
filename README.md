# Ejercicio de POO: Herencia, Polimorfismo e Interfaces en Java

Proyecto práctico orientado a objetos en Java que modela una jerarquía de animales aplicando encapsulamiento, clases abstractas, herencia, interfaces y polimorfismo dinámico.

---

## Estructura del Proyecto

```text
src/
└── mx/
    └── com/
        └── animales/
            ├── Movible.java        # Interfaz que define el comportamiento de movimiento
            ├── Animal.java         # Clase abstracta base
            ├── Vaca.java           # Subclase concreta
            ├── Perro.java          # Subclase concreta
            ├── Gato.java           # Subclase concreta
            └── Main.java           # Clase ejecutable principal

🛠️ Descripción de Componentes
Movible: Interfaz con el método moverse().

Animal: Clase abstracta base con atributos nombre y edad, el método concreto mostrarInformacion() y los métodos abstractos hacerSonido() y moverse().

Vaca / Perro / Gato: Clases derivadas que sobrescriben @Override los métodos para definir su comportamiento específico.

Main: Instancia los objetos, los almacena en una lista polimórfica e imprime los resultados sin usar estructuras condicionales if/else.

🚀 Instrucciones de Ejecución
Abrir una terminal en la carpeta raíz src/.

Compilar los archivos fuente:

Bash
javac mx/com/animales/*.java
Ejecutar la clase principal:

Bash
java mx.com.animales.Main
💻 Ejemplo de Salida
Plaintext
Nombre: Manuel - Edad: 12 | Muuu | Camina 
Nombre: Andy - Edad: 2 | Guau guau | Corre en cuatro patas 
Nombre: Jorge - Edad: 6 | Miau | Salta ágilmente

📝 Preguntas de Reflexión y Comprobación

1. ¿Puedes crear un objeto directamente de Animal? ¿Por qué?
-No, porque Animal es una clase abstracta (abstract). Las clases abstractas sirven como plantillas base y Java prohíbe instanciarlas directamente con el operador new.   

2. ¿Qué propiedades se comparten y qué comportamiento cambia?
-Propiedades compartidas: Los atributos nombre y edad, y la implementación del método mostrarInformacion().   
-Comportamiento que cambia: Los métodos hacerSonido() y moverse(), ya que cada subclase define su propia lógica.   

3. ¿Cuál es la diferencia entre extends e implements?
-extends: Se usa para la herencia de clases (solo se permite heredar de una clase base directa en Java). Comparte atributos, estado y métodos.   
-implements: Se usa para implementar una o más interfaces, obligando a la clase a cumplir con el contrato de los métodos abstractos.   

4. ¿Por qué no es necesario usar if/else para emitir el sonido de cada animal?
-Por el polimorfismo dinámico. Al recorrer la colección de tipo Animal, la Máquina Virtual de Java resuelve en tiempo de ejecución a qué clase pertenece cada objeto concreto y ejecuta el método hacerSonido() correspondiente de forma automática.   

5. ¿Qué ventaja ofrece el uso de la interfaz Movible en el diseño?
-Permite desacoplar el comportamiento de movimiento de la jerarquía de Animal. Esto facilita que otras clases no relacionadas (como un vehículo o una máquina) puedan implementar Movible sin tener que ser un animal.   

```