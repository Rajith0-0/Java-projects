import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Principal (p): ");
        double p = sc.nextDouble();

        System.out.print("Enter Time (t in years): ");
        double t = sc.nextDouble();

        System.out.print("Enter Rate of Interest (r): ");
        double r = sc.nextDouble();

        
        double si = (p * t * r) / 100;

        
        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}
