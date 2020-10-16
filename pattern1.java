package Practice.Assignments;

public class pattern1 {
    public static void main(String[] arg){
        int n = 4 ;
        patt(n);
    }
    public static void patt(int n){
        for(int row = 1 ; row <= n ; row++){
            int space = 1 ;
            while(space <= n-row){
                System.out.print(" ");
                space ++ ;
            }
            int k = row -1 ;
            for(int col = 1 ; col <= 2*row -1 ; col++){
                if(col <= row){
                    k = k+1 ;
                    System.out.print(k);
                } else{
                    k = k -1 ;
                    System.out.print(k);
                }
            }
            System.out.println();
        }

    }
    
}
