package Practice.Assignments;

public class prime {
    public static void main(String[] arg){
         int n1 = 7;
         print(n1);
        // boolean flag = false ;
        // for(int i = 2 ; i <= n1/2 ; i++){
        //     if(n1 % i == 0){
        //         flag = true ;
        //         break ;
        //     } 
        // }
        // if(flag == true){
        //     System.out.println("Not Prime");
        // } else{
        //     System.out.println("prime");
        // }
    }
    public static void print(int n){
        int temp ;

        for(int i = 2 ; i <= n ;i++ ){
            temp = 1 ;
            for(int j = 2 ; j<= i/2 ; j++){
                if(i % j == 0){
                    temp = 0 ;
                    break;
                }
            }
            if(temp == 1){
                System.out.println(i);
                
            }
    }
    
    }}
