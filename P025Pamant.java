import java.util.ArrayList;

public class P025Pamant {
    public static void main(String[] args) {
        P025Om persoana1 = new P025Om();

        persoana1.nume="Ion";
        persoana1.varsta=36;
        persoana1.greutate=58;
        persoana1.inaltime=1.65;

        persoana1.saluta();
        persoana1.afiseazaDetalii();
        persoana1.mananca();
        persoana1.afiseazaDetalii();

        P025Om persoana2 = new P025Om();

        persoana2.nume="Ana";
        persoana2.varsta=22;
        persoana2.greutate=55.5;
        persoana2.inaltime=1.55;

        P025Om persoana3 = new P025Om();

        persoana3.nume="Gabi";
        persoana3.varsta=20;
        persoana3.greutate=75.5;
        persoana3.inaltime=1.75;

        ArrayList<P025Om> persoane = new ArrayList<>();
        persoane.add(persoana1);
        persoane.add(persoana2);
        persoane.add(persoana3);

        System.out.println();
        System.out.println();
        System.out.println();

        for (P025Om persoana : persoane) {
            persoana.afiseazaDetalii();
        }
    }
}
