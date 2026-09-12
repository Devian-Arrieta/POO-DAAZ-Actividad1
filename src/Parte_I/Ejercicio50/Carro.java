package Parte_I.Ejercicio50;

/*
EJEMPLO DONDE SE CREA LA CLASE PERO NUNCA SE CONSTRUYE EL OBJETO EN MAIN (INVÁLIDO)

public class Carro {
    public String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("El carro " + marca + " se ha encendido");
    }
}

class Main {
    public static void main(String[] args) {
        // Error porque se intenta invocar un metodo de instancia directamente desde la clase
        // sin haber construido el objeto con 'new'
        Carro.encender();
    }
}
*/

// EJEMPLO VÁLIDO CORREGIDO

public class Carro {

    public String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println(
            "ESTADO DEL VEHÍCULO\n" +
            "El carro " + marca + " se ha encendido correctamente"
        );
    }
}

class Main {
    public static void main(String[] args) {

        // Se construye el objeto en el main con 'new'
        Carro carro = new Carro("Mazda 3");

        // Ahora se invoca el metodo sobre la instancia activa en memoria
        carro.encender();
    }
}