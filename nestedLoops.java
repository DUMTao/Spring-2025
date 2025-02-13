import java.util.*;

public class nestedLoops {

    // Problem 1: Multiplication Table
    // Hint: Use two nested loops, one for rows and one for columns.
    public static void printMultiplicationTable(int size) {
        Scanner terminal = new Scanner(System.in);
        
        
        //Column loop, run until i is equal to size and increase
        for (int i = 0; i <= size; i++){
            //Row loop, run until j is equal to size and increase
            for (int j = 1; j <= size; j++){
                System.out.println("*");
            }
        
            System.out.println("-");
        }
    }

    // Problem 2: Pyramid Pattern
    // Hint: Use nested loops where the outer loop controls the number of rows and the inner loop controls the number of spaces and stars.
    public static void printPyramid(int rows) {
        // ...method implementation...
    }

    // Problem 3: Matrix Addition
    // Hint: Use nested loops to iterate through each element of the matrices.
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        // ...method implementation...
        return new int[0][0]; // placeholder return
    }

    //Main function
    public static void main(String[] args) {
        printMultiplicationTable(9);
    }
}