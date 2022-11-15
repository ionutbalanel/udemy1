import java.util.Scanner;

public class P013SwitchCaseExercitii2 {
    public static void main(String[] args) {
        // 1. Scrieti un program care cere utilizatorului sa introduca clasa in care e si sa afiseze mesaj corespunzator:
        //    1-4:Primara.
        //    5-8:Generala.
        //    9-12:Liceu.
        //    Daca utilizatorul introduce un alt numar, se va afisa un mesaj corespunzator
        System.out.println("-----------------------------------------------------------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("In ce clasa esti: ");
        int clasa = sc.nextInt();

        switch (clasa){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Scoala primara!");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("Scoala gimnaziala!");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Liceu");
                break;
            default:
                System.out.println("Nu ai introdus o clasa valabila!");
        }

        System.out.println("-----------------------------------------------------------------------");
        // 2. Declarati o variabila String manaOponentului, cu valoarea "piatra".
        //    Programul va cere utilizatorului sa introduca "piatra", "foarfece" sau "hartie".
        //    In functie de ce introduce utilizatorul, afisati un mesaj corespunzator: Ai castigat/Remiza/Ai pierdut

        String manaOponentului = "stacan";
        Scanner cititor = new Scanner(System.in);

        System.out.print("Introduceti mana voastra: ");
        String manaMea = cititor.nextLine();

        switch (manaMea){
            case "stacan":
                System.out.println("Remiza!");
                break;
            case "foarfece":
                System.out.println("Ai pierdut!");
                break;
            case "hartie":
                System.out.println("Ai castigat!");
                break;
            default:
                System.out.println("Nu ai introdus o mana valabila!");
        }

        System.out.println("-----------------------------------------------------------------------");
        // 3. Scrieti un program care cere utilizatorului limbajul de programare preferat:
        //    Daca introduce "Java", programul va afisa "Cel mai frumos limbaj de programare"
        //    Daca introduce "C#", programul va afisa "Un limbaj bun"
        //    Daca introduce "PHP", programul va afisa "Hmmm"
        //    Daca introduce altceva", programul va afisa "Nu cunosc acest program!"

        System.out.print("Care este limbajul vostru preferat de programare: ");
        String raspuns = cititor.nextLine();

        switch (raspuns){
            case "Java":
                System.out.println("Cel mai frumos limbaj de programare!");
                break;
            case "C#":
                System.out.println("Un limbaj bun!");
                break;
            case "PHP":
                System.out.println("Hmmm");
                break;
            default:
                System.out.println("Nu recunosc acest limbaj!");
                break;
        }


        System.out.println("-----------------------------------------------------------------------");
        // 4. Scrieti un program care cere utilizatorului o litera si printeaza VOCALA, daca caracterul este vocala,
        //    CONSOANA daca caracterul este consoana si NUMAR daca caracterul este numeric.
        //    In caz contrar se va printa CARACTER SPECIAL

        System.out.print("Introduceti un caracter: ");
        char c = cititor.next().charAt(0);
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
                System.out.println("Vocala!");
                break;
            case '!':
            case '@':
            case '#':
            case '$':
            case '%':
            case '^':
            case '&':
            case '*':
            case '(':
            case ')':
            case '-':
                System.out.println("Caracter special!");
                break;
            default:
                System.out.println("Consoana!");
        }


        System.out.println("-----------------------------------------------------------------------");
        // 5. Scrieti un program care cere utilizatorului ora actuala.
        //    Pentru fiecare ora/interval orar, afisati un mesaj corespunzator programului vostru zilnic.



        System.out.println("-----------------------------------------------------------------------");
    }
}
