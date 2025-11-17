import NET.SALESIANOS.Threads.Consumidor;
import NET.SALESIANOS.Threads.Productor;
import NET.SALESIANOS.Model.Game;

public class App {
    public static void main(String[] args) {
        Game tienda = new Game(5);

        Productor productor = new Productor(tienda, "Nintendo", 5);
        Consumidor consumidor = new Consumidor(tienda, "Mario", 5);

        productor.start();
        consumidor.start();
    }
}