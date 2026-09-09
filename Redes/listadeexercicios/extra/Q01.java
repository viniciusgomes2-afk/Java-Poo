    package Redes.listadeexercicios.extra;

    import java.util.Scanner;

    public class Q01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int casosDeTeste = sc.nextInt();
            int ultimoDigito;

            for(int i = 1; i <= casosDeTeste; i++){
                int num = sc.nextInt();
                int totalDeLeds = 0;
                
                if(num == 0){
                    totalDeLeds = 6;
                } else {
                    while (num > 0) {
                    ultimoDigito = num % 10;
                    num = num / 10;
                    
                    totalDeLeds += switch(ultimoDigito){
                    case 1 ->  2;
                    case 2 ->  5;
                    case 3 ->  5;
                    case 4 ->  4;
                    case 5 ->  5;
                    case 6 ->  6;
                    case 7 ->  3;
                    case 8 ->  7;
                    case 9 ->  6;
                    case 0 ->  6;
                    default -> 0;
                };
            }   

                }
            System.out.printf("%d leds%n", totalDeLeds);
        }
            sc.close();
        }
        
    }
