//Calculating the number 2+5=
import java.util.*;
public class Calculator {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number1 and Operator then number2 Ex(2 + 5): ");
    int num1= sc.nextInt() ;
    char op = sc.next().charAt(0);
    int num2= sc.nextInt() ;
    
        switch(op){
        case '+' -> System.out.print(num1+num2);
        case '-' -> System.out.print(num1-num2);
    
        case '*' -> System.out.print(num1*num2);
        
        case '/' -> System.out.print(num1/num2);
         default -> System.out.print("Invalid operator");
        
        
    }
}
}