import NET.SALESIANOS.Threads.Consumidor;
import NET.SALESIANOS.Threads.Productor;
import NET.SALESIANOS.Model.Game;

public class App {
    public static void main(String[] args) {
        Game tienda = new Game(5);

        Productor productor = new Productor(tienda, "Nintendo", 5);
        Consumidor consumidor = new Consumidor(tienda, "Mylo J", 5);

        // Establecer prioridades
        productor.setPriority(Thread.MAX_PRIORITY);   // Productor con prioridad alta
        consumidor.setPriority(Thread.MIN_PRIORITY);  // Consumidor con prioridad baja

        productor.start();
        consumidor.start();
    }
}