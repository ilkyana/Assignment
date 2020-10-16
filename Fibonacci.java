package Practice.Assignments;

public class Fibonacci {
    public static void main(String[] arg){
        int n = 9 ;
        print(n);

    }   
    public static int fib(int n){
        int a = 0 ;
        int b = 1 ;
        if(n == 0){
            return a ;
        }
        if(n == 1){
            return b ;
        }
        for(int i = 2 ; i <= n ; i++){
            int c = a + b ;
            a = b ;
            b = c ;
        }
        return b ;
    } 
    public static void print(int n){
        int a = 0 ;
        int b = 1 ;
        
        for(int i = 0 ; i<n ; i++){
            if(i == 0){
                System.out.println(a); 
    
             }
             else if(i == 1){
                 System.out.println(b);
                 
             } else{
            int c = a+b ;
          a = b ;
          b = c ;
          System.out.println(c);
             }
        }

    }
}
