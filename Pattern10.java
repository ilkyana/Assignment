package Practice.Assignments;

public class Pattern10 {
    public static void main(String[] arg){
        int n = 4 ;
        int a = 0 ;
        int b = 1 ;
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= row ; col++){
                if(row == 1){
                    System.out.print(a + " ");
                } else if(row == 2 && col == 1){
                    System.out.print(b + " ");
                } else{
                    int c = a+b ;
                    a = b ;
                    b = c ;
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
    }
    
}
