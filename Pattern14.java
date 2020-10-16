package Practice.Assignments;

public class Pattern14 {
    public static void main(String[] arg){
    int n = 4;
    int k = 1;
    for(int row = 1 ; row <= 2*n-1 ; row++){
        
        int space =1 ;
        while(space <= n-k){
            System.out.print(" ");
            space++ ;
        }
        int p = k ;

        for(int col = 1 ; col <= 2*n-1 ; col++){
            if(p <= col/2){
                p++;
            } else{
                p--;
            }

            System.out.print(k);
        }
        if(k <= n){
            k++ ;
        } else{
            k-- ;
        }
    }
}   
}
