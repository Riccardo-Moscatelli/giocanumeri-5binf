import java.util.Scanner;

public class Giocatore extends Thread {
    //attributi
    private final GameManager gm;
    private int punteggio;
    private String nome;

    //metodi
    public Giocatore(String nome, GameManager gestore) {
        this.punteggio = 0;
        this.nome = nome;
    }

    public void comunica() {
        System.out.println("sono il giocatore " + nome + " e ho iniziato il gioco");
        System.out.println(this);
    }
    public void gioca() {
        System.out.println("inseriscu un numero:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("numero scelto da:" + nome);
        gm.verifica(num, this);
    }
        public void run() {
                comunica();
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    System.err.println("errore nella fase di sleeping");
                }


            }
        }
