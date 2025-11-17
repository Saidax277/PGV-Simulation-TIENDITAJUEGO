package NET.SALESIANOS.Model;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private final Queue<Videojuego> stock = new LinkedList<>();
    private final int capacidad;

    public Game(int capacidad) {
        this.capacidad = capacidad;
    }

    public synchronized void guardar(Videojuego juego) throws InterruptedException {
        while (stock.size() == capacidad) {
            wait();
        }
        stock.add(juego);
        System.out.println("Se guardo el: " + juego + "... Juegazo");
        notifyAll();
    }

    public synchronized Videojuego recoger(String cliente) throws InterruptedException {
        while (stock.isEmpty()) {
            wait();
        }
        Videojuego juego = stock.poll();
        System.out.println(cliente + " ha comprado: " + juego + "... Yo también lo quería probar...");
        notifyAll();
        return juego;
    }
}
