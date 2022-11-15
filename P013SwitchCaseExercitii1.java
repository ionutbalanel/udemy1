import java.util.Scanner;

public class P013SwitchCaseExercitii1 {
    public static void main(String[] args) {
        // 1. Introduceti un numar de la tastatura intre 1 si 9. Sa se printeze pentru fiecare numar introdus,
        //    numele lui de tip text: Pentru 1 printati "Unu" s.a.m.d.
        System.out.println("-------------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un  umar cuprins intre 1 si 9: ");
        int numarCitit = sc.nextInt();

        switch (numarCitit){
            case 1:
                System.out.println("Unu");
                break;
            case 2:
                System.out.println("Doi");
                break;
            case 3:
                System.out.println("Trei");
                break;
            case 4:
                System.out.println("Patru");
                break;
            case 5:
                System.out.println("Cinci");
                break;
            case 6:
                System.out.println("Sase");
                break;
            case 8:
                System.out.println("Opt");
                break;
            case 9:
                System.out.println("Noua");
                break;
            default:
                System.out.println("Nu ai introdus un numar cuprins intre 1 si 9");
        }

        System.out.println("-------------------------------------------------------------------------");
        // 2. Scrieti un program care cere utilizatorului nota obtinuta la matematica si afiseaza mesajele corespunzatoare:
        //    1-4: Ai picat!
        //    5-6: Mai ai de munca!
        //    7-9: Bravo!
        //    10:  FELICITARI!
        //    Folositi switch

        System.out.print("Introduceti nota la matematica: ");
        int nota = sc.nextInt();

        switch (nota){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Ai picat!");
                break;
            case 5:
            case 6:
                System.out.println("Mai ai de munca!");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Bravo!");
                break;
            case 10:
                System.out.println("FELICITARI!");
                break;
            default:
                System.out.println("Nu ai introdus o nota cuprinsa intre 1 si 10");
        }

        System.out.println("-------------------------------------------------------------------------");
        // 3. Scrieti un program care cere utilizatorului ziua actuala si afisati mesajele corespunzatoare.
        //    Daca este zi lucratoare, "Spor la munca". Daca nu, "Odihna placuta"

        Scanner cititor = new Scanner(System.in);

        System.out.print("Introduceti ziua actuala: ");
        String zi = cititor.nextLine();

        switch (zi){
            case "luni":
            case "marti":
            case "miercuri":
            case "joi":
            case "vineri":
                System.out.println("Spor la treaba!");
                break;
            case "sambata":
            case "duminica":
                System.out.println("Odihna placuta!");
                break;
            default:
                System.out.println("Nu ai introdus o zi valabila!");
        }

        System.out.println("-------------------------------------------------------------------------");
        // 4. Scrieti un program care intreaba utilizatorul cum se descurca in acest curs.
        //    Daca introduce "foarte bine" computerul va afisa "<3"
        //    Daca introduce "bine" computerul va afisa "Ma bucur"
        //    Daca introduce "slab" computerul va afisa "Hai sa refacem exercitiile de la inceput"
        //    Daca introduce "nu inteleg nimic" computerul va afisa "Minti"

        System.out.print("Cum va descurcati in acest curs: ");
        String raspuns = cititor.nextLine();

        switch (raspuns){
            case "foarte bine":
                System.out.println("<3");
                break;
            case "bine":
                System.out.println("Ma bucur!");
                break;
            case "slab":
                System.out.println("Hai sa refacem exercitiile de la inceput!");
                break;
            case "nu inteleg nimic":
                System.out.println("Minti!");
                break;
            default:
                System.out.println("Nu ai introdus un raspuns valabil!");
        }

        System.out.println("-------------------------------------------------------------------------");
        // 5. Scrie un program care sa intrebe ce destinatie de vacanta prefera: mare, munte sau la tara.
        //    Pentru fiecare caz, programul va printa niste locuri corespunzatoare interesante.

        System.out.print("Care este destinatia ta de vacanta preferata: ");
        String answer = cititor.nextLine();

        switch (answer){
            case "mare":
                System.out.println("Vama veche, Mamaia, Costinesti");
                break;
            case "munte":
                System.out.println("Brasov, Bucegi, Sibiu");
                break;
            case "la tara":
                System.out.println("Ialomita, Giurgiu, Alexandria");
                break;
            default:
                System.out.println("Nu recunoastem aceasta destinatie!");
        }

        System.out.println("-------------------------------------------------------------------------");
    }
}
