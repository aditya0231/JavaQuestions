/*
lucky number 9173 is lucky 9+1=7+3
 */
import java.util.*;
public class LuckyNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int num = sc.nextInt();
        int a = num%10; //ABCD%10=D
        int b = (num/10)%10;//(ABCD/10)%10=C
        int c = (num/100)%10;//(ABCD/100)%10=B
        int d = (num/1000);//(ABCD/1000)=A
        
        if(a+b==c+d)
            System.out.print("Lucky number");
        
        else
            System.out.print("Not a lucky Number");
        
    }
    
}
