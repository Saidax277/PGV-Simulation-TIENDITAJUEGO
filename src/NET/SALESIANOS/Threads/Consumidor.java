package NET.SALESIANOS.Threads;

import NET.SALESIANOS.Model.Game;
import NET.SALESIANOS.Model.Videojuego;

public class Consumidor extends Thread {
    private final Game tienda;
    private final String nombre;
    private final int cantidad;

    public Consumidor(Game tienda, String nombre, int cantidad) {
        this.tienda = tienda;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= cantidad; i++) {
                Videojuego juego = tienda.recoger(nombre);
                Thread.sleep((int)(Math.random() * 1500));
                System.out.println(nombre + " ha jugado " + juego);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}