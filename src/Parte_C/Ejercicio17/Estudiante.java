package Parte_C.Ejercicio17;

public class Estudiante {

    String nombre, codigo, semestre;

    public void mostrarInfo(){
        System.out.println(
            "INFORMACIÓN DEL ESTUDIANTE \n" +
            "Nombre: "+ nombre +"\n"+
            "Código: "+ codigo +"\n"+
            "Semestre: "+ semestre +"\n"
        );
    }

    public void cambiarSemestre(String nuevoSemestre){
        semestre = nuevoSemestre;
    }
}

class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();

        estudiante.nombre = "Devian Arrieta";
        estudiante.codigo = "7502610036";
        estudiante.semestre = "2 semestre";

        estudiante.mostrarInfo();

        estudiante.cambiarSemestre("3 semestre");
        System.out.print("NUEVO SEMESTRE CAMBIADO: ");
        estudiante.mostrarInfo();
    }
}
