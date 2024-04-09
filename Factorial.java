import java.util.Scanner;
import java.math.BigInteger;
class Factorial {
    public static void main(String[] args) {
        // PROGRAM 1
         
        int n , i , fact = 1;
        System.out.println("Enter an integer to calculate its factorial");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n<0) {
            System.out.println("Number should be non- negative");
            
        }
        else{
            for(i=1;i<=n;i++){
                fact = fact*i;
            }
            System.out.println("The Factorial of "+n+" is =" +fact);
        }
        /* 
        //PROGRAM 2 CALCULATE FACTORIAL FOR LARGE NO
        int n , c;
        BigInteger inc = new BigInteger("1");
        BigInteger fact = new BigInteger("1");
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer");
        n = input.nextInt();
        for(c=1;c<=n;c++){
            fact = fact.multiply(inc);
            inc = inc.add(BigInteger.ONE);
        }
        System.out.println(n+"! = " + fact);

*/
    }
}
