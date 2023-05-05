import java.util.*;

public class A1093343_0421_1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("input EMAIL only in lowercase alphabet letter minimum 5 characters: ");
        System.out.println("example: xxx12@gmail.com");
        String email = keyboard.next();

        if(!email.matches("[a-z0-9]{5,15}[@]{1}[a-z]{3,8}(.){1}[a-z]{3,8}"))
        {
            System.out.println("email don't match");
        }
        else
        {
            System.out.println("email match");
        }
        
        keyboard.close();
    }
}