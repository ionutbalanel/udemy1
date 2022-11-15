import java.util.Arrays;

public class P020AlgoritmDeSortare {
    public static void main(String[] args) {
        int[] numere = {34, 54, 76, 12, 3, 999, 77, 6, 45, 34};

        System.out.println(Arrays.toString(numere));

        // Varianta I

        Arrays.sort(numere);
        System.out.println("Varianta I");
        System.out.println(Arrays.toString(numere));

        // Varianta II - Bubble Sort
        System.out.println("Varianta II");

        for (int i = 0; i < numere.length; i++) {
            for (int j = i + 1; j < numere.length; j++) {
                if (numere[i] < numere[j]) {
                    int temp = numere[i];
                    numere[i] = numere[j];
                    numere[j] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(numere));
    }
}
