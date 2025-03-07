import java.util.Scanner;

    public class AtividadeUm{
         public static void main(String args[]){
            
        Scanner sc = new Scanner(System.in);

        System.out.println("insira o numero a ser analizado");
        Double N = sc.nextDouble();

        if(N % 3 == 0 && N % 7 == 0){
            System.out.println("Divisivel por 3 e 7");
        }
        else if(N % 3 == 0 && N % 7 != 0){
            System.out.println("Divisivel por 3 e nao por 7");
        }
        else if(N % 3 != 0 && N % 7 == 0){
            System.out.println("Divisivel por 7 e nao por 3");
        }
     }
 }