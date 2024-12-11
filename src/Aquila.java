public class Aquila extends Animale implements Volatile{
    public Aquila(String nome, int eta){
        this.nome=nome;
        this.eta=eta;
    }

    @Override
    public void verso() {
        System.out.println("Strido");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio conigli...");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }

    
}
