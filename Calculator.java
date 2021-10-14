import java.io.*;
import java.util.ArrayList; // import the ArrayList class
import java.util.Arrays;
import java.util.List;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class BasicCalculator {

    public static boolean checkValidity(ArrayList<Character> validOperators, char x){
        return validOperators.contains(x);
        }

    public static void main(String[] args)
    {
        double num1, num2;
  
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the numbers");
        
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
  
        System.out.println("Enter the operator (+,-,*,/,^)");
        ArrayList<Character> validOperators = new ArrayList<>(Arrays.asList('+', '-', '*', '/', '^'));

        char op = sc.next().charAt(0);
        double o = 0;
        
        boolean valid = checkValidity(validOperators,op);
        
        if(valid == false)
        {
            System.out.println("You enter wrong input");
            return;
        }
        
        
        
        switch (op) {
  
        case '+':
  
            o = num1 + num2;
  
            break;
  
        // case to subtract two numbers
        case '-':
  
            o = num1 - num2;
  
            break;
  
        // case to multiply two numbers
        case '*':
  
            o = num1 * num2;
  
            break;
  
        // case to divide two numbers
        case '/':
  
            o = num1 / num2;
  
            break;
  
        // case to power two numbers
        case '^':
  
            o = Math.pow(num1,num2);
 
            break;
  
        default:
            break;
        }
  
        System.out.print("The final result: ");
  
        // print the final result
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
    }
}
