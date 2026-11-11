package Q4;

public class R {
    public static void main(String[] args){
        String[] words = {"Alfie", "Is", "the", "Best"};
        int countthe = 0;
        for(int i = 0; i < words.length; i++){
            if("the".equals(words[i])){
                countthe++;
            }

        }
        System.out.println(countthe);
    }
    
}
