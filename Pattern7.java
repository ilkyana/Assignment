package Practice.Assignments;

public class Pattern7 {
    public static void main(String[] arg){
        int n = 4 ;
        int k = 1 ;
        for(int row = 1 ; row<= n ; row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.print(k+" ");
                k++ ;
            }
            System.out.println();
        }
    }
    
}
