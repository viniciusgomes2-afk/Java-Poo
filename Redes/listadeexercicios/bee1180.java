package Redes.listadeexercicios;

import java.util.Scanner;

public class bee1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoArray = sc.nextInt();
        int menorValor;
        int posicao = 0;

        int[] array = new int[tamanhoArray];

        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        menorValor = array[0];

        for(int i = 0; i < array.length-1; i++){
            if(menorValor >= array[i]){
                menorValor = array[i];
                posicao = i;
            }
        }

        System.out.printf("Menor valor: %d%nPosicao: %d%n", menorValor, posicao);
    }
}
