//swapping two numbers without using third number
import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        System.out.println("X and Y before swapping"+ x + " " + y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("X and Y after swapping"+ x +" "+ y);

    }
}
