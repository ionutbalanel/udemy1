import java.util.Scanner;

public class P010InstructiuneaIF {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti varsta dvs: ");
        int varstaMea = sc.nextInt();

        if (varstaMea >= 18){
            System.out.println("Esti major!");
        }else{
            System.out.println("Esti minor!");
        }

        System.out.println("-------------------------------------");

        Scanner cititor = new Scanner(System.in);

        System.out.print("Introduceti culoarea semaforului: ");
        String culoareSemafor = cititor.nextLine();

        if (culoareSemafor.equalsIgnoreCase("rosu")){
            System.out.println("Stam si asteptam!");
        } else if (culoareSemafor.equalsIgnoreCase("galben")) {
            System.out.println("Suntem prudenti!");
        } else if (culoareSemafor.equalsIgnoreCase("verde")) {
            System.out.println("Trecem strada!");
        }else {
            System.out.println("Nu ai introdus o culoare valabila a semaforului!");
        }

        System.out.println("-------------------------------------");
    }
}
