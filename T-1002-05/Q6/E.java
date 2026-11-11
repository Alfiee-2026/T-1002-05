package Q6;
import java.util.Random;

public class E {
    public static void main(String[] args){
        Random num = new Random();
        int number = num.nextInt(256);
        int[] bit = new int[8];
        int temp = number;
        for(int i = 7; i>=0; i--){
            bit[i] = temp % 2;
            temp /= 2;
        }
        System.out.print("Decimal: " + number + "  Binary: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(bit[i]);
        }
        System.out.println();
    }
}
