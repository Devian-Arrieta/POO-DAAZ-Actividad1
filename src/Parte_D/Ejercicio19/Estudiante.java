package Parte_D.Ejercicio19;

/*
* Estudiante es una CLASE porque esta actua como la plantilla o el molde vacio,
* esta clase define ya los atributos nombre, codigo y semestre y además el comportamiento
* que tendrá, porque por sí sola, la clase no representa a ningún alumno, solo los
* atributos hasta que le ingresemos la información
*/

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

        /*
        Esto es un OBJETO o instancia porque es la entidad real
        creada a partir del molde Estudiante usando la palabra 'new', esta ya
        representa a un estudiante específico en el sistema con sus propios valores
        */
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
