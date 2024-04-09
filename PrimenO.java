import java.util.Scanner;

class PrimenO {
    public static void main(String[] args) {
        int div = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number limit so far as to find the prime number");
        int n = sc.nextInt();
        while (div != n) {
            if (div < n) {
                System.out.println("prime number");
            } else if (n % div == 0) {
                System.out.println("not prime");
            } else {
                div = div + 1;
            }
        }

    }
}