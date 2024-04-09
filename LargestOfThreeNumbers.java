
import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter three integers");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if (x>y && x>z) {
            System.out.println("First number is greater");
        }
        else if (y>x && y>z) {
            System.out.println("Second number is greater");            
        }
        else if(z>x && z>y){
            System.out.println("Third number is greater");
        }
        else{
            System.out.println("Enter numbers are not distinct");
        }
    }
}
