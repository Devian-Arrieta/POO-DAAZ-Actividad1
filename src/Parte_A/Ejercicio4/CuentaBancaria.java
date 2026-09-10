package Parte_A.Ejercicio4;

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
