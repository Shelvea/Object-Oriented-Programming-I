import java.util.*;

public class A1093343_0317_1 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int n,m;
        System.out.println("please input n and m respectively: ");
        n = keyboard.nextInt();
        m = keyboard.nextInt();

        int[][] array = new int[n][m];
        for(int i=0; i<array.length; i++)
        {
            for(int j=0; j<array[i].length; j++)
            {
                int multiple = i*j;
                System.out.printf("%d * %d = %d\n",i,j,i*j);
                array[i][j] = multiple;                  
            }
        } 

        System.out.println("read data from two-dimensional array with for-each loop:");
        for(int[] element: array)
        {
            for(int value: element)
            {
                
                System.out.println(value);
            }
        }
        

        keyboard.close();
    }
}