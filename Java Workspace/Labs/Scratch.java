import java.util.*;

public class Scratch {
    public static void SumDigits(){
        //Write a java program to read an integer between 0 and 999 and adds all the digits in the integer
        //Hint: Use the % op to extract digits and / op to remove extracted digit
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter your numbers! (Maximum of three): ");
        
        int input = terminal.nextInt();
        String nums = Integer.toString(input);
        int sum = 0;
        
        if (nums.length() > 3){
            System.out.println("Num too long :(");
        }
        else if (nums.length() <= 3){
            for (int i = 0; i < nums.length(); i++){
                int digit = nums.charAt(i) - '0';
                sum += digit;
            }
        
            System.out.println(sum);
        }

        terminal.close();
    }
    

    
    public static void main(String[] args) {
        SumDigits();
    }
}