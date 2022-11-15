import java.util.*;

public class P021ArrayListExercitii2 {
    public static void main(String[] args) {
        // 1. Declarati un vector de numere intregi in care sa bagati 5 numere random.
        //    Copiati toate elementele vectorului intr-o noua lista, apoi printati-o la consola in 2 moduri diferite.
        System.out.println("----------------------------------------------------------");

        int[] numere = new int[5];
        Random generator = new Random();

        for (int i = 0; i < numere.length; i++) {
            int numarGenerat = generator.nextInt(100);
            numere[i] = numarGenerat;
        }

        ArrayList<Integer> lista = new ArrayList<>();
        for (int numar :
                numere) {
            lista.add(numar);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (int numar :
                lista) {
            System.out.println(numar);
        }

        System.out.println("----------------------------------------------------------");
        // 2. Declarati o noua lista de tip String in care utilizatorul va introduce cuvinte de la tastatura pana in momentul in care introduce "stop".
        //    Sortati lista alfabetic, dupa care printati toate elementele listei pe acelasi rand.

        ArrayList<String> lista2 = new ArrayList<>();
        Scanner cititor = new Scanner(System.in);
        while (true) {
            System.out.print("Introduceti un text: ");
            String textIntrodus = cititor.nextLine();
            if (textIntrodus.equals("gata")) {
                break;
            } else {
                lista2.add(textIntrodus);
            }
        }
        Collections.sort(lista2);
        for (String text :
                lista2) {
            System.out.print(text + " ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------------");
        // 3. Declarati o lista de numere double in care sa introduceti in ordine bugetul vostru pentru fiecare luna a anului.
        //    Declarati o lista de numere double in care sa introduceti in ordine cheltuielile voastre pentru fiecare luna a anului
        //    Daca cheltuielile unei luni depasesc bugetul, se va afisa un mesaj corespunzator: "Cheltuielile lunii 1/2/3...12 depasesc bugetul alocat"
        //    Afisati un mesaj in care sa specificati cati bani ramasi veti avea la sfarsitul anului, sau cu cat veti fi pe minus:
        //    caz 1: "La terminarea anului vom ramane pe plus cu x Lei"
        //    caz 2: "La terminarea anului vom ramane pe minus cu x Lei"

        ArrayList<Double> bugetLunar = new ArrayList<>();
        bugetLunar.add(100.4);
        bugetLunar.add(233.4);
        bugetLunar.add(100.4);
        bugetLunar.add(150.5);
        bugetLunar.add(123.4);
        bugetLunar.add(345.0);
        bugetLunar.add(345.6);
        bugetLunar.add(43.2);
        bugetLunar.add(234.5);
        bugetLunar.add(123.3);
        bugetLunar.add(333.1);
        bugetLunar.add(111.4);

        ArrayList<Double> cheltuieliLunare = new ArrayList<>(Arrays.asList(99.3, 23.4, 54.6, 23.5, 65.3, 234.5, 567.5, 234.5, 765.3, 9.0, 100.0, 12.4));

        for (int i = 0; i < bugetLunar.size(); i++) {
            if (bugetLunar.get(i) < cheltuieliLunare.get(i)) {
                System.out.println("Cheltuielile lunii " + (i + 1) + " depasesc bugetul alocat");
            }
        }

        int bugetTotal = 0;
        int cheltuieliTotale = 0;

        for (double buget :
                bugetLunar) {
            bugetTotal += buget;
        }
        for (double expense :
                cheltuieliLunare) {
            cheltuieliTotale += expense;
        }

        if (bugetTotal > cheltuieliTotale) {
            System.out.println("La terminarea anului vom ramine pe plus cu " + (bugetTotal - cheltuieliTotale));
        } else if (bugetTotal < cheltuieliTotale) {
            System.out.println("La terminarea anului vom ramine pe minus cu " + (cheltuieliTotale - bugetTotal));
        } else {
            System.out.println("Banii s-au potrivit la fix!");
        }

        System.out.println("----------------------------------------------------------");
        // 4. Declarati 4 liste si numiti-le noteRomana, noteMatematica, noteEngleza si noteFranceza.
        //    Introduceti 3 note in fiecare lista - valorile posibile trebuie sa fie intre 1 si 10.
        //    Calculati mediile la fiecare materie, apoi media generala.
        //    La final, afisati un mesaj de forma:
        //    Note romana: x1 x2 x3 - Media x4
        //    Note matematica: x1 x2 x3 - Media x4
        //    Note engleza: x1 x2 x3 - Media x4
        //    Note franceza: x1 x2 x3 - Media x4
        //    Media generala X
        //    A TRECUT / A PICAT.   (un elev va trece daca media generala este mai mare ca 5 si nici o medie nu este mai mica ca 4)

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> noteRomana = new ArrayList<>();
        ArrayList<Double> noteMatematica = new ArrayList<>();
        ArrayList<Double> noteEngleza = new ArrayList<>();
        ArrayList<Double> noteFranceza = new ArrayList<>();

        int noteAdaugateRomana = 0;
        while (noteAdaugateRomana < 3) {
            System.out.print("Introduceti nota la romana: ");
            double nota = scanner.nextDouble();

            if (nota >= 1 && nota <= 10) {
                noteRomana.add(nota);
                noteAdaugateRomana++;
            } else {
                System.out.println("Poti introduce doar note intre 1 si 10 inclusiv!");
            }
        }

        int noteAdaugateMate = 0;
        while (noteAdaugateMate < 3) {
            System.out.print("Introduceti nota la matematica: ");
            double nota = scanner.nextDouble();

            if (nota >= 1 && nota <= 10) {
                noteMatematica.add(nota);
                noteAdaugateMate++;
            } else {
                System.out.println("Poti introduce doar note intre 1 si 10 inclusiv!");
            }
        }
        int noteAdaugateEngleza = 0;
        while (noteAdaugateEngleza < 3) {
            System.out.print("Introduceti nota la engleza: ");
            double nota = scanner.nextDouble();

            if (nota >= 1 && nota <= 10) {
                noteEngleza.add(nota);
                noteAdaugateEngleza++;
            } else {
                System.out.println("Poti introduce doar note intre 1 si 10 inclusiv!");
            }
        }
        int noteAdaugateFranceza = 0;
        while (noteAdaugateFranceza < 3) {
            System.out.print("Introduceti nota la franceza: ");
            double nota = scanner.nextDouble();

            if (nota >= 1 && nota <= 10) {
                noteFranceza.add(nota);
                noteAdaugateFranceza++;
            } else {
                System.out.println("Poti introduce doar note intre 1 si 10 inclusiv!");
            }
        }

        double totalRomana = 0;
        double totalMate = 0;
        double totalEngleza = 0;
        double totalFranceza = 0;

        for (double numar :
                noteRomana) {
            totalRomana += numar;
        }

        for (double numar :
                noteMatematica) {
            totalMate += numar;
        }

        for (double numar :
                noteEngleza) {
            totalEngleza += numar;
        }

        for (double numar :
                noteFranceza) {
            totalFranceza += numar;
        }

        double medieRomana = totalRomana / noteRomana.size();
        double medieMate = totalMate / noteMatematica.size();
        double medieEngleza = totalEngleza / noteEngleza.size();
        double medieFranceza = totalFranceza / noteFranceza.size();

        double mediaGenerala = (medieRomana + medieMate + medieEngleza + medieFranceza) / 4;

        System.out.print("Note romana: "+noteRomana.get(0)+" "+noteRomana.get(1)+" "+noteRomana.get(2)+" Media: "+medieRomana);
        System.out.println("");
        System.out.print("Note matematica: "+noteMatematica.get(0)+" "+noteMatematica.get(1)+" "+noteMatematica.get(2)+" Media: "+medieMate);
        System.out.println("");
        System.out.print("Note engleza: "+noteEngleza.get(0)+" "+noteEngleza.get(1)+" "+noteEngleza.get(2)+" Media: "+medieEngleza);
        System.out.println("");
        System.out.print("Note franceza: "+noteFranceza.get(0)+" "+noteFranceza.get(1)+" "+noteFranceza.get(2)+" Media: "+medieFranceza);
        System.out.println("");
        System.out.print("Media generala: "+mediaGenerala);

        System.out.println("");
        System.out.println(mediaGenerala>=5?"A trecut!":"A picat!");



        System.out.println("----------------------------------------------------------");
        // 5. Adaugati intr-o lista de tip String diferentele cunoscute dintre un ArrayList si un vector.
        //    Printati beneficiile. Dupa terminarea exercitiului, revizuiti lectia anterioara (ArrayList) pentru a verifica daca ati omis ceva.




        System.out.println("----------------------------------------------------------");
    }
}
