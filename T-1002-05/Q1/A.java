package Q1;
import java.util.Scanner;

public class A{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float[] arrFloat = new float[12];
        for(int i = 0; i < arrFloat.length; i++){
            System.out.print("Enter a float value: ");
            arrFloat[i] = scan.nextFloat();
        }
        System.out.println("The float values you entered are: ");
        for(int i = 0; i < arrFloat.length; i++){
            System.out.println(arrFloat[i]);
        }
    }
}