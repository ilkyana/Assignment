package Practice.Assignments;

public class Pattern8 {
    public static void main(String[] arg){
        int n = 5 ;
       
        for(int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= row ; col++){
                if(col == 1 || col == row){
                    System.out.print(row +" ");
                } else{ 
                    System.out.print("0 ");
                }
             }
             System.out.println();
        }
    }
}
