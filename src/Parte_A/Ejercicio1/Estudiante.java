package Parte_A.Ejercicio1;

public class Estudiante {

    String nombre, codigo, semestre;

    public void mostrarInfo(){
        System.out.println(
                "INFORMACIÓN DEL ESTUDIANTE \n \n" +
                "Nombre: "+ nombre +"\n"+
                "Código: "+ codigo +"\n"+
                "Semestre: "+ semestre +"\n"
        );
    }
}
