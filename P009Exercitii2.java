import java.util.Scanner;

public class P009Exercitii2 {
    public static void main(String[] args) {
        // 1. Scrieti un program care cere un numar (raza cercului) apoi calculeaza si afiseaza perimetrul si aria acestuia.
        //    (gasiti formulele pe net)
        System.out.println("-------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti raza cercului: ");
        double raza = sc.nextDouble();

        double perimetru = 2 * Math.PI * raza;
        double arie = Math.PI * Math.pow(raza, 2);

        System.out.println("Perimetrul cercului este egal cu: " + perimetru);
        System.out.println("Aria cercului este egala cu: " + arie);

        System.out.println("-------------------------------------------------------");
        // 2. Scrieti un program care va cere sa introduceti lungimea unui dreptunghi, apoi latimea acestuia.
        //    Calculati aria si perimetrul si printati un text de forma
        //    "Aria/Perimetrul unui dreptunghi de lungime x si latime y este egal/egale cu ..."

        System.out.print("Introduceti lungimea dreptunghiului: ");
        int lungime = sc.nextInt();
        System.out.print("Introduceti latimea dreptunghiului: ");
        int latime = sc.nextInt();

        int per = 2 * lungime + 2 * latime;
        int ar = lungime * latime;

        System.out.printf("Perimetrul dretunghiului de lungime %d si latime %d este egal cu %d\n", lungime, latime, per);
        System.out.printf("Aria dretunghiului de lungime %d si latime %d este egal cu %d\n", lungime, latime, ar);

        System.out.println("-------------------------------------------------------");
        // 3. Scrieti un program care cere de la consola ora actuala, apoi printeaza cate ore au mai ramas pana la miezul noptii

        System.out.print("Introduceti ora actuala: ");
        int ora = sc.nextInt();
        System.out.println("Pana la miezul noptii au mai ramas: " + (24 - ora));

        System.out.println("-------------------------------------------------------");
        // 4. Scrieti un program care cere de la consola anul nasterii voastre, apoi afiseaza ce varsta aveti.

        System.out.print("Introduceti anul nasterii dvs: ");
        int anulNasterii=sc.nextInt();
        System.out.print("Introduceti anul in care va aflati la moment: ");
        int anulActual=sc.nextInt();

        int varsta=anulActual-anulNasterii;
        System.out.println("Aveti: "+varsta+" ani!");

        System.out.println("-------------------------------------------------------");
        // 5. Scrieti un program care cere de la consola cate pagini are cartea voastra, cate pagini intentionati sa citi pe zi,
        //    apoi va printeaza un mesaj de forma "In ritmul asta vei termina cartea in x zile"

        System.out.print("Cate pagini are cartea dvs: ");
        int nrPagini = sc.nextInt();
        System.out.print("Cate pagini intentionati sa cititi pe zi?: ");
        int paginiPeZi = sc.nextInt();

        System.out.println("In ritmul acesta vei termina cartea in: "+(nrPagini/paginiPeZi)+" zile");

        System.out.println("-------------------------------------------------------");
    }
}
