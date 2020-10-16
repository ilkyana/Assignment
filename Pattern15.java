package Practice.Assignments;

public class Pattern15 {
    public static void main(String[] arg){
        int n = 7 ;
        int o = n; 
        
        
        for(int row = 1 ; row <= n; row++){
            
                int m = 1 ;
                while(m <= row){
                System.out.print(m+" " );
                m++ ;
                }
                
                int space = 1 ;
                while(space <= (2*o-1)-2){
                    System.out.print("  ");
                    space++ ;
                }
                
                int l = row;
                
                while(l >= 1){
                    if(l == n)
                    l= l-1 ;                    
                    System.out.print(l+" ");
                    l-- ;
                }
            
                 System.out.println();
                 o-- ;
    }

}
}
