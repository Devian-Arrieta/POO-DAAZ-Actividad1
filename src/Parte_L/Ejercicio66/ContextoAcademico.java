package Parte_L.Ejercicio66;

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
            "Asignatura Favorita: " + asignaturaFavorita
        );
    }
}
