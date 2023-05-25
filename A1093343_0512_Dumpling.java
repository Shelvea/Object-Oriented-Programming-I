import java.util.Random;
import java.util.*;

class SoldDumpling{
    Random rand = new Random();
    int PorkAmount = 300, BeefAmount = 200, VegetableAmount = 100;
    int numberOfDumplings, typeOfDumplings, min = 10, max = 50, min2 = 1, max2 = 3;
    int PorkSoldOut = 0, BeefSoldOut = 0, VegetableSoldOut = 0, AllSoldOut = 0;

    synchronized void orderDumpling(int amountOfCustomers){//synchronized method

    while(AllSoldOut==0)
    {
        for(int i=1; i<=amountOfCustomers; i++)
        {

            typeOfDumplings = rand.nextInt((max2 - min2) + 1) + min2;//choose type of dumplings by random number for each customer
            
            System.out.println("\nCustomer: " + i + " , current Thread name: " + Thread.currentThread().getName());
            System.out.println("waiting for the waiter...\n");

            try{
                Thread.sleep(3000);//waiting the shop waiter for 3 seconds
            }
            catch(Exception e)
            {
                System.out.println("Found Exception: " + e);
            }

            if(typeOfDumplings==1)//if pork dumpling ordered
            {
                if(PorkSoldOut==1)//if pork dumpling have sold out
                {
                    System.out.println("Pork Dumpling is sold out...");
                    continue;
                }
                System.out.println("order pork dumpling...");
                numberOfDumplings = rand.nextInt((max - min) + 1) + min;//set number of dumplings ordered between 10 and 50 by random number
                System.out.println("number of pork dumpling ordered: " + numberOfDumplings);
                if(PorkAmount>=numberOfDumplings)
                {
                    PorkAmount -= numberOfDumplings;
                    System.out.println("Pork remainder after sold: " + PorkAmount);
                }
                else if(PorkAmount<10)//if pork dumpling is less than ten
                {
                    System.out.println("Pork Dumpling is sold out...");
                    PorkSoldOut = 1;
                }
                else if(PorkAmount<numberOfDumplings)//if number of ordered dumpling is not enough
                {
                    System.out.println("Pork dumpling is not enough");
                }
            }
            else if(typeOfDumplings==2)//if beef dumpling ordered
            {
                if(BeefSoldOut==1)//if beef dumpling have sold out
                {
                    System.out.println("Beef Dumpling is sold out...");
                    continue;
                }
                System.out.println("order beef dumpling...");
                numberOfDumplings = rand.nextInt((max - min) + 1) + min;//set number of dumplings ordered between 10 and 50 by random number
                System.out.println("number of beef dumpling ordered: " + numberOfDumplings);
                if(BeefAmount>=numberOfDumplings)
                {
                    BeefAmount -= numberOfDumplings;
                    System.out.println("Beef remainder after sold: " + BeefAmount);
                }
                else if(BeefAmount<10)//if beef dumpling is less than ten
                {
                    System.out.println("Beef Dumpling is sold out...");
                    BeefSoldOut = 1;
                }
                else if(BeefAmount<numberOfDumplings)//if number of ordered dumpling is not enough
                {
                    System.out.println("Beef dumpling is not enough");
                }
            }
            else if(typeOfDumplings==3)//if vegetable dumpling ordered
            {
                if(VegetableSoldOut==1)//if vegetable dumpling have sold out
                {
                    System.out.println("Vegetable Dumpling is sold out...");
                    continue;
                }
                System.out.println("order vegetable dumpling...");
                numberOfDumplings = rand.nextInt((max - min) + 1) + min;//set number of dumplings ordered between 10 and 50 by random number
                System.out.println("number of vegetable dumpling ordered: " + numberOfDumplings);
                if(VegetableAmount>=numberOfDumplings)
                {
                    VegetableAmount -= numberOfDumplings;
                    System.out.println("Vegetable remainder after sold: " + VegetableAmount);
                }
                else if(VegetableAmount<10)//if vegetable dumpling is less than ten
                {
                    System.out.println("Vegetable Dumpling is sold out...");
                    VegetableSoldOut = 1;
                }
                else if(VegetableAmount<numberOfDumplings)//if number of ordered dumpling is not enough
                {
                    System.out.println("Vegetable dumpling is not enough");
                }
            }
                if(PorkSoldOut==1 && BeefSoldOut==1 && VegetableSoldOut==1)//if all dumplings have already sold out
                {
                    System.out.println("\nAll dumplings have sold out!");
                    System.out.println("Dumpling Shop closed.\n");
                    AllSoldOut = 1;
                    break;
                }
        }   
            
            try{//while waiting switch to other thread
                wait(5000);
            }catch(Exception e)
            {
                System.out.println("Found Exception: " + e);
            }
    }
    
    System.exit(0);//if all dumplings have already sold out then exit from the program    
        
}
}


class Thread1 extends Thread{ //extend thread class
    SoldDumpling D;    
    int nCustomer;

    Thread1(SoldDumpling object, int customer)//constructor
    {
        this.D = object;
        this.nCustomer = customer;
    }

    public void run(){
        D.orderDumpling(nCustomer);        
    }

}



public class A1093343_0512_Dumpling {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        int numberOfCustomers;

        final SoldDumpling obj = new SoldDumpling();//only one object

        
            System.out.println("input number of customers who visit shop at the same time: ");
            numberOfCustomers = keyboard.nextInt();
            
            Thread1 thread1 = new Thread1(obj,numberOfCustomers);            
            Thread1 thread2 = new Thread1(obj,numberOfCustomers);
            Thread1 thread3 = new Thread1(obj,numberOfCustomers);    
            Thread1 thread4 = new Thread1(obj,numberOfCustomers);    
            Thread1 thread5 = new Thread1(obj,numberOfCustomers);    
            //executing multiple threads simultaneously                         
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            
            keyboard.close();        
    }        
}
