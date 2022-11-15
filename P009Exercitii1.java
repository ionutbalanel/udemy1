import java.util.Scanner;

public class P009Exercitii1 {
    public static void main(String[] args) {
        // 1. Afisati la consola urmatorul text: "Ce profesie iti doresti?" Introduceti de la consola profesia dorita,
        //    dupa care printati mesajul "Tine-o tot asa si in curind vei deveni " + valoarea citita din consola.
        System.out.println("-------------------------------------------------------------------------");

        Scanner cititor = new Scanner(System.in);

        System.out.println("Ce profesie iti doresti?");
        String profesieDorita = cititor.nextLine();
        System.out.println("Tine-o tot asa si in curind vei deveni - " + profesieDorita);

        System.out.println("-------------------------------------------------------------------------");
        // 2. Scrie un program care afiseaza urmatorul text: "Salut. Cati ani ai?". Introduceti de la consola varsta voastra
        //    si bagati-o intr-o variabila corespunzatoare. Afisati la consola un text de forma "Inteleg ca ai x ani".

        System.out.println("Salut. Cati ani ai?");
        int varstaIntrodusa = cititor.nextInt();
        System.out.println("Inteleg ca ai " + varstaIntrodusa + " ani");
        System.out.printf("Inteleg ca ai %d ani\n", varstaIntrodusa);

        System.out.println("-------------------------------------------------------------------------");
        // 3. Scrieti un program care va intreba care este genul vostru (M/F) si va cere sa introduceti de la consola M (masculin)
        //    sau F (feminin). Stocati litera intr-o variabila corespunzatoare, apoi afisati la consola "Genul ales: x"

        System.out.print("Introduceti genul vostru M (masculin) sau F (feminin): ");
        char genIntrodus = cititor.next().charAt(0);
        System.out.println("Genul vostru este: " + genIntrodus);
        System.out.printf("Genul vostru este: %c\n", genIntrodus);

        System.out.println("-------------------------------------------------------------------------");
        // 4. Cereti de la user 3 numere. Salvati numerele citite de la consola in 3 variabile. Afisati suma, diferenta,
        //    produsul si media lor pe rinduri diferite, utilizand formatul: "Suma este: ....", "Diferenta este: ....", etc.
        //    Incercati sa puneti aceste expresii pe randuri diferite folosind un singur apel al consolei. Hint: "\n"

        System.out.println("Introduceti primul numar: ");
        int n1 = cititor.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int n2 = cititor.nextInt();
        System.out.println("Introduceti al treilea numar: ");
        int n3 = cititor.nextInt();

        int suma = n1 + n2 + n3;
        int dif = n1 - n2 - n3;
        int medie = suma / 3;

        System.out.printf("Suma numerelor este egala cu: %d\nDiferenta numerelor este egala cu: %d\nMedia aritmetica a numerelor este egala cu: %d\n",suma, dif, medie);

        System.out.println("-------------------------------------------------------------------------");
        // 5. Scrieti un program care cere o temperatura in grade Celsius si o transforma si afiseaza in grade Fahrenheit.
        //    gasiti formula pe Google. Daca nu reusiti, vom face dupa impreuna rezolvarea.

        System.out.println("Introduceti temperatura in grade celsius: ");
        int gradeCelsius = cititor.nextInt();
        int gradeFahrenheit = gradeCelsius * (9/5) + 32;
        System.out.println("Rezultatul in fahrenheit este egal cu: " + gradeFahrenheit);

        System.out.println("-------------------------------------------------------------------------");
    }
}
