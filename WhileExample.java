//Program that reads the int from user between 1 & 10;
import java.util.*;
public class WhileExample {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number between 1 to 10: ");
    int n = sc.nextInt();
    
    while(n<1 || n>10){
        System.out.print(n+" is not a number between 1 to 10, try again: ");
        n=sc.nextInt();
        }
    System.out.print(n+" is between 1 to 10, Thanks!");
    }
}
