public class Cane extends Animale{
    public Cane(String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public void verso() {
        System.out.println("Abbaio");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio croccantini...");
    }

}
