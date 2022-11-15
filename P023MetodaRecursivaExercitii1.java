public class P023MetodaRecursivaExercitii1 {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        System.out.println(getDigitsNumber(11));
        System.out.println(getDigitsNumber(1));
        System.out.println(getDigitsNumber(144));
        System.out.println(getDigitsNumber(10000));

        System.out.println("---------------------------------------");
    }
    // Scrieti o metoda care returneaza numarul de cifre dintr-un numar pasat ca parametru
    // 12 -> 2
    // 123 -> 3
    // 45000 -> 5

    public static int getDigitsNumber(int numar) {
        if (numar / 10 == 0) {
            return 1;
        } else {
            return 1 + getDigitsNumber(numar / 10);
        }
    }

}
