package Parte_B.Ejercicio6;

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

class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.nombre = "Devian Arrieta";
        estudiante.codigo = "7502610036";
        estudiante.semestre = "2 semestre";

        estudiante.mostrarInfo();
    }
}
