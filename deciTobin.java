package Practice.Assignments;

public class deciTobin {
    public static void main(String[] arg){
        convert(26);

    }
    public static void convert(int number){
        int result = 0 ;
        int place = 1 ;
        while(number != 0){
            int rem = number % 2 ;
            result = result + rem*place ;
            number = number / 2 ;
            place = place*10 ;

        }
        System.out.println(result);
    }
    
}
