import java.util.Random;

public class GiocaNumeri {
    public static void main(String[] args) {
        Random rn = new Random();
        int num = rn.nextInt(11);
        System.out.print(num);
        System.out.println("inizio gioco");

        GestoreGioco gg = new GestoreGioco(num);
        Giocatore g1 = new Giocatore("Francesco", gg);
        Giocatore g2 = new Giocatore("Pietro", gg);
        g1.start();
        g2.start();
        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.out.println("errore nell interruzione del thread");
        }

        System.out.println("fine gioco");
    }
}