package Redes.Aula3108;

import java.util.Scanner;

public class Q1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isN1Valid = false;
        boolean isN2Valid = false;
        double n1 = 0;
        double n2 = 0;

        while (true) {
            double entrada = sc.nextDouble();
            if (isN1Valid == false) {
                if (entrada >= 0 && entrada <= 10) {
                    n1 = entrada;
                    isN1Valid = true;
                } else {
                    System.out.println("nota invalida");
                }
            } else if (entrada >= 0 && entrada <= 10) {
                n2 = entrada;
                isN2Valid = true;
                break;
            } else {
                System.out.println("nota invalida");
            }
        }

        System.out.printf("media = %.2f%n", (n1+n2) / 2);

        sc.close();

    }
}
