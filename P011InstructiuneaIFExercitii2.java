import java.util.Scanner;

public class P011InstructiuneaIFExercitii2 {
    public static void main(String[] args) {
        // 1. Scrieti un program care va cere sa introduceti varsta voastra. Daca aveti peste 18 ani.
        //    printati la consola textul "Sunteti major!", daca nu, "Sunteti minor"
        System.out.println("-----------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Care este varsta dvs: ");
        int varsta = sc.nextInt();

        if (varsta >= 18) {
            System.out.println("Sunteti major!");
        } else {
            System.out.println("Sunteti minor!");
        }

        System.out.println("-----------------------------------------------------------------");
        // 2. Scrieti un program care determina daca suma a doua numere este sau nu mai mare decat 100 si afiseaza un mesaj corespunzator:
        //    "Suma numerelor ESTE / NU ESTE mai mare decat 100"

        System.out.print("Introduceti primul numar: ");
        int numar1 = sc.nextInt();
        System.out.print("Introduceti al doilea numar: ");
        int numar2 = sc.nextInt();

        int suma = numar1 + numar2;

        if (suma >= 100) {
            System.out.println("Suma numerelor ESTE mai mare sau egal cu 100");
        } else {
            System.out.println("Suma numerelor NU este mai mare sau egal cu 100");
        }

        System.out.println("-----------------------------------------------------------------");
        // 3. Scrieti un program care cere utilizatorului culoarea actuala a semaforului. Daca este verde.
        //    Afisati "Treceti". daca este galben, afisati "Asteptati". Daca este rosu, afisati "Stop"

        Scanner cititor = new Scanner(System.in);

        System.out.print("Introduceti culoarea semaforului: ");
        String culoare = cititor.nextLine();

        if (culoare.equalsIgnoreCase("rosu")) {
            System.out.println("Stop!");
        } else if (culoare.equalsIgnoreCase("galben")) {
            System.out.println("Asteptati!");
        } else if (culoare.equalsIgnoreCase("verde")) {
            System.out.println("Treceti!");
        } else {
            System.out.println("Culoarea introdusa nu este valida!");
        }

        System.out.println("-----------------------------------------------------------------");
        // 4. Scrieti un program care cere de la consola ora actuala, apoi printeaza cate ore au mai ramas pana la miezul noptii.
        //    De data asta, daca utilizatorul introduce o ora invalida, afisati un mesaj corespunzator

        System.out.print("Introduceti ora actuala: ");
        int ora = sc.nextInt();

        if (ora < 0 || ora > 24) {
            System.out.println("Nu ai introdus o ora valida!");
        } else {
            System.out.println("Pana la miezul noptii au mai ramas: " + (24 - ora) + " ore!");
        }

        System.out.println("-----------------------------------------------------------------");
        // 5. Declarati o variabila amEnergie de tip boolean si initializa-ti-o, prin citirea ei de la consola.
        //    Daca ai energie, programul iti va sugera sa iesi la alergat. Daca nu, sa bei o cafea.

        System.out.print("Aveti energie?: ");
        boolean amEnergie = sc.nextBoolean();

        if (amEnergie){
            System.out.println("Iesi la alergat!");
        }else {
            System.out.println("Bea p cafea!");
        }

        System.out.println("-----------------------------------------------------------------");
        // 6. Creati o aplicatie in care utilizatorul introduce un numar intre 1 si 100. Daca numarul este mai mic decat 50,
        //    aplicatia noastra va afisa multiplicarea lui cu 5. Dar daca numarul este mai mare decat 50,
        //    aplicatia noastra va afisa multiplicarea lui cu 2, si daca numarul este impar, va afisa multiplicarea lui cu 3.

        System.out.print("Introduceti un numar intre 0 si 100: ");
        int numarIntrodus = sc.nextInt();

        if (numarIntrodus<0||numarIntrodus>100){
            System.out.println("Nu ai introdus un numar intre 0 si 100");
        }else {
            if (numarIntrodus%2!=0){
                System.out.println("este IMPAR: "+(numarIntrodus*3));
            } else if (numarIntrodus<50) {
                System.out.println("Numarul este mai mic decat 50. Rezultatul este: "+(numarIntrodus*5));
            } else {
                System.out.println("Numarul este mai mare decat 50. Rezultatul este: "+(numarIntrodus*2));
            }
        }

        System.out.println("-----------------------------------------------------------------");
    }
}
