package Parte_I.Ejercicio45;

/*
EJEMPLO DE METODO POR FUERA DE LA CLASE (INVALIDO)

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}

// metodo invalido porque se encuentra fuera de la clase
public void mostrarInfo() {
    System.out.println(
        "Nombre: " + nombre +"\n"+
        "Edad: " + edad);
}
*/


// EJEMPLO VALIDO CORREGIDO

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodo valido porque se encuentra dentro de la clase
    public void mostrarInfo() {
        System.out.println(
            "Nombre: " + nombre +"\n"+
            "Edad: " + edad);
    }
}

class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Margarita Robledo", 30);

        persona1.mostrarInfo();
    }
}