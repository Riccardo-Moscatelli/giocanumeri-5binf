import java.util.Scanner;

public class Giocatore extends Thread{
    private String nome;
    private int punteggio;
    GestoreGioco gg;

    public Giocatore(String nome){
        this.nome = nome;
        this.punteggio = 0;
    }

    public Giocatore(String nome, GestoreGioco gg){
        this.nome = nome;
        this.punteggio = 0;
        this.gg = gg;
    }

    public void comunica(){System.out.println(" Giocatore " + nome);}
    public int getPunteggio() { return punteggio; }
    public String getNome() { return nome; }
    private void gioca() {
        System.out.println(" Sono il giocatore " + nome + "Inserisci un numero ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println(" Scelto il numero " + num);
        gg.verifica(num);
    }

    @Override
    public void run(){
        //
        super.run();
        //Il giocatore si presenta
        comunica();

        //
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        gioca();
    }
}