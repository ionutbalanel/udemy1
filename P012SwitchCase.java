import java.util.Scanner;

public class P012SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce-ti culoarea semaforului: ");
        String culoareSemafor = sc.nextLine();

        switch (culoareSemafor){
            case "rosu":
                System.out.println("Stam si asteptam!");
                break;
            case "verde":
                System.out.println("Traversam!");

                break;
            case "galben":
                System.out.println("Asteptam!");
                System.out.println("Better safe than sorry!");
                break;
            default:
                System.out.println("Nu ai introdus o culoare valabila!");
                break;
        }
        System.out.println("_____________________________________________________________");

        System.out.print("Introduce-ti luna curenta: ");
        String lunaCurenta = sc.nextLine();

        switch (lunaCurenta){
            case "decembrie":
            case "ianuarie":
            case "februarie":
                System.out.println("Este iarna!");
                break;
            case "martie":
            case "aprilie":
            case "mai":
                System.out.println("Este primavara!");
                break;
            case "iunie":
            case "iulie":
            case "august":
                System.out.println("Este vara!");
                break;
            case "septembrie":
            case "octombrie":
            case "noiembrie":
                System.out.println("Este toamna!");
                break;
            default:
                System.out.println("Nu ai introdus o luna valida!");
                break;
        }
    }
}
