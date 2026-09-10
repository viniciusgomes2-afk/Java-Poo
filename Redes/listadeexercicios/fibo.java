import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] vetor = new long[61];
        vetor[0] = 0;
        vetor[1] = 1;

        int casosDeTeste = sc.nextInt();

        for (int j = 0; j < casosDeTeste; j++) {
            int n = sc.nextInt();
            for (int i = 0; i < vetor.length - 2; i++) {
                vetor[i + 2] = vetor[i] + vetor[i + 1];
                }
                System.out.printf("Fib(%d) = %d%n",n, vetor[n]);
            }
        }
    }

