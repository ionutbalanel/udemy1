public class P025Om {
    String nume;
    int varsta;
    double greutate;
    double inaltime;

    public void saluta() {
        System.out.println(nume + " te saluta");
    }

    public void afiseazaDetalii() {
        System.out.printf("Salut, ma numesc %s, am %d ani, inaltimea de %.2f m si greutatea de %.2f kg\n", nume, varsta, inaltime, greutate);
    }

    public void mananca(){
        greutate++;
    }
}
