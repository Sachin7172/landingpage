import java.util.Scanner;
public class FahtoCel {
    public static void main(String[] args) {
        float temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit");
        temp = sc.nextFloat();
        temp = (((temp-32)*5)/9);
        System.out.println(temp);

    }
    
}
