public class GestoreGioco {
    int numeroVincente;

    public GestoreGioco(int numeroVincente){
        this.numeroVincente = numeroVincente;
    }

    public void verifica(int num){
        System.out.println("Verifica");
        if(num==numeroVincente){
            System.out.println("Hai vinto");
        }else{
            System.out.println("Hai perso");
        }

    }
}