import java.util.Scanner;

public class A1093343_0224_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of temperature in celcius: ");
        int celcius = input.nextInt();
        double fahrenheit = (celcius * 1.8) + 32;
        System.out.println("The Fahrenheit is " + fahrenheit);
        input.close();
    }
}