public class GameManager {
    private int numVincente;

    public GameManager(int numVincente){
        this.numVIncente = numVincente;
    }


    public void verfifica (int num ){
        if(int num == numVincente)
            System.out.println("hai vinto:" + Giocatore.nome);

    }
}
