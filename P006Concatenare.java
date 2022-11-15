public class P006Concatenare {
    public static void main(String[] args) {
        int nr = 10;
        String text = "Test";
        double nrDouble = 11.1;
        float nrFloat = 11.1f;
        boolean adevar = true;
        char c = '*';

        System.out.println("Variabila mea string are valoarea " + text);
        System.out.println("Numarul meu este " + nr);
        System.out.println(nrDouble + " este numarul meu double");
        System.out.println(nrFloat + " este numarul meu float");
        System.out.println("am declarat un caracter " + c);
        System.out.printf("am declarat o variabila string cu valoarea %s\n", text);
        System.out.printf("am declarat o variabils de tip int cu valoarea %d\n", nr);
        System.out.printf("am declarat o variabils double cu valoarea %.2f si un string cu valoarea %s\n", nrDouble, text);
        System.out.printf("am declarat un boolean %b\n",adevar);
        System.out.printf("caracterul meu este %c\n",c);
    }
}
