package Practice.Assignments;

public class deciTooctal {
    public static void main(String[] arg){
        convert(81);

    }
    public static void convert(int number){
        int result = 0 ;
        int place = 1 ;
        while(number != 0){
            int rem = number % 8 ;
            result = result + rem*place ;
            place = place * 10 ;
            number = number / 8 ;
        }
        System.out.println(result);
        
    }
    
}
