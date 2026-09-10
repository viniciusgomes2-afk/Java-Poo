package Redes.listadeexercicios;

import java.util.Scanner;

public class bee1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alturaPulo = sc.nextInt();
        int numeroCanos = sc.nextInt();
        boolean gameOver = false;

        int [] canos = new int[numeroCanos];

        for(int i = 0; i < canos.length; i++){
            canos[i] = sc.nextInt();
        }

        for(int i = 0; i < canos.length-1; i++){
            if(Math.abs(canos[i] - canos[i+1]) > alturaPulo){
                gameOver = true;
                break;
            }
        }
        if(gameOver == false){
            System.out.println("YOU WIN");
        } else{
            System.out.println("GAME OVER");
        }

        sc.close();
    }

}
