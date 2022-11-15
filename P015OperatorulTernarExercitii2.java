import java.util.Scanner;

public class P015OperatorulTernarExercitii2 {
    public static void main(String[] args) {
        // 1. Declarați 2 variabile de tip double și inițializa-ti-le prin citirea lor de la consolă.
        //    Dacă suma lor este mai mare decât 100, printați un mesaj corespunzător. Lafel și dacă nu este.
        //    Folosiți ternary if.
        System.out.println("---------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        double numar1 = sc.nextDouble();

        System.out.print("Introduceti al doilea numar: ");
        double numar2 = sc.nextDouble();

        System.out.println(numar1 + numar2 >= 100 ? "Suma numerelor este mai mare sau egal ca 100" : "Suma NU este mai mare sau egala ca 100");

        System.out.println("---------------------------------------------------------------------------");
        // 2. Scrieți un program care cere userului să introducă trei numere. Dacă media lor aritmetică este mai mare decât 50,
        //    să se afișeze un mesaj corespunzător. Lafel și dacă nu este. Folosiți ternary if.

        System.out.print("Introduceti primul numar: ");
        int nr1 = sc.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int nr2 = sc.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int nr3 = sc.nextInt();

        int medieAritmetica = (nr1 + nr2 + nr3) / 3;

        System.out.println(medieAritmetica > 50 ? "Media este mai mare ca 50" : "Media NU este mai mare ca 50");

        System.out.println("---------------------------------------------------------------------------");
        // 3. Scrieți un program care să ceară utilizatorului numărul de ore lucrătoare într-o zi. Dacă utilizatorul a lucrat minim 8 ore,
        //    se va fișa ,,Ne vedem mâine”. Dacă nu, ,,Programul nu a fost încheiat”.

        System.out.print("Introduceti numarul de ore lucrate: ");
        int oreLucrate = sc.nextInt();

        System.out.println(oreLucrate >= 8 ? "Ne vedem maine" : "Programul nu a fost incheiat");

        System.out.println("---------------------------------------------------------------------------");
        // 4. Declarație o variabila de tip boolean amEnergie și inițializa-ti-le prin citirea ei de la tastatură.
        //    Programul va cere utilizatorului să introducă luna curentă.
        //    Pentru fiecare anotimp se va printa un mesaj corespunzător. Dacă utilizatorul are energie,
        //    se va preinta o activitate specifică anotimpului. Dacă nu, va rămâne acasă și se va odihni.

        Scanner cititor = new Scanner(System.in);

        System.out.print("Aveti energie: ");
        boolean amEnergie = sc.nextBoolean();
        System.out.print("Care este luna curenta: ");
        String luna = cititor.nextLine();

        switch (luna) {
            case "decembrie":
            case "ianuarie":
            case "februarie":
                System.out.println(amEnergie ? "Ne batem cu zapada" : "Stam acasa");
                break;
            case "martie":
            case "aprilie":
            case "mai":
                System.out.println(amEnergie ? "Iesim afara" : "Stam acasa");
                break;
            case "iunie":
            case "iulie":
            case "august":
                System.out.println(amEnergie ? "Mergem la mare" : "Stam acasa");
                break;
            case "septembrie":
            case "octombrie":
            case "noiembrie":
                System.out.println(amEnergie ? "Mergem la cumparaturi" : "Stam acasa");
                break;
            default:
                System.out.println("Nu ai introdus o luna valida!");
                break;
        }

        System.out.println("---------------------------------------------------------------------------");
        // 5. Un magazin online are 4 produse: ps5(pret 2000), xbox(pret 500), pc(pret 2000) si laptop(pret 1500).
        //    Utilizatorul are un buget de 1700 de lei. Programul va întreba utilizatorul ce anume dorește să cumpere.
        //    Dacă are suficienți bani, utilizatorul va cumpăra cu succes produsul respectiv. Dacă nu, se va afișa un mesaj corespunzător

        int pretPs5 = 2000;
        int pretXbox = 500;
        int pretPc = 2000;
        int pretLaptop = 1500;
        int buget = 1700;

        System.out.print("Ce produs doriti sa cumparati: ");
        String produs = cititor.nextLine();

        switch (produs){
            case "ps5":
                System.out.println(buget>pretPs5?"ai cumparat un ps5":"Nu iti ajung banii");
                break;
            case "xbox":
                System.out.println(buget>pretXbox?"ai cumparat un xbox":"Nu iti ajung banii");
                break;
            case "pc":
                System.out.println(buget>pretPc?"ai cumparat un pc":"Nu iti ajung banii");
                break;
            case "laptop":
                System.out.println(buget>pretLaptop?"ai cumparat un laptop":"Nu iti ajung banii");
                break;
            default:
                System.out.println("Nu avem acest produs!");
                break;
        }

        System.out.println("---------------------------------------------------------------------------");
    }
}
