import java.util.*;

class Animal
{
    String name;
    int weight, speed;
    double height;
    
    public Animal()
    {

    }

    public Animal(String name, int weight, int speed, double height)
    {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.height = height; 
    }
    
    void show()
    {
        System.out.printf("\nName: %s\tHeight: %.1f meter\tWeight: %d kilogram\tSpeed: %d meter/minute\n",name,height,weight,speed);
    }

    double distance(int x, double y)
    {
        return x*y*speed;
    }

    double distance(int x)
    {
        return x*(double)speed;
    }

    static void showinfo()
    {
        System.out.printf("\nWelcome to Frozen System\n");
    }
}

class human extends Animal
{
    String gender;

    public human()
    {

    }

    public human(String s)
    {
        this.gender = s;
    }

    void show()
    {
        System.out.printf("Gender: %s\t",gender);
    }
}

class snow extends human
{
    String freezingSkill;
    
    public snow(String answer)
    {
        this.freezingSkill = answer;
    }

    void show()
    {
        System.out.printf("Freezing Skill: %s\n",freezingSkill);
    }

    
    double distance(int x, double y, int speed)
    {
        return x*y*speed*2;        
    }

    double distance(int x, int speed)
    {
        return x*(double)speed*2;
    }

}

public class A1093343_0331
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int Minute, queenMinute;
        double Acceleration, queenAcceleration;
        
        Animal AnimalObject = new Animal("Xuebao",52,100,1.1);
        human humanObject = new human("NO");
        snow snowObject = new snow("NO");         
        Animal.showinfo();
        AnimalObject.show();
        humanObject.show();
        snowObject.show();

        System.out.print("\nInput minute (int value): ");
        Minute = keyboard.nextInt();
        while(Minute<=0)
        {
            System.out.print("please reinput: ");
            Minute = keyboard.nextInt();
        }
        System.out.print("Input acceleration (double value): ");
        Acceleration = keyboard.nextDouble();
        while(Acceleration<=0)
        {
            System.out.print("please reinput: ");
            Acceleration = keyboard.nextDouble();
        }
        System.out.print("Input Snow Queen's minute (int value): ");        
        queenMinute = keyboard.nextInt();
        while(queenMinute<=0)
        {
            System.out.print("please reinput: ");
            queenMinute = keyboard.nextInt();
        }
        System.out.print("Input Snow Queen's acceleration (double value): ");
        queenAcceleration = keyboard.nextDouble();
        while(queenAcceleration<=0)
        {
            System.out.print("please reinput: ");
            queenAcceleration = keyboard.nextDouble();
        }
        
        System.out.printf("\nDistance(x,y): %.1f\t" , AnimalObject.distance(Minute, Acceleration));
        System.out.printf("Snow Queen Distance(x,y): %.1f\n" , snowObject.distance(queenMinute, queenAcceleration,AnimalObject.speed));
        System.out.printf("Distance(x): %.1f" , AnimalObject.distance(Minute));        
        System.out.printf("\tSnow Queen Distance(x): %.1f\n"  , snowObject.distance(queenMinute, AnimalObject.speed));        
    
        Animal AnimalObject1 = new Animal("Donkey",99,200,1.5);
        human humanObject1 = new human("NO");
        snow snowObject1 = new snow("NO");         
        
        AnimalObject1.show();
        humanObject1.show();
        snowObject1.show();

        System.out.print("\nInput minute (int value): ");
        Minute = keyboard.nextInt();
        while(Minute<=0)
        {
            System.out.print("Please reinput: ");
            Minute = keyboard.nextInt();
        }
        System.out.print("Input acceleration (double value): ");
        Acceleration = keyboard.nextDouble();
        while(Acceleration<=0)
        {
            System.out.print("Please reinput: ");
            Acceleration = keyboard.nextDouble();
        }
        System.out.print("Input Snow Queen's minute (int value): ");        
        queenMinute = keyboard.nextInt();
        while(queenMinute<=0)
        {
            System.out.print("Please reinput: ");
            queenMinute = keyboard.nextInt();
        }
        System.out.print("Input Snow Queen's acceleration (double value): ");
        queenAcceleration = keyboard.nextDouble();
        while(queenAcceleration<=0)
        {
            System.out.print("Please reinput: ");
            queenAcceleration = keyboard.nextDouble();
        }

        System.out.printf("\nDistance(x,y): %.1f\t" , AnimalObject1.distance(Minute, Acceleration));
        System.out.printf("Snow Queen Distance(x,y): %.1f\n" , snowObject1.distance(queenMinute, queenAcceleration,AnimalObject1.speed));
        System.out.printf("Distance(x): %.1f" , AnimalObject1.distance(Minute));        
        System.out.printf("\tSnow Queen Distance(x): %.1f\n"  , snowObject1.distance(queenMinute, AnimalObject1.speed));        
            
        Animal AnimalObject2 = new Animal("Acce",80,150,1.9);
        human humanObject2 = new human("MALE");
        snow snowObject2 = new snow("NO");         
        
        AnimalObject2.show();
        humanObject2.show();
        snowObject2.show();

        System.out.print("\nInput minute (int value): ");
        Minute = keyboard.nextInt();
        while(Minute<=0)
        {
            System.out.print("Please reinput: ");
            Minute = keyboard.nextInt();
        }
        System.out.print("Input acceleration (double value): ");
        Acceleration = keyboard.nextDouble();
        while(Acceleration<=0)
        {
            System.out.print("Please reinput: ");
            Acceleration = keyboard.nextDouble();
        }
        System.out.print("Input Snow Queen's minute (int value): ");        
        queenMinute = keyboard.nextInt();
        while(queenMinute<=0)
        {
            System.out.print("Please reinput: ");
            queenMinute = keyboard.nextInt();
        }
        System.out.print("Input Snow Queen's acceleration (double value): ");
        queenAcceleration = keyboard.nextDouble();
        while(queenAcceleration<=0)
        {
            System.out.print("Please reinput: ");
            queenAcceleration = keyboard.nextDouble();
        }
        
        System.out.printf("\nDistance(x,y): %.1f\t" , AnimalObject2.distance(Minute, Acceleration));
        System.out.printf("Snow Queen Distance(x,y): %.1f\n" , snowObject2.distance(queenMinute, queenAcceleration,AnimalObject2.speed));
        System.out.printf("Distance(x): %.1f" , AnimalObject2.distance(Minute));        
        System.out.printf("\tSnow Queen Distance(x): %.1f\n"  , snowObject2.distance(queenMinute, AnimalObject2.speed));        
        
    
        Animal AnimalObject3 = new Animal("Hans",78,130,1.8);
        human humanObject3 = new human("MALE");
        snow snowObject3 = new snow("NO");         
        
        AnimalObject3.show();
        humanObject3.show();
        snowObject3.show();

        System.out.print("\nInput minute (int value): ");
        Minute = keyboard.nextInt();
        while(Minute<=0)
        {
            System.out.print("Please reinput: ");
            Minute = keyboard.nextInt();
        }
        System.out.print("Input acceleration (double value): ");
        Acceleration = keyboard.nextDouble();
        while(Acceleration<=0)
        {
            System.out.print("Please reinput: ");
            Acceleration = keyboard.nextDouble();
        }
        System.out.print("Input Snow Queen's minute (int value): ");        
        queenMinute = keyboard.nextInt();
        while(queenMinute<=0)
        {
            System.out.print("Please reinput: ");
            queenMinute = keyboard.nextInt();
        }
        System.out.print("Input Snow Queen's acceleration (double value): ");
        queenAcceleration = keyboard.nextDouble();
        while(queenAcceleration<=0)
        {
            System.out.print("Please reinput: ");
            queenAcceleration = keyboard.nextDouble();
        }
        
        System.out.printf("\nDistance(x,y): %.1f\t" , AnimalObject3.distance(Minute, Acceleration));
        System.out.printf("Snow Queen Distance(x,y): %.1f\n" , snowObject3.distance(queenMinute, queenAcceleration,AnimalObject3.speed));
        System.out.printf("Distance(x): %.1f" , AnimalObject3.distance(Minute));        
        System.out.printf("\tSnow Queen Distance(x): %.1f\n"  , snowObject3.distance(queenMinute, AnimalObject3.speed));        
        
        Animal AnimalObject4 = new Animal("Anna",48,120,1.7);
        human humanObject4 = new human("FEMALE");
        snow snowObject4 = new snow("NO");         
        
        AnimalObject4.show();
        humanObject4.show();
        snowObject4.show();

        System.out.print("\nInput minute (int value): ");
        Minute = keyboard.nextInt();
        while(Minute<=0)
        {
            System.out.print("Please reinput: ");
            Minute = keyboard.nextInt();
        }
        System.out.print("Input acceleration (double value): ");
        Acceleration = keyboard.nextDouble();
        while(Acceleration<=0)
        {
            System.out.print("Please reinput: ");
            Acceleration = keyboard.nextDouble();
        }
        System.out.print("Input Snow Queen's minute (int value): ");        
        queenMinute = keyboard.nextInt();
        while(queenMinute<=0)
        {
            System.out.print("Please reinput: ");
            queenMinute = keyboard.nextInt();
        }
        System.out.print("Input Snow Queen's acceleration (double value): ");
        queenAcceleration = keyboard.nextDouble();
        while(queenAcceleration<=0)
        {
            System.out.print("Please reinput: ");
            queenAcceleration = keyboard.nextDouble();
        }

        System.out.printf("\nDistance(x,y): %.1f\t" , AnimalObject4.distance(Minute, Acceleration));
        System.out.printf("Snow Queen Distance(x,y): %.1f\n" , snowObject4.distance(queenMinute, queenAcceleration,AnimalObject4.speed));
        System.out.printf("Distance(x): %.1f" , AnimalObject4.distance(Minute));        
        System.out.printf("\tSnow Queen Distance(x): %.1f\n"  , snowObject4.distance(queenMinute, AnimalObject4.speed));        
    
    
        Animal AnimalObject5 = new Animal("Aisha",50,120,1.7);
        human humanObject5 = new human("FEMALE");
        snow snowObject5 = new snow("YES");         
        
        AnimalObject5.show();
        humanObject5.show();
        snowObject5.show();

        System.out.print("\nInput minute (int value): ");
        Minute = keyboard.nextInt();
        while(Minute<=0)
        {
            System.out.print("Please reinput: ");
            Minute = keyboard.nextInt();
        }
        System.out.print("Input acceleration (double value): ");
        Acceleration = keyboard.nextDouble();
        while(Acceleration<=0)
        {
            System.out.print("Please reinput: ");
            Acceleration = keyboard.nextDouble();
        }
        System.out.print("Input Snow Queen's minute (int value): ");        
        queenMinute = keyboard.nextInt();
        while(queenMinute<=0)
        {
            System.out.print("Please reinput: ");
            queenMinute = keyboard.nextInt();
        }
        System.out.print("Input Snow Queen's acceleration (double value): ");
        queenAcceleration = keyboard.nextDouble();
        while(queenAcceleration<=0)
        {
            System.out.print("Please reinput: ");
            queenAcceleration = keyboard.nextDouble();
        }

        System.out.printf("\nDistance(x,y): %.1f\t" , AnimalObject5.distance(Minute, Acceleration));
        System.out.printf("Snow Queen Distance(x,y): %.1f\n" , snowObject5.distance(queenMinute, queenAcceleration,AnimalObject5.speed));
        System.out.printf("Distance(x): %.1f" , AnimalObject5.distance(Minute));        
        System.out.printf("\tSnow Queen Distance(x): %.1f\n"  , snowObject5.distance(queenMinute, AnimalObject5.speed));        
            
        keyboard.close();
    }    
}
