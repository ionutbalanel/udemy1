import java.util.Scanner;

public class P014OperatorulTernar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ce varsta aveti: ");
        int varsta = sc.nextInt();

        // Varianta I
        if (varsta >= 18) {
            System.out.println("Esti major!");
        } else {
            System.out.println("Esti minor!");
        }
        // Varianta II
        String mesajAfisat = varsta > 18 ? "Esti major!" : "Esti minor!";
        System.out.println(mesajAfisat);
        // Varianta III
        System.out.println(varsta > 18 ? "Esti major!" : "Esti minor!");
    }
}
