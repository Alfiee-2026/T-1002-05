package Q1;

public class E {
    public static void main(String[] args){
        int[][] arr2D = {
            {6, 9},
            {2, 5},
            {4, 6}
        };
        System.out.println("The 2D array is: ");
        for(int i = 0; i < arr2D.length; i++){  
            for(int j = 0; j < arr2D[i].length; j++){
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
