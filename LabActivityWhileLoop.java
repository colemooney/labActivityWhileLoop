import java.util.Scanner;

public class LabActivityWhileLoop
{
   public static void main(String[] arg)
   {
        //CONSTANTS
        final int CORRECT_PASSCODE = 1234;
        
        //VARIABLES
        int passcodeInput;
       
        //Initialize values
        int invalidLoginAttempts = 0;
        
        //ARRAYS
        
        //SOLUTION
        CS170.information("Cole Mooney", "Lab Activity", "While Loop");
        
        //OBJECTS
        Scanner keyboardInput = new Scanner(System.in);
        
      
        //KEYBOARD INPUT
        System.out.println("Input Passcode");
        passcodeInput = keyboardInput.nextInt();
        
        //While Loop
        while (passcodeInput != CORRECT_PASSCODE)
        {
            invalidLoginAttempts++;
            System.out.println("Wrong Passcode try again!");
            passcodeInput = keyboardInput.nextInt();
        }
        
        //Login Statistics
        System.out.println("LOGIN SUCCESSFUL: ");
        System.out.println("Number of Invalid Login Attempts: " + invalidLoginAttempts);
        
        keyboardInput.close();
        
    }
}