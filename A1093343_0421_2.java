import java.util.*;

public class A1093343_0421_2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("input date in YYYY/MM/DD or MM/DD/YYYY format: ");
        System.out.println("example: 1998/02/01 or 12/08/2000");
        String date = keyboard.next();

        if(date.matches("((19|2[0-9])[0-9]{2})/(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])") == true || (date.matches("(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])/((19|2[0-9])[0-9]{2})")) == true)
        {
            System.out.println("date match");
        }
        else
        {
            System.out.println("date don't match");
        }

        keyboard.close();    
    }    
}
