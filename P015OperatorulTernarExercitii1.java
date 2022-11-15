import java.util.Scanner;

public class P015OperatorulTernarExercitii1 {
    public static void main(String[] args) {
        // 1. Cititi de la tastatura un numar. Daca numarul este negativ, printati un mesaj corespunzator.
        //    La fel si daca este pozitiv.
        //    Programul trebuie sa aiba 3 linii de cod.
        System.out.println("----------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int numarIntrodus = sc.nextInt();

        System.out.println(numarIntrodus >= 0 ? "Numar este pozitiv" : "Numar este negativ");

        System.out.println("----------------------------------------------------------");
        // 2. Declarati o variabila de tip boolean suntInsetat si initializa-ti-o prin citirea valorii de la tastatura.
        //    Pe baza lui se vor printa doua mesaje posibile: "Bea niste apa" sau "Nu mai bea atunci".
        //    Folositi ternary if

        System.out.print("Iti este sete? Introdu true sau false: ");
        boolean suntInsetat = sc.nextBoolean();

        System.out.println(suntInsetat ? "Bea niste apa" : "Nu mai bea atunci");

        System.out.println("----------------------------------------------------------");
        // 3. Declarati 2 variabile de tip int si initializa-ti-le prin citirea lor de la tastatura.
        //    Daca primul numar este mai mare, printati un mesaj corespunzator. În caz contrar, printați ,,Primul număr NU este mai mare”.
        //    Programul trebuie să aibă doar 4 linii de cod.

        System.out.print("Introduceti primul numar: ");
        int nr1 = sc.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int nr2 = sc.nextInt();

        System.out.println(nr1 > nr2 ? "Primul numar este mai mare" : "Primul numar NU este mai mare");

        System.out.println("----------------------------------------------------------");
        // 4. Declarați două variabile de tip int și inițializa-ti-le. Userull va introduce un număr de la tastatură.
        //    Dacă numărul introdus este mai mare decât cele două numere, se va afișa un mesaj corespunzător. La fel si dacă nu.
        //    Folosiți ternary if.

        int numar1 = 100;
        int numar2 = 200;

        System.out.print("Introduceti un numar: ");
        int nrIntrodus = sc.nextInt();

        System.out.println((nrIntrodus > numar1 && nrIntrodus > numar2) ? "Numarul introdus este mai mare" : "Numarul introdus NU este mai mare");

        System.out.println("----------------------------------------------------------");
        // 5. Scrieți un program care cere utilizatorului să își introducă media anuală.
        //    Dacă media este mai mare ca 5, printați ,,Vei trece anul”. In caz contrar, ,,Vei repeta anul”.
        //    Folosiți ternary if.

        System.out.print("Introduceti media voastra anuala: ");
        int media = sc.nextInt();

        System.out.println(media > 5 ? "Vei trece anul" : "Vei repeta anul");

        System.out.println("----------------------------------------------------------");
    }
}
