import java.util.Scanner;

    public class AtividadeOnze{
         public static void main(String args[]){
            
        Scanner sc = new Scanner(System.in);

        System.out.println("insira o numero a ser analizado");
        Double N = sc.nextDouble();

        if(N > 9 || N < 0){
            System.out.println("O numero esta fora do escopo");
        }
        else if(N <= 9 || N >= 0){
            System.out.println("O numero esta dentro do escopo");
        }
     }
 }