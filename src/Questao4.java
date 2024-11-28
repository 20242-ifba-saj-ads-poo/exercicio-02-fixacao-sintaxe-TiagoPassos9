public class Questao4 {
    static double num, numFinal, nQuero;
    public static double fatorial(double num) {
        numFinal = num;
        if (num <= 1) {
            return 1;
        } else {
            while (num > 1) {
                numFinal = (numFinal * (num - 1));
                num--;
            }
            return numFinal;
        }
    }

    public static void main(String[] args) {
        System.out.println("Calculo fatorial:");
        for (nQuero = 1; nQuero <= 10; nQuero++) {
            System.out.println("o fatorial de  " + nQuero + " = " + fatorial(nQuero));
        }
    }
}
