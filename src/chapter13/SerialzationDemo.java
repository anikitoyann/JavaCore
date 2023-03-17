package chapter13;

import java.io.*;

public class SerialzationDemo {
    private  static final String FILE_PATH="C:\\Users\\User\\IdeaProjects\\Java Core\\src\\chapter13\\fileExample\\ioExample\\file\\Example.txt";

    public static void main(String[] args) {
        Student student=new Student("poxos","poxosyan",12);
        try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(FILE_PATH))){
            objectOutputStream.writeObject(student);
        }catch (IOException e){
            e.printStackTrace();
        }
        try(ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(FILE_PATH))){
            Object o = objectInputStream.readObject();
            if(o instanceof Student){
           Student student1=(Student) o;
            System.out.println(student1);}
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
