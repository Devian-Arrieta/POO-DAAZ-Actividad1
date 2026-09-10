package Parte_C.Ejercicio13;

public class CuentaBancaria {

    String numero, titular;
    double saldo;

    public void mostrarCuenta(){
        System.out.println(
            "INFORMACIÓN DE LA CUENTA BANCARIA \n" +
            "Número de Cuenta: "+ numero +"\n"+
            "titular: "+ titular +"\n"+
            "Saldo: "+ saldo +"\n"
        );
    }

    public void consignar(double valor){
        saldo += valor;
    }
}

class Main{
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = "1234-5678-9100";
        cuenta1.titular = "Devian Arrieta";
        cuenta1.saldo = 999999;

        cuenta1.mostrarCuenta();

        cuenta1.consignar(1);
        System.out.print("CUENTA CONSIGNADA: ");
        cuenta1.mostrarCuenta();
    }
}