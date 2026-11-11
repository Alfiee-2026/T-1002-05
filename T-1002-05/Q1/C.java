package Q1;
import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] studentName = new String[100];
        for(int i = 0; i< studentName.length; i++){
            System.out.print("Enter student name" + (i+1) + ": ");
            studentName[i] = s.nextLine();
        }
        for(int i = 0; i< studentName.length; i++){
            System.out.println("Student name " + (i+1) + ": " + studentName[i]);
        }
    }
    
}
