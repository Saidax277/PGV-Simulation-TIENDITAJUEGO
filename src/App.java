import NET.SALESIANOS.Threads.Consumidor;
import NET.SALESIANOS.Threads.Productor;
import NET.SALESIANOS.Model.Game;

public class App {
    public static void main(String[] args) {
        Game tienda = new Game(5);

        Productor productor = new Productor(tienda, "Nintendo", 5, 1000);
        Consumidor consumidor = new Consumidor(tienda, "Trancas", 5, 1500);

        productor.setPriority(Thread.MAX_PRIORITY);
        consumidor.setPriority(Thread.MIN_PRIORITY);

        productor.start();
        consumidor.start();
    }
}