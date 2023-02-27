import java.util.Scanner;

public class A1093343_0224_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input an integer number: ");

        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.printf("%d is even number", number);
        } else {
            System.out.printf("%d is odd number", number);
        }
        input.close();
    }
}