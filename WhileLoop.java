import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("input an integer");
            n = sc.nextInt();
            if (n != 0) {
                System.out.println("you entered " +n);
                continue;

            }
            else{
                break;
            }
        }
        
    }
}
