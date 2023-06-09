import java.io.*;

public class A1093343_0526_ReadObject {
public static void main(String[] args) throws IOException, ClassNotFoundException{

        System.out.println("The name of the student grade file to read:");
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine(); 

        int counter=0;
        double Esum=0;
        double Msum=0;
        double Jsum=0;
        A1093343_0526_Student ss = new A1093343_0526_Student();

        System.out.println("Name\tEnglish\tMath\tJava\tAverage");
        System.out.println("-----------------------------------------");

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            while (true){
                ss = (A1093343_0526_Student) ois.readObject();
                counter++;

                Esum += ss.getEnglishScore();
                Msum += ss.getMathScore();
                Jsum += ss.getJavaScore();

                System.out.println(ss.getName()+'\t'+ss.getEnglishScore()+'\t'+ss.getMathScore()+'\t'+ss.getJavaScore()+'\t'+ss.getAverage());
            }
        }
        catch(EOFException e){
            System.out.println("\nhave from file " + filename + " read " + counter + " student's data");
            System.out.println("\naverage of all english score:" + (Esum/counter));
            System.out.println("average of all math score:" + (Msum/counter));
            System.out.println("average of all java score:" + (Jsum/counter));
        }
    }
}    

