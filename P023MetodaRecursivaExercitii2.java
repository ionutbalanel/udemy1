public class P023MetodaRecursivaExercitii2 {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");

        mirror("abcd");
        mirror("Academia Programatorilor");

        System.out.println("---------------------------------------");
    }
    // Scrieti o metoda care printeaza un string primit ca parametru in oglinda
    // Abcdefgh -> hgfedcbA

    public static void mirror(String text) {
        if (text.length() == 1) {
            System.out.println(text);
        }else {
            System.out.print(text.charAt(text.length()-1));
            mirror(text.substring(0,text.length()-1));
        }
    }

}
