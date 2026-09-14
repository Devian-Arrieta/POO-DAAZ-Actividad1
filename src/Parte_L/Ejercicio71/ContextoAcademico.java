package Parte_L.Ejercicio71;

public class ContextoAcademico {

    public String nombre, carrera, universidad, sede, asignaturaFavorita;

    public ContextoAcademico(String nombre, String carrera, String universidad, String sede, String asignaturaFavorita) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.universidad = universidad;
        this.sede = sede;
        this.asignaturaFavorita = asignaturaFavorita;
    }

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

        ContextoAcademico est1 = new ContextoAcademico("Devian Arrieta", "Ingeniería de Software", "Universidad de Cartagena", "Campus Piedra Bolivar", "POO");
        ContextoAcademico est2 = new ContextoAcademico("Ana Martínez", "Ingeniería Industrial", "Universidad Nacional", "Sede Bogotá", "Optimización");
        ContextoAcademico est3 = new ContextoAcademico("Luis Hernández", "Medicina", "Universidad de Antioquia", "Sede Robledo", "Anatomía");
        ContextoAcademico est4 = new ContextoAcademico("Laura Torres", "Derecho", "Universidad del Norte", "Sede Barranquilla", "Derecho Penal");
        ContextoAcademico est5 = new ContextoAcademico("Mateo Ramírez", "Arquitectura", "Universidad Javeriana", "Sede Central", "Diseño Urbano");

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