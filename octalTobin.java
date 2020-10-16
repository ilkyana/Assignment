package Practice.Assignments;

public class octalTobin {
    public static void main(String[] arg){
        System.out.println(octaltobin(145));

    }
    public static int octaltodeci(int number){
        int result = 0 ;
        int place = 0 ;
        while(number != 0){
            int rem = number % 10 ;
            result = result + rem*(int)(Math.pow(8, place));
            place = place + 1 ;
            number = number / 10 ;
        }
        return result ;
    }
    public static int decitobinary(int number1){    
        int place = 1 ;
        int result = 0;
        while(number1 != 0){
            int rem = number1 % 2 ;
            result = result + rem * place ;
            place = place * 10 ;
            number1 = number1 / 2 ;
        
        }
        return result ;
    }
    public static int octaltobin(int octal){
        int firstly = octaltodeci(octal);
        int second = decitobinary(firstly);
        return second ;
    }
    
}
