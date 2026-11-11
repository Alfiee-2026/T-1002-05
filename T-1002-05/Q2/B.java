package Q2;

public class B {
    public static void main(String[] args){
        int sum = 0;
        int[] num = new int[10];
        for(int k = 0; k < num.length; k++){
            num[k] = k + 1;
            sum += num[k];
        }
        System.out.println("The sum is: " + sum);
    }
}
