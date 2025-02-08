import java.util.*;

public class printfPractice{
    public static void main(String[] args) {
    
		Scanner terminal = new Scanner(System.in);
		
		int num1 = terminal.nextInt(); // 2000
		int num2 = terminal.nextInt(); // 100
        int num3 = terminal.nextInt(); // 200
		
		int firstResult = ((num1 > num2 && num1 > num3) ? num2 : num1);
        int secondResult = ((num1 > num2 && num1 < num3) ? num3 : num2);
        int thirdResult = ((num1 < num2 && num1 < num3) ? num1 : num2);
        
		
		System.out.println(firstResult + " " + secondResult + " " + thirdResult);
	}
}
