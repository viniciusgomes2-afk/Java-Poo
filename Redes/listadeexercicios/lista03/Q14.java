package listadeexercicios.lista03;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", i, n, i*2);
        }
        sc.close();
    }
    
}
