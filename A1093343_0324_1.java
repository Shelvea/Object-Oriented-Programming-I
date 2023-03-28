import java.util.*;

class Bird
{
    String name,color;
    int weight, speed, age;
    double height;

    void show()
    {
        System.out.printf("Name:\t%s\nWeight:\t%d\nHeight:\t%.2f\nSpeed:\t%d\nColor:\t%s\nAge:\t%d\n",name,weight,height,speed,color,age);
    }

    double distance(int x, double y)
    {        
        return x*y*speed;
    }

    double distance(int x)
    {
        return x*(double)speed;
    }

}

public class A1093343_0324_1
{
    public static void main(String[] args)
    {
        Bird[] myBird = new Bird[4];
        Scanner keyboard = new Scanner(System.in);
        
        int[] time = new int[4];
        double[] acceleration = new double[4];

        
        for(int i=0; i<myBird.length; i++)
        {
            myBird[i] = new Bird();

            System.out.printf("please input bird %d name, height(double), weight, speed, color, age respectively: \n",i+1);
            myBird[i].name = keyboard.next();
            myBird[i].height = keyboard.nextDouble();
            myBird[i].weight = keyboard.nextInt();
            myBird[i].speed = keyboard.nextInt();
            myBird[i].color = keyboard.next();
            myBird[i].age = keyboard.nextInt();
            
            System.out.println("please input time in minute(x) and acceleration(y)(double) respectively: ");
            time[i] = keyboard.nextInt();
            acceleration[i] = keyboard.nextDouble();
            
            System.out.println();

        }

        for(int n=0; n<myBird.length; n++)
        {
            myBird[n].show();
            System.out.println("First Run Distance(x,y): " + myBird[n].distance(time[n],acceleration[n]));
            System.out.println("Second Run Distance(x): " + myBird[n].distance(time[n]));
            System.out.println();
        }
            keyboard.close();
    }
}