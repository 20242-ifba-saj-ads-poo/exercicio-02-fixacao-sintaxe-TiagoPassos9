public class Questao5 {
    //porque ultrapassou no maximo de capacidade de armazenamento do int/double, e como o long armazena mais, ele demora mais de dar problema.
    static long num, numFinal, nQuero;
    public static long fatorial(long num) {
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
        for (nQuero = 1; nQuero <= 40; nQuero++) {
            System.out.println("o fatorial de  " + nQuero + " = " + fatorial(nQuero));
        }
    }
}
