import java.util.Scanner;

public class dorDeCabeca {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Insira o numero a ser analisado: ");
        int num = sc.nextInt();
        
            if (numeroPrimo(num)) {
            System.out.println(num + " é numero primo");
        } else {
            System.out.println(num + " não é numero primo");
        }
  }
   public static boolean numeroPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
