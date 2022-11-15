import java.util.ArrayList;

public class P019Vectori {
    public static void main(String[] args) {

        String[] vectorNume = new String[3];

        vectorNume[0] = "Andrei";
        vectorNume[1] = "Gabi";
        vectorNume[2] = "Andreea";

        // Varianta I - for
        // crescator
        for (int i = 0; i < vectorNume.length; i++) {
            System.out.print(vectorNume[i] + " ");
        }

        System.out.println("");
        // descrescator
        for (int i = vectorNume.length-1; i >= 0; i--) {
            System.out.print(vectorNume[i] + " ");
        }
        System.out.println("");

        // Varianta II - foreach
        for (String nume : vectorNume) {
            System.out.print(nume + " ");
        }
    }
}
