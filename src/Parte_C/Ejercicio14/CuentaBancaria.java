package Parte_C.Ejercicio14;

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

    public void retirar(double valor){

        if(valor > saldo){
            System.out.println("El valor a retirar es mayor al saldo de la cuenta");
        }
        else{
            saldo -= valor;
            System.out.println("Saldo retirado correctamente");
        }
    }
}

class Main{
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numero = "1234-5678-9100";
        cuenta1.titular = "Devian Arrieta";
        cuenta1.saldo = 50000;

        cuenta1.mostrarCuenta();

        cuenta1.retirar(20000);
        System.out.print("CUENTA DESPUÉS DE RETIRO: ");
        cuenta1.mostrarCuenta();
    }
}