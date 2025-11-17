import NET.SALESIANOS.Threads.Consumidor;
import NET.SALESIANOS.Threads.Productor;
import NET.SALESIANOS.Model.Game;

//Muy importante leer las anotaciones en portugués.

public class App {
    public static void main(String[] args) {
        Game tienda = new Game(5); // Esta será la capacidad máxima mismamente

        // Productores (compañías de jogos)
        Productor nintendo = new Productor(tienda, "Nintendo", 10);
        Productor capcom = new Productor(tienda, "Capcom", 10);

        // Consumidores (clientes que juegan a nostros jogos)
        Consumidor primillo = new Consumidor(tienda, "Er primillo shico", 5);
        Consumidor cascadas = new Consumidor(tienda, "Cascadas du traseiro 69", 10);
        Consumidor doramion = new Consumidor(tienda, "Doramion", 5);

        // Lanzar hilos
        nintendo.start();
        capcom.start();
        primillo.start();
        cascadas.start();
        doramion.start();
    }
}