public class Pyramid {
    public static void main(String[] args) {
        int rows = 5; // You can change this number to change the height

        // Outer loop counts downwards from total rows to 1
        for (int i = rows; i >= 1; i--) {
            
            // First inner loop prints spaces (increases as i goes down)
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Second inner loop prints the stars based on the current value of i
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            // Moves the cursor to the next line after completing a row
            System.out.println();
        }
    }
}
