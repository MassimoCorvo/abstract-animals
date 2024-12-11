public class Main {
    public static void main(String[] args) throws Exception {

        // Esercizio 1
        Animale cane = new Cane("Bob", 5);
        System.out.println(cane.nome);
        cane.verso();
        cane.mangia();
        cane.dormi();

        Cane nina = new Cane("Nina", 1);
        System.out.println(nina.nome);
        nina.verso();
        nina.mangia();
        nina.dormi();

        // Esercizio 2
        Aquila olimpia = new Aquila("Olimpia", 12);
        System.out.println(olimpia.nome);
        olimpia.verso();
        olimpia.mangia();
        olimpia.dormi();
        olimpia.vola();

        Delfino ecco = new Delfino("Ecco", 20);
        System.out.println(ecco.nome);
        ecco.verso();
        ecco.mangia();
        ecco.dormi();
        ecco.nuota();

        Volatile volatile1 = new Aquila("Prova", 1);
        volatile1.vola();

        MetodiEsercizio2.faiVolare(volatile1);
        MetodiEsercizio2.faiVolare(olimpia);
        MetodiEsercizio2.faiNuotare(ecco);

        //Alternativa
        System.out.println("Alternativa");
        faiVolare(volatile1);
        faiVolare(olimpia);
        faiNuotare(ecco);

    }

    //Alternativa
    static void faiVolare(Volatile animale) {
        animale.vola();
    }

    static void faiNuotare(Nuotatore animale) {
        animale.nuota();
    }
}
