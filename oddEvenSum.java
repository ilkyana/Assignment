package Practice.Assignments;

public class oddEvenSum {
    public static void main (String[] arg){
        int n = 12345;
        reverse(n);
        int odd = 0 ;
        int even = 0 ;
        int count = 1 ;
        while(n != 0){
            int rem = n%10 ;
            if(count %2 != 0){
                odd = odd + rem ;
            } else if(count % 2 == 0){
                even = even + rem ;
            }
            count++ ;
            n = n/10 ;
        }
        System.out.println("odd sum is " + odd);
        System.out.println("Even sum is " + even);
        
        
        
    }
    public static int reverse(int n){
        int rev = 0 ;
        while(n != 0){
            rev = rev * 10 + n%10 ;
            n = n/10 ;
        }
        return rev ;
    }
    
}
