import java.util.Scanner;

public class Tierladder {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
    int Longside  = sc.nextInt();
    double weight = sc.nextDouble();
    char tier;
    if(Longside <= 20 && weight <= 2.0) tier = 'S';
    if(Longside <= 40 && weight <= 5.0) tier = 'M';
    if(Longside <= 60  && weight <= 10.0 )  tier = 'L';
    else tier = 'X';
    String zone, note;
    switch (tier) {
    case 'S' : 
      zone  = "Zone A";
      note  = "cubby shelf"; 
      break;

      case 'M' :
        zone = "Zone B";
        note = "standard locker";
        break;

        case 'L' : 
        zone = "Zone C";
        note = "tall locker"; 
        break;

        default : 
         zone = "Counter";
         note = "Manual Handling";
         break; }
        System.out.println("Tier %c -> %s (%s)%n , tier , zone, note"); 
    }
}
