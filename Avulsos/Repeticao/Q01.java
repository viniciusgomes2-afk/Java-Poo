/*Escrever um programa que leia um conjunto de números positivos, e exiba se o número
* lido é par ou ímpar. Exiba ao final a soma total dos números pares lidos e também a soma dos
* números ímpares lidos. Suporemos que o número de elementos deste conjunto não é
* conhecido, e que um número negativo será utilizado para sinalizar o fim dos dados. */ 

package Avulsos.Repeticao;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n; 
        int somaPar = 0;
        int somaImpar = 0;
        
        do{
            n = sc.nextInt();
            if(n % 2 == 0 && n >= 0){
                System.out.println("Par");
                somaPar += n;
            } else if (n % 2 != 0 && n >= 0) {
                System.out.println("Impar");
                somaImpar += n;
            }
        } while (n >= 0);

        System.out.printf("Soma dos números pares = %d%nSoma dos números impares = %d%n", somaPar, somaImpar);
    }
}
