package NET.SALESIANOS.Model;

public class Videojuego {
    private final int id;
    private final String nombre;
    private final String compania;

    public Videojuego(int id, String nombre, String compania) {
        this.id = id;
        this.nombre = nombre;
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Juego generico super guay del paraguay " + id + " " + nombre + " (compañía: " + compania + ")";
    }
}