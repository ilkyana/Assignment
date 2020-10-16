package Practice.Assignments;

public class pattern3 {
    public static void main(String[] arg){
    //    int n = 5;
    //    int k = 1; 
    //    int row = 1;
    //    while(k <= n ){
    //        int space = 1 ;
    //        if(space < n - row ){
    //            System.out.print("*");
    //            space ++ ;
    //        }
    //        int col = 1 ;
    //        while(col <= n+2){
    //            if(col <= 2*row -1){
    //             System.out.print("A");
    //            } else{
    //                System.out.print("*");
    //            }
    //             col++ ;
    //        }
    //        if(k < n /2 +1 ){
    //            row ++ ;
    //        } else{
    //            row-- ;
    //        }
    //        k = k+1 ;
    //        System.out.println();
    //    } 
    int n = 5;
    int row = 1 ;
    int k = 1 ;
    while(k <= n){
        int space = 1 ;
        while(space <= n-row){
            System.out.print("A");
        } 
        System.out.print("*");
        int col = 1 ;
        while(col <= n+2){
            if(col < 2*row-1){
                System.out.print("A");
            } else{
                System.out.print("*");
            }
            col++ ;
        }
        if(k < n){
        row++;
        } else{
            row-- ;
        }
        k++ ;
    }
    }
    
}
