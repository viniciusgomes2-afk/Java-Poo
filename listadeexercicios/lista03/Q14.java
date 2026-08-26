package listadeexercicios.lista03;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            int produto = i * n;
            System.out.printf("%d x %d = %d%n", i, n, produto);
        }
        sc.close();

    }
    
}
