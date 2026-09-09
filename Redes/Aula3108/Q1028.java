package Redes.Aula3108;

import java.util.Scanner;

public class Q1028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int resto;
        int casosTeste = sc.nextInt();
        int ricardoFigs;
        int vicenteFigs;
        int menor2;


        for(int i = 1; i <= casosTeste; i++){
                ricardoFigs = sc.nextInt();
                vicenteFigs = sc.nextInt();

            int maior = (ricardoFigs + vicenteFigs + Math.abs(ricardoFigs - vicenteFigs)) / 2;
            int menor = (vicenteFigs + ricardoFigs) - maior;
            
            resto = maior % menor;
            while(true){
                if(resto == 0){
                System.out.println(menor);
                break;
            } else {
                maior = menor;
                menor = resto;
                 resto = maior % resto;
                 if(resto == 0){
                    System.out.println(menor);
                    break;
                 }
            }
            }
        }
    }
}