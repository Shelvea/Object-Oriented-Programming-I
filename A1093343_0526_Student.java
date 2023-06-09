import java.io.*;

public class A1093343_0526_Student implements Serializable{
    

    private String studentName;
    private short englishScore;
    private short mathScore;
    private short javaScore;

    public A1093343_0526_Student(String name, short english, short math, short java)
    {
        studentName = name;
        englishScore = english;
        mathScore = math;
        javaScore = java;
    }

    public A1093343_0526_Student()
    {

    }

    public String getName()
    {
        return studentName;
    }

    public short getEnglishScore()
    {
        return englishScore;
    }

    public short getMathScore()
    {
        return mathScore;
    }

    public short getJavaScore()
    {
        return javaScore;
    }

    public double getAverage()
    {
        return (englishScore + mathScore + javaScore) /3.0;
    }
}
