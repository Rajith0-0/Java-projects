import java.util.Scanner;

public class Weathercal {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

if (a <= 0 ) {
    System.out.println(a+" is freezing weather");
} 
else if (a > 0 && a <= 10) {
    System.out.println(a+"is very cold we   ather");
}
 else if (a > 10 && a <= 20) {
    System.out.println(a+" is cold weather");
}
 else if(a > 20 && a <= 30) {
    System.out.println(a+"is a normal weather");
}
 else if ( a > 30 && a <= 40) {
    System.out.println(a+"is hot weather");
}
 else  {
    System.out.println(" very hot temparature");
}




}
}
   
    

