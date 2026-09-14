package Parte_L.Ejercicio67;

public class RutinaDiaria {

    public String nombre, actividadActual, generoDeMusicaFavorito;

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN \n"+
            "Persona: " + nombre + "\n"+
            "Actividad actual: " + actividadActual + "\n"+
            "Género de musica favorito: " + generoDeMusicaFavorito
        );
    }

    public void escucharMusica(String cancion) {
        this.actividadActual = "Escuchando música";
        System.out.println(nombre + " está escuchando la canción '" + cancion + "' (" + generoDeMusicaFavorito + ").");
    }
}