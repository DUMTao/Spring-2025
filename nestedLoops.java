import java.util.*;

public class nestedLoops {

    // Problem 1: Multiplication Table
    // Hint: Use two nested loops, one for rows and one for columns.
    public static void printMultiplicationTable(int size) {
        Scanner terminal = new Scanner(System.in);
        System.out.print("   ");

        //For numbers above
        for (int i = 1; i < 10; i++){
            System.out.printf("%4s", i);
        }
        System.out.println();

        String line = "-";
        System.out.println(line.repeat(40));
        
        //Column rows
        for (int columns = 1; columns <= size; columns++){
            while (columns != size + 1){
                System.out.print(columns);
                break;
            }
            
            String dividers = "|";
            System.out.printf("%2s", dividers);

            //Row rows
            for (int rows = 1; rows <= size; rows++){
                System.out.printf("%4d", columns * rows);
            }
            System.out.println();
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