import java.util.*;

class ValueException extends Exception{
    public ValueException(String message){
        super(message);
    }
}

public class A1093343_0505_7{

        static void checkNumber(int n1, int n2, int n3, int n4, int n5, int n6)throws ValueException 
        {
            if(n1 > 49|| n2 > 49|| n3 > 49 || n4 > 49 || n5 > 49 || n6 > 49)
            {
                throw new ValueException("number cannot be larger than 49!");
            }
            else if(n1 < 1 || n2 < 1 || n3 < 1 || n4 < 1 || n5 < 1 || n6 < 1)
            {
                throw new ValueException("number cannot smaller than 1!");
            }
            
        }

        static void checkWinner(int n1, int n2, int n3, int n4, int n5, int n6)
        {
            Random rand = new Random();
            int low = 1;
            int high = 50;
            int n = rand.nextInt(high-low)+low;
            
            if(n1 == n|| n2 == n|| n3 == n || n4 == n || n5 == n || n6 == n)
            {
                System.out.println("Congratulation! you win the lottery.");
                System.out.println("The current winning number is " + n);
            }
            else{
                System.out.println("Sorry you don't win the lottery!");
                System.out.println("The current winning number is " + n);
            }            
        }

    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        int n1,n2,n3,n4,n5,n6;
        
        System.out.println("input six integers between 1 and 49: ");
        n1 = keyboard.nextInt();
        n2 = keyboard.nextInt();
        n3 = keyboard.nextInt();
        n4 = keyboard.nextInt();
        n5 = keyboard.nextInt();
        n6 = keyboard.nextInt();
        
        try{
            checkNumber(n1, n2, n3, n4, n5, n6);
            checkWinner(n1, n2, n3, n4, n5, n6);
        }
        catch(ValueException e)
        {
            System.out.println("Found an Exception: "+ e);
        }        
        finally
        {
            System.out.println("end of program...");
        }

        keyboard.close();
    }
    
}
