package NET.SALESIANOS.Threads;

import NET.SALESIANOS.Model.Game;
import NET.SALESIANOS.Model.Videojuego;

public class Productor extends Thread {
    private final Game tienda;
    private final String compania;
    private final int cantidad;
    private final String[] tiposDeJuegos = {
        "RPG", "Shooter", "Plataformas", "Puzzle", "Aventura",
        "Deportes", "Carreras", "Estrategia", "Simulación", "Lucha"
    };

    public Productor(Game tienda, String compania, int cantidad) {
        this.tienda = tienda;
        this.compania = compania;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= cantidad; i++) {
                // Espera aleatoriamente
                Thread.sleep((int)(Math.random() * 1000));

                // Crear el modofocking producto producto con tipo aleatorio
                String tipo = tiposDeJuegos[(int)(Math.random() * tiposDeJuegos.length)];
                Videojuego juego = new Videojuego(i, tipo, compania);

                // Lo guarda en la modofocking tienda
                tienda.guardar(juego);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}