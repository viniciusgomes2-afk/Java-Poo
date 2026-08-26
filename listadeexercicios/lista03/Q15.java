package listadeexercicios.lista03;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int posicao = 0;
        
        for(int i = 1; i <= 99; i++){
                        
            int n = sc.nextInt();

            if(n > maior){
                maior = n;
                posicao = i;
            }
        } 

        System.out.printf("%d%n%d%n", maior, posicao);
    }
}
    
