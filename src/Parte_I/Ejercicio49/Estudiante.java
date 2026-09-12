package Parte_I.Ejercicio49;

/*
EJEMPLO DE ACCESO A ATRIBUTOS DE OTRO OBJETO SIN REFERENCIA (INVÁLIDO)

public class Estudiante {
    String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void saludarCompanero() {

        // Aquí hay un error porque se intenta acceder a otroEstudiante.nombre,
        // pero otroEstudiante no existe en el alcance de este metodo ni fue pasado como parámetro

        System.out.println("Hola " + otroEstudiante.nombre + ", mi nombre es " + this.nombre);
    }
}
*/

// EJEMPLO VÁLIDO CORREGIDO

public class Estudiante {

    String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    // Se recibe la referencia del otro objeto como parámetro en el metodo
    public void saludarCompanero(Estudiante otroEstudiante) {
        System.out.println("Hola " + otroEstudiante.nombre + ", mi nombre es " + this.nombre + ".");
    }
}

class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Devian");
        Estudiante estudiante2 = new Estudiante("Roberto");

        // Se pasa la variable de referencia estudiante2 como argumento al metodo de estudiante
        estudiante1.saludarCompanero(estudiante2);
    }
}