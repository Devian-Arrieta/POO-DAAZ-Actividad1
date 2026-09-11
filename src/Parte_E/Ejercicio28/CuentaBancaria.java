package Parte_E.Ejercicio28;

public class CuentaBancaria {

    public String numero, titular;
    public double saldoInicial;

    public CuentaBancaria(String numero, String titular, double saldoInicial){
        this.numero = numero;
        this.titular = titular;
        this.saldoInicial = saldoInicial;
    }
}

class Main{
    public static void main(String[] args){

        CuentaBancaria cuenta1 = new CuentaBancaria("0123-4567-8910", "Devian Arrieta", 99000);

        CuentaBancaria cuenta2 = new CuentaBancaria("1098-7654-3210", "Pepito Perez", 0);

        CuentaBancaria cuenta3 = new CuentaBancaria("1111-2222-3333", "Ana Buelvas", 10000);
    }
}