public class P004Exercitii {
    public static void main(String[] args) {
        // 1. Sa se declare o variabila de tip char cu valoarea * (steluta).
        char semnul = '*';
        // 2. Sa se declare o variabila de tip ...?.. cu valoarea 3.14
        double numarulMeuDouble = 3.14;
        float nrFloat = 3.14f;
        // 3. Sa se declare o variabila de tip boolean cu o valoare la alegere
        boolean valoare = false;
        // 4. Printati toate variabilele atit pe acelasi rind, cit si pe rinduri diferite
        System.out.print(semnul);
        System.out.print(" ");
        System.out.print(numarulMeuDouble);
        System.out.print(" ");
        System.out.print(nrFloat);
        System.out.print(" ");
        System.out.print(valoare);

        System.out.println();
        System.out.println(semnul);
        System.out.println(numarulMeuDouble);
        System.out.println(nrFloat);
        System.out.println(valoare);
        System.out.println();

        // 5. Sa se declare 2 variabile: num1, num2. Sa se afiseze la consola suma, difirenta, inmultirea si impartirea lor
        int nr1 = 10;
        int nr2 = 3;

        System.out.println(nr1 + nr2);
        System.out.println(nr1 - nr2);
        System.out.println(nr1 * nr2);
        System.out.println(nr1 / nr2);
        System.out.println(nr1 % nr2);
    }
}
