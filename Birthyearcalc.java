import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read DOB
        System.out.print("Enter year of birth: ");
        int year = sc.nextInt();

        System.out.print("Enter month of birth: ");
        int month = sc.nextInt();

        System.out.print("Enter day of birth: ");
        int day = sc.nextInt();

        // Read specific date to calculate age on
        System.out.print("Enter current year: ");
        int cyear = sc.nextInt();

        System.out.print("Enter current month: ");
        int cmonth = sc.nextInt();

        System.out.print("Enter current day: ");
        int cday = sc.nextInt();

        // Create LocalDate objects
        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.of(cyear, cmonth, cday);

        // Calculate age
        Period age = Period.between(dob, currentDate);

        // Display result
        System.out.println("Age on " + currentDate + " is: " 
                           + age.getYears() + " years, " 
                           + age.getMonths() + " months, " 
                           + age.getDays() + " days.");

        sc.close();
    }
}
