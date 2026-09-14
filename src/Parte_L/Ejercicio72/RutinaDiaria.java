package Parte_L.Ejercicio72;

public class RutinaDiaria {

    public String nombre, actividadActual, generoDeMusicaFavorito;

    public RutinaDiaria(){
        // constructor vacio
    }

    public void mostrarInfo() {
        System.out.println(
            "INFORMACIÓN \n"+
            "Persona: " + nombre + "\n"+
            "Actividad actual: " + actividadActual + "\n"+
            "Género de musica favorito: " + generoDeMusicaFavorito +"\n"
        );
    }

    public void escucharMusica(String cancion) {
        this.actividadActual = "Escuchando música";
        System.out.println(nombre + " está escuchando la canción '" + cancion + "' (" + generoDeMusicaFavorito + ").");
    }
}


class Main2 {
    public static void main(String[] args) {

        RutinaDiaria persona1 = new RutinaDiaria();
        persona1.nombre = "Camilo";
        persona1.actividadActual = "Estudiando";
        persona1.generoDeMusicaFavorito = "Rock";

        RutinaDiaria persona2 = new RutinaDiaria();
        persona2.nombre = "Yuniliexys";
        persona2.actividadActual = "Cocinando";
        persona2.generoDeMusicaFavorito = "Pop";

        RutinaDiaria persona3 = new RutinaDiaria();
        persona3.nombre = "yonaikerson";
        persona3.actividadActual = "Haciendo ejercicio";
        persona3.generoDeMusicaFavorito = "Salsa";

        RutinaDiaria persona4 = new RutinaDiaria();
        persona4.nombre = "Efrofriendlys";
        persona4.actividadActual = "Descansando";
        persona4.generoDeMusicaFavorito = "Jazz";

        RutinaDiaria persona5 = new RutinaDiaria();
        persona5.nombre = "Daniel";
        persona5.actividadActual = "Trabajando";
        persona5.generoDeMusicaFavorito = "Reggaeton";

        System.out.print("Persona 1: ");
        persona1.escucharMusica("Bohemian Rhapsody");

        System.out.print("Persona 2: ");
        persona2.escucharMusica("As It Was");

        System.out.print("Persona 3: ");
        persona3.escucharMusica("Cali Pachanguero");

        System.out.print("Persona 4: ");
        persona4.escucharMusica("Fly Me to the Moon");

        System.out.print("Persona 5: ");
        persona5.escucharMusica("Tití Me Preguntó");

        System.out.println("-----------------------------------");

        System.out.print("Persona 1: ");
        persona1.mostrarInfo();

        System.out.print("Persona 2: ");
        persona2.mostrarInfo();

        System.out.print("Persona 3: ");
        persona3.mostrarInfo();

        System.out.print("Persona 4: ");
        persona4.mostrarInfo();

        System.out.print("Persona 5: ");
        persona5.mostrarInfo();
    }
}