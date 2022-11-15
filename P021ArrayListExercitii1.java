import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class P021ArrayListExercitii1 {
    public static void main(String[] args) {
        // 1. Sa se declare o lista numita characters care sa contina urmatoarele elemente: "Luke Skymalker", "Han Solo", "Chembacca".
        //    Sa se introduca ulterior elementul "Darth Vader", apoi sa se stearga al doilea element, folosind metodele listei.
        //    Printati lista la consola in 2 moduri diferite.
        System.out.println("------------------------------------------------");

        ArrayList<String> characters = new ArrayList<>(Arrays.asList("Luke Skymalker", "Han Solo", "Chembacca"));

        characters.add("Darth Vader");
        // varianta I - de afisare
        for (int i = 0; i < characters.size(); i++) {
            System.out.println(characters.get(i));
        }
        characters.remove(1);

        System.out.println("++++++++++++++++++++++++");

        // varianta II - de afisare
        for (String caracter :
                characters) {
            System.out.println(caracter);
        }

        System.out.println("------------------------------------------------");
        // 2. Sa se declare o lista cu 5 numere si o adoua lista cu alte 5. Sa se copieze a doua lista in prima. Printati cu foreach prima lista
        //    care sa contina toate cele 10 numere.

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(34);
        lista1.add(65);
        lista1.add(100);
        lista1.add(10000);

        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(34, 76, 98, 345, 765));

        // Varianta 1 de copiere
//        for (int numar :
//                lista2) {
//            lista1.add(numar);
//        }

        // Varianta 2 de copiere
        lista1.addAll(lista2);

        for (int numar :
                lista1) {
            System.out.println(numar);
        }

        System.out.println("------------------------------------------------");
        // 3. Sa se declare o lista de caractere care sa contina (* 9 - 3 . Q / ^ p). Sa se afiseze numarul de elemente din lista folosind o
        //    metoda a listei sau un ciclu,

        ArrayList<Character> caractere = new ArrayList<>(Arrays.asList('*', '9', '-', '3'));
        caractere.add('.');
        caractere.add('Q');
        caractere.add('/');
        caractere.add('^');
        caractere.add('p');

        for (char c :
                caractere) {
            System.out.print(c + " ");
        }
        System.out.println("");
        System.out.println(caractere.toString());

        System.out.println("------------------------------------------------");
        // 4. Utilizatorul va introduce cuvinte random intr-o lista pana in momentul in care introduce cuvantul "gata".
        //    Dupa aceea, se va parcurge lista descrescator si se va printa fiecare element la consola.

        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ce cuvand doriti adaugat in lista: ");
            String cuvantCitit = sc.nextLine();
            if (cuvantCitit.equals("gata")) {
                break;
            } else {
                lista.add(cuvantCitit);
            }
        }
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }

        System.out.println("------------------------------------------------");
        // 5. Sa se declare un arraylist de numere intregi in care sa introduceti 200 de numere generate random (valori intre 0 si 100).
        //    printati la consola suma numerelor pare din acea lista.

        ArrayList<Integer> numere = new ArrayList<>();
        Random generator = new Random();

        for (int i = 1; i <= 200; i++) {
            int numarGenerat = generator.nextInt(200) + 1;
            numere.add(numarGenerat);
        }

        for (int nr :
                numere) {
            System.out.print(nr + " ");
        }

        int suma = 0;
        for (int numar :
                numere) {
            if (numar % 2 == 0) {
                suma += numar;
            }
        }
        System.out.println("\nSuma tuturor numerelor pare generate este egala cu: " + suma);

        System.out.println("------------------------------------------------");
    }
}
