import java.io.*;

public class A1093343_0526_WriteObject {
    public static void main(String[] args)throws IOException
    {
        System.out.println("Please enter the name of the student grade file to be created: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine(); 
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename));

        String str = new String();
        int counter=0;

        do{
            counter++;

            System.out.print("input student name:");
            String name = br.readLine();

            System.out.print("input english score:");
            str = br.readLine();
            short e = Short.parseShort(str);

            System.out.print("input math score:");
            str = br.readLine();
            short m = Short.parseShort(str);

            System.out.print("input Java score:");
            str = br.readLine();
            short j = Short.parseShort(str);

            A1093343_0526_Student ss = new A1093343_0526_Student(name, e, m, j);

            os.writeObject(ss);

            System.out.print("do you want to enter another data(Y/N):");
            str = br.readLine();

        }while (str.equalsIgnoreCase("Y"));

        os.flush();
        os.close();

        System.out.println("\nhave written "+ counter + " student's data to " + filename + " file.");
    }
}

    
