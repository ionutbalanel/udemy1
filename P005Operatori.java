public class P005Operatori {
    public static void main(String[] args) {
        // Operatorii matematici
        // + - * / %

        System.out.println("Operatorii matematici");
        System.out.println(10 + 10);
        System.out.println(100 - 88);
        System.out.println(100 * 3);
        System.out.println(100 / 4);
        System.out.println(7 % 3);

        // Operatori relationali
        System.out.println("Operatori relationali");
        System.out.println(7 == 7);
        System.out.println(7 != 9);
        System.out.println(4 + 4 < 100);
        System.out.println(8 + 8 > 10);
        System.out.println(8 <= 8);
        System.out.println(8 >= 8);

        // Operatorii logici
        System.out.println("Operatorii logici");
        System.out.println(7 < 10 && 100 < 10);
        System.out.println(100 < 1000 || 9 > 100);
        System.out.println(!true);

        // Operatorii de atribuire
        System.out.println("Operatorii de atribuire");
        int numar = 5;
        numar++;
        System.out.println(numar);

        int numar2 = 8;
        numar2--;
        System.out.println(numar2);

        int numar3 = 10;
        numar3 += 20;
        System.out.println(numar3);
        numar3 = numar3 + 20;
        System.out.println(numar3);
    }
}
