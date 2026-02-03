import java.util.Scanner;

public class LizetteCalculator {
    public static void main(String[] args) {
         
    	Scanner input = new Scanner(System.in);
    
        System.out.print("Welcome to Lizette Modesto simple calculator." + "\n");
    
    	System.out.print("\n" + "Enter first number: ");
    	int firstNumber = input.nextInt();
    
    	System.out.print("\n" + "Enter second number: ");
        int secondNumber = input.nextInt();
    
    	int multipliedValue = firstNumber * secondNumber;
    
            System.out.print("\n" + "You entered " + firstNumber + " and " + secondNumber + ". The product of the two numbers is " + multipliedValue + ".");
    
    	input.close();
    }
}