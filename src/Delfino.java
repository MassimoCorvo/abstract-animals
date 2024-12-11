public class Delfino extends Animale implements Nuotatore{
    public Delfino(String nome, int eta){
        this.nome=nome;
        this.eta=eta;
    }

    @Override
    public void verso() {
        System.out.println("Fischio");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio acciughe...");
    }

    public void nuota(){
        System.out.println("Sto nuotando!!!");
    }
    
}
