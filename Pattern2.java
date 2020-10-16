package Practice.Assignments;

public class Pattern2 {
    public static void main(String[] arg){
        int n = 5 ;
        int row = 1 ;
        int k = 1 ;
        while(k <= n){
            int space = 1 ;
            while(space <= n - row ){
                System.out.print(" ");
                space ++ ;
            }
            int col = 1 ;
            while(col <= 2 * row -1){
                System.out.print("*");
                col ++ ;
            }
            if(k < n/2 + 1 ){
                row++ ;
            } else {
                row -- ;
            } 
            System.out.println();
            k = k+1 ;
        }

    }

    
}
