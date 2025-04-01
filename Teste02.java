import java.util.Scanner;

public class Teste02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        sc.close();

        if (FibonacciTeste.isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }

    }

    public class FibonacciTeste {
        public static boolean isFibonacci(int n) {
            int a = 0, b = 1, temp;

            while (a <= n) {
                if (a == n) {
                    return true;
                }
                temp = a + b;
                a = b;
                b = temp;
            }
            return false;

        }
    }
}
