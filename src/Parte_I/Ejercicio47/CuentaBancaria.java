package Parte_I.Ejercicio47;

/*
EJEMPLO DE USO DE UN OBJETO SIN HABERLO CREADO / INSTANCIADO (INVÁLIDO)

public class CuentaBancaria {
    String titular;
    double saldo;

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN DE LA CUENTA\n" +
            "Titular: " + titular + "\n" +
            "Saldo: $" + saldo
        );
    }
}

class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta; // Se declara la variable de tipo objeto, pero no se usó 'new'

        // al ntentar invocar un metodo sobre una variable sin referencia real va a generar error de compilación
        cuenta.mostrarInfo();
    }
}
*/


// EJEMPLO VÁLIDO CORREGIDO

public class CuentaBancaria {
    String titular;
    double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN DE LA CUENTA\n" +
            "Titular: " + titular + "\n" +
            "Saldo: $" + saldo
        );
    }
}

class Main {
    public static void main(String[] args) {

        // Se usa la palabra reservada 'new' para reservar el espacio en la memoria
        CuentaBancaria cuenta = new CuentaBancaria("Carlos Pérez", 500000.0);

        cuenta.mostrarInfo();
    }
}