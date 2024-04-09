import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        //PROGRAM 1
       /*  boolean learning = true;
        if(learning){
            System.out.println("Java Programmer");
        }
        else{
            System.out.println("What are you doing here");
        }
        
        // PROGRAM 2
        int marksobtained,passingmarks;
        passingmarks = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input marks scored by you");
        marksobtained = sc.nextInt();
        if(marksobtained >= passingmarks){
            System.out.println("You passed the exam");
        }
        else{
            System.out.println("Unfortunately you failed to pass the exam");
        }

        */
        // PROGRAM 3 (NESTED IF ELSE)
        int marksobtained, passingmarks;
        char grade;
        passingmarks = 40;
        Scanner input = new Scanner(System.in);
        System.out.println("Input marks scored by you");
        marksobtained = input.nextInt();
        if(marksobtained >= passingmarks){
            if (marksobtained > 90) {
                grade = 'A';
            }
            else if (marksobtained > 75) {
                grade = 'B';
            }
            else if (marksobtained >60) {
                grade = 'C';
            }
            else
                grade = 'D';
            System.out.println("You passed the exams and your grade is " +grade);

        }
        else{
            grade = 'F';
            System.out.println("You failed and your grade is" +grade);
        }
    }
    
}
