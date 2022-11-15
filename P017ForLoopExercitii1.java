public class P017ForLoopExercitii1 {
    public static void main(String[] args) {
        /*
        // 1. Sa se printeze mesajul "Salut, ma numesc X si voi deveni programator" de 50 de ori.
        System.out.println("---------------------------------------------");

        String nume = "Ion";

        for (int i = 0; i < 50; i++) {
            System.out.println("Salut, ma numesc " + nume + " si voi deveni programator!");
        }

        System.out.println("---------------------------------------------");



        // 2. Sa se printeze toate numerele pare de la 3 la 50 pe acelasi rand.
        // Varianta I
        for (int i = 3; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
        // Varianta II
//        for (int i = 4; i <= 50; i += 2) {
//            System.out.println(i);
//        }

        System.out.println("\n---------------------------------------------");


        // 3. Sa se printeze toate numerele cuprinse in intervalul (0,50) din 4 in 4.

        for (int i = 0; i < 50; i += 4) {
            System.out.print(i+" ");
        }

        System.out.println("\n---------------------------------------------");

        // 4. Sa se printeze toate numerele divizibile cu 3 din intervalul (10,100) pe acelasi rand.

        for (int i = 10; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\n---------------------------------------------");

        // 5. Sa se printeze toate numerele descrescator de la 100 la 0.

        for (int i = 100; i >= 0; i--) {
            System.out.print(i+" ");
        }

        System.out.println("\n---------------------------------------------");
*/
        // 6. Sa se printeze toate numerele divizibile cu 5 descrescator de la 100 la 1 inclusiv.

        for (int i = 100; i >= 1; i--) {
            if (i % 5 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\n---------------------------------------------");


    }
}
