public class Passerotto extends Animale implements Volatile{
    public Passerotto(String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public void verso() {
       System.out.println("Cinguetto");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio semi...");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }


}
