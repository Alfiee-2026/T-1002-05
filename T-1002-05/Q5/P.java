package Q5;

public class P {
    public static void main(String[] args){
        String[] sentence = {"I", "love", "programming", "very", "much"};

        for (int i = sentence.length - 1; i >= 0; i--) {
            for (int j = sentence[i].length() - 1; j >= 0; j--) {
            System.out.print(sentence[i].charAt(j));
        }
        System.out.print(" ");
    }
    System.out.println();
    }
}
