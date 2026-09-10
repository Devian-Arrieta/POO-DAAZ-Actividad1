package Parte_B.Ejercicio10;

public class CuentaBancaria {

    String numero, titular;
    double saldo;

    public void mostrarCuenta(){
        System.out.println(
            "INFORMACIÓN DE LA CUENTA BANCARIA \n \n" +
            "Número de Cuenta: "+ numero +"\n"+
            "titular: "+ titular +"\n"+
            "Saldo: "+ saldo +"\n"
        );
    }
}

class Main{
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = "1234-5678-9100";
        cuenta1.titular = "Devian Arrieta";
        cuenta1.saldo = 99999999;

        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.numero = "1098-7654-3210";
        cuenta2.titular = "Pepito Perez";
        cuenta2.saldo = 50000;

        System.out.print("CUENTA 1: ");
        cuenta1.mostrarCuenta();

        System.out.print("CUENTA 2: ");
        cuenta2.mostrarCuenta();
    }
}