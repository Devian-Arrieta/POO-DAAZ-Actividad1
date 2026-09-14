package Parte_L.Ejercicio69;

public class ContextoAcademico {

    public String nombre, carrera, universidad, sede, asignaturaFavorita;

    public void cambiarAsignaturaFavorita(String nuevaAsignatura) {
        this.asignaturaFavorita = nuevaAsignatura;
        System.out.println("Asignatura favorita actualizada a: " + nuevaAsignatura);
    }

    public void mostrarInfo() {
        System.out.println(
            "MOSTRAR INFORMACIÓN \n"+
            "Estudiante: " + nombre +"\n"+
            "Carrera: " + carrera +"\n"+
            "Universidad: " + universidad + " sede "+ sede +"\n"+
            "Asignatura Favorita: " + asignaturaFavorita +"\n"
        );
    }
}


class Main {
    public static void main(String[] args) {

        ContextoAcademico est1 = new ContextoAcademico();
        est1.nombre = "Devian Arrieta";
        est1.carrera = "Ingeniería de Software";
        est1.universidad = "Universidad de Cartagena";
        est1.sede = "Campus Piedra Bolivar";
        est1.asignaturaFavorita = "POO";

        ContextoAcademico est2 = new ContextoAcademico();
        est2.nombre = "Ana Martínez";
        est2.carrera = "Ingeniería Industrial";
        est2.universidad = "Universidad Nacional";
        est2.sede = "Sede Bogotá";
        est2.asignaturaFavorita = "Optimización";

        ContextoAcademico est3 = new ContextoAcademico();
        est3.nombre = "Luis Hernández";
        est3.carrera = "Medicina";
        est3.universidad = "Universidad de Antioquia";
        est3.sede = "Sede Robledo";
        est3.asignaturaFavorita = "Anatomía";

        ContextoAcademico est4 = new ContextoAcademico();
        est4.nombre = "Laura Torres";
        est4.carrera = "Derecho";
        est4.universidad = "Universidad del Norte";
        est4.sede = "Sede Barranquilla";
        est4.asignaturaFavorita = "Derecho Penal";

        ContextoAcademico est5 = new ContextoAcademico();
        est5.nombre = "Mateo Ramírez";
        est5.carrera = "Arquitectura";
        est5.universidad = "Universidad Javeriana";
        est5.sede = "Sede Central";
        est5.asignaturaFavorita = "Diseño Urbano";

        est2.cambiarAsignaturaFavorita("Electiva 1");

        System.out.print("ESTUDIANTE 1: ");
        est1.mostrarInfo();

        System.out.print("ESTUDIANTE 2: ");
        est2.mostrarInfo();

        System.out.print("ESTUDIANTE 3: ");
        est3.mostrarInfo();

        System.out.print("ESTUDIANTE 4: ");
        est4.mostrarInfo();

        System.out.print("ESTUDIANTE 5: ");
        est5.mostrarInfo();
    }
}