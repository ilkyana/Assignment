package Practice.Assignments;

public class binTodeci {
    public static void main(String [] arg){
        convert(11010);
        
    }
    public static void convert(int number){
        int place = 0 ;
        int result = 0 ;
        while(number != 0){
            int rem = number % 2 ;
            result = result + rem *(int)( Math.pow(2, place));
            place = place+1 ;
            number = number/10 ;
            }
            System.out.println(result);

    }
    
}
