package Practice.Assignments;

public class Pattern9 {
    public static void main(String [] arg){
       
        int n = 5 ;
        for (int row = 0; row < n; row++)
        {
        	int num = 1;
            for (int col = 0; col <= row; col++)
            {
            	if(row ==0 || col ==0)
            		num = 1;
            	else
            		num = num * (row - col + 1)/ col;
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
    }
    
}
