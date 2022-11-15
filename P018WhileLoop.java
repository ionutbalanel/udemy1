import java.util.Scanner;

public class P018WhileLoop {
    public static void main(String[] args) {
        String nume = "Ion";

        int counter = 0;

        while (counter < 10) {
            System.out.println(counter + 1 + " " + nume);
            counter++;
        }

        // Scrieti un program care cere utilizatorului sa introduca de la consola un numar mai mare decat 100

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Introduceti un numar: ");
            int numarIntrodus = sc.nextInt();

            if (numarIntrodus>100){
                System.out.println("Felicitari. Ai introdus un numar mai mare ca 100");
                break;
            }else {
                System.out.println("Trebuie sa introduci un numar mai mare ca 100");
            }
        }
    }
}
