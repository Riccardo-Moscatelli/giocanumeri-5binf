//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GiocaNumeri {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("INIZIA IL GIOCO");

        Giocatore g1 = new Giocatore("Franco");
        g1.start();
        System.out.println("INIZIA IL GIOCO");
        Giocatore g2 = new Giocatore("Gino");
        g2.start();

        try {
            g1.join();

        } catch (InterruptedException e) {
            System.out.println("errore");
        }
        try {
            g2.join();

        } catch (InterruptedException e) {
            System.out.println("errore");
        }
        System.out.println("FINE GIOCO");
    }
}