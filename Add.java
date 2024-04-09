// how to add two numbers

import java.util.Scanner;
import java.math.BigInteger;
/* 
public class Add {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first  number");
        int x=sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        int z = x+y;
        System.out.println(z);
    }
}
*/

/**
 * Add
 */
public class Add {
    public static void main(String[] args) {
        String num1 , num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first large number");
        num1 = sc.nextLine();
        System.out.println("Enter the second large number");
        num2 = sc.nextLine();
        BigInteger first = new BigInteger(num1);
        BigInteger second = new BigInteger(num2);
        BigInteger sum;
        sum = first.add(second);
        System.out.println("result of addition =" +sum);
    }
    
}