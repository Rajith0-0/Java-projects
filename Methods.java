import java.util.Scanner;

public class Methods {
    
    
    static void printPrimeDigit(int n) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {

            }
           
            n /= 10;
        }
        
        if (count == 0) {
            System.out.println("It is not a prime digit");
        } else {
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPrimeDigit(0);
    }
}
