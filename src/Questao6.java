public class Questao6 {
    public static void main(String[] args) {
        System.out.println("Sequência de Fibonacci:");
        long num1 = 0;
        long num2 = 1;
        System.out.println(num1);
        System.out.println(num2);

        while (num2 <= 100) {
            long nextNum = num1 + num2;
            System.out.println(nextNum);
            num1 = num2;
            num2 = nextNum;
        }
    }
}
