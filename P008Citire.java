import java.util.Scanner;

public class P008Citire {
    public static void main(String[] args) {

        Scanner cititor = new Scanner(System.in);
        Scanner cititorText = new Scanner(System.in);

        System.out.println("Introduceti textul dorit: ");
        String textIntrodus = cititor.nextLine();
        System.out.println("Am introdus textul " + textIntrodus);

        System.out.println("Introduceti caracterul dorit: ");
        char caracterIntrodus = cititorText.next().charAt(0);
        System.out.println("Am introdus caracterul " + caracterIntrodus);

        System.out.println("Introduceti numarul dorit: ");
        int numarIntrodus = cititor.nextInt();
        System.out.println("Am introdus numaru " + numarIntrodus);

        System.out.println("Introduceti un numar double: ");
        double doubleIntrodus = cititor.nextDouble();
        System.out.println("Am introdus numarul double " + doubleIntrodus);

        System.out.println("Introduceti un numar float: ");
        float floatIntrodus = cititor.nextFloat();
        System.out.println("Am introdus numarul float " + floatIntrodus);

        System.out.println("Introduceti un numar long: ");
        long longIntrodus = cititor.nextLong();
        System.out.println("Am introdus numarul long " + longIntrodus);

        System.out.println("Introduceti un boolean: ");
        boolean boolIntrodus = cititor.nextBoolean();
        System.out.println("Am introdus booleanul " + boolIntrodus);
    }
}
