public class StudentManagment {

    String name;
    int rollNo;
    String branch;

    StudentManagment(String name, int rollNo, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
    }

    public static void main(String[] args) {
        StudentManagment s1 = new StudentManagment("Rahul", 101, "CSE");

        StudentManagment s2 = new StudentManagment("Anjali", 102, "ECE");
        
        StudentManagment s3 = new StudentManagment("Rohit", 103, "MECH");

        StudentManagment s4 = new StudentManagment("Priya", 104, "CIVIL");
        
        StudentManagment s5 = new StudentManagment("Amit", 105, "EEE");
        
        s1.display();

        System.out.println();

        s2.display();

        System.out.println();

        s3.display();

        System.out.println();

        s4.display(); 

        System.out.println();
        
        s5.display();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}
