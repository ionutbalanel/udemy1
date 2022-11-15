public class P007Exercitii {
    public static void main(String[] args) {
        // 1. Sa se declare 2 variabile: num1, num2. Initializa-ti-le si printatile

        int num1 = 100;
        int num2 = 30;

        System.out.println("----------------------------------------------------");

        System.out.printf("Primul numar este %d, iar al doilea %d\n", num1, num2);

        System.out.println("----------------------------------------------------");
        // 2. Declarati 4 variabile: suma, difirenta, produsul si impartirea in care sa stocati operatiile
        //    primului numar raportat la al doilea. Printati rezultatele

        int suma = num1 + num2;
        int dif = num1 - num2;
        int produs = num1 * num2;
        int cat = num1 / num2;

        System.out.println("Suma este " + suma);
        System.out.println("Diferenta este " + dif);
        System.out.println("Produsul este " + produs);
        System.out.println("Catul este " + cat);

        System.out.println("----------------------------------------------------");

        // 3. Declarati 4 variabile in care sa stocati suma, difirenta, produsul si impartirea in care sa stocati operatiile
        //    celui de-al doilea numar raportat la primul. Printati rezultatele

        int suma2 = num2 + num1;
        int dif2 = num2 - num1;
        int produs2 = num2 * num1;
        int cat2 = num2 / num1;

        System.out.printf("Suma este %d, diferenta %d, produsul %d si catul %d\n", suma2, dif2, produs2, cat2);

        System.out.println("----------------------------------------------------");
        // 4. Declarati o variabila num3. Adunati noua variabila tuturor rezultatelor anterioare, si afisati pentru fiecare mesajul
        //    "Dupa ce am adaugat num3 sumei/diferentei/..., am obtinut rezultat"

        int num3 = 50;

        suma += num3;
        dif += num3;
        produs = produs + num3;
        cat = cat + num3;

        System.out.printf("Dupa ce am adaugat %d sumei mele, rezultatul a devenit %d\n", num3, suma);
        System.out.printf("Dupa ce am scazut %d diferentei mele, rezultatul a devenit %d\n", num3, dif);
        System.out.printf("Dupa ce am inmultit %d produsului meu, rezultatul a devenit %d\n", num3, produs);
        System.out.printf("Dupa ce am impartit %d catului meu, rezultatul a devenit %d\n", num3, cat);

        System.out.println("----------------------------------------------------");
        // 5. Declarati o variabila de tip int la alegere si printati la consola tabla inmultirii a acelui numar:
        //    --------------------------------------
        //    valoareNumar x 1 = rezultat1
        //    valoareNumar x 1 = rezultat2
        //    ...
        //    valoareNumar x 1 = rezultat9
        //    -------------------------------------
        int numar = 7;
        System.out.println(numar + " x 1 = " + (numar * 1));
        System.out.println(numar + " x 2 = " + (numar * 2));
        System.out.println(numar + " x 3 = " + (numar * 3));
        System.out.println(numar + " x 4 = " + (numar * 4));
        System.out.println(numar + " x 5 = " + (numar * 5));
        System.out.println(numar + " x 6 = " + (numar * 6));
        System.out.println(numar + " x 7 = " + (numar * 7));
        System.out.println(numar + " x 8 = " + (numar * 8));
        System.out.println(numar + " x 9 = " + (numar * 9));

        System.out.println("----------------------------------------------------");
        // 6. Stocati intr-o variabila restul impartirii numarului 100 la 27 si printati un text de forma
        //    "Restul impartirii lui 100 la 27 este egal cu rest"
        int n1 = 100;
        int n2 = 27;
        int rest = n1 % n2;

        System.out.printf("Restul impartirii lui %d la %d este egal cu %d\n", n1, n2, rest);

        System.out.println("----------------------------------------------------");
        // 7. Declarati si initializati doua variabile de tip int.
        //    Declarati urmatoarele variabile de tip boolean: prumulMaiMare, alDoileaMaiMare, numereEgale.
        //    Initializati valorile de tip boolean pe baza celor doua numere

        int numar1 = 88;
        int numar2 = 67;
        boolean prumulMaiMare = numar1 > numar2;
        boolean alDoileaMaiMare = numar2 > numar2;
        boolean suntEgale = numar1 == numar2;

        System.out.println("Primul este mai mare " + prumulMaiMare);
        System.out.println("Al doilea este mai mare " + alDoileaMaiMare);
        System.out.println("Sunt egale " + suntEgale);

        System.out.println("----------------------------------------------------");
        // 8. Declarati o variabila de tip int si initializati-o. Printati la consola urmatorul text:
        //    "Vom incrementa numarul numarulMeu cu 1 in trei moduri diferite"
        //    Incrementati numarul vostru cu 1 in trei moduri diferite
        //    Printati un text de forma "Dupa ce am adunat 1 in 3 moduri diferite, numarul nostru este egal cu valoareRezultat"

        int numarulMeu = 10;

        System.out.println("Vom incrementa numarul numarulMeu cu 1 in trei moduri diferite");

        numarulMeu = numarulMeu + 1;
        numarulMeu++;
        numarulMeu += 1;

        System.out.println("Dupa ce am adaugat 1 in 3 moduri diferite. Numarul nostru este egal cu " + numarulMeu);

        System.out.println("----------------------------------------------------");
        // 9. Declarati si initializati 2 variabile de tip int: initializati prima variabila cu o valoare pozitiva,
        //    a doua cu o valoare negativa.
        //    Declarati 3 variabile de tip boolean: sumaMaiMareDecitZero, diferentaMaiMicaSauEgalaDecitZero, produsulMaiMareDecit100
        //    si initializati-le folosindu-va de cele doua numere

        int nr1 = 15;
        int nr2 = -100;
        boolean sumaMaiMareDecitZero = (nr1 + nr2) > 0;
        boolean diferentaMaiMicaSauEgalaDecitZero = (nr1 - nr2) <= 0;
        boolean produsulMaiMareDecit100 = nr1 * nr2 > 100;

        System.out.println("Suma mai mare decit 0 " + sumaMaiMareDecitZero);
        System.out.println("Diferenta mai mica sau egala decat 0 " + diferentaMaiMicaSauEgalaDecitZero);
        System.out.println("Produsul mai mare decat 100 " + produsulMaiMareDecit100);

        System.out.println("----------------------------------------------------");
        // 10.Declarati patru variabile de tip double si initializati-le. Afisati la consola doua texte sub forma
        //    Media aritmetica a numerelor n1, n2 si n3 este egala cu rezultat.
        //    Media aritmetica a numerelor n1, n2 si n4 este egala cu rezultat.
        //    Media aritmetica a numerelor n2, n3 si n4 este egala cu rezultat.

        double x1 = 10.0;
        double x2 = 20.5;
        double x3 = 100.2;
        double x4 = 50.0;

        double sum123 = x1 + x2 + x3;
        double sum124 = x1 + x2 + x4;
        double sum234 = x2 + x3 + x4;

        System.out.println("Media aritmetica a numerelor x1 x2 si x3 este egala cu " + (sum123 / 3));
        System.out.println("Media aritmetica a numerelor x1 x2 si x4 este egala cu " + (sum124 / 3));
        System.out.println("Media aritmetica a numerelor x2 x3 si x4 este egala cu " + (sum234 / 3));

        System.out.println("----------------------------------------------------");
    }
}
