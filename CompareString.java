import java.util.Scanner;
public class CompareString {
    public static void main(String[] args) {
        String s1, s2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string");
        s1 = in.nextLine();
        System.out.println("Enter second string");
        s2 = in.nextLine();
        if (s1.compareTo(s2)>0) {
            System.out.println("First string is greater than second");
        
        }
        else if (s1.compareTo(s2)<0) {
            System.out.println("First string is less than second");
        }
        else{
            System.out.println("Both string are equals");
        }
    }  
}
