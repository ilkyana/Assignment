package Practice.Assignments;

public class reverse {
    public static void main(String[] arg){
        int n = 12345 ;
        method(n);
    // int n1 = n ;
    // int n2 = n ;
    //     int count = 0 ;
    //      int sum = 0 ;
    //     while(n1 != 0){
    //         count = count +1 ;
    //         n1 = n1/10 ;
    //     }
        
    //     while(n2 != 0){
    //         int rem = n2 % 10 ;
    //         count-- ;
    //         sum = sum + rem * (int) Math.pow(10, count);
    //         n2= n2/10 ;
    //     }
    //     System.out.println(sum );
    }
    public static void method(int n){
        int rev = 0 ;
        while(n != 0){
            int rem = n % 10 ;
            rev = rev * 10 + rem ;
            n = n / 10 ;
        }
        System.out.println(rev);

    }
    
}
