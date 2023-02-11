package chapter9;

public interface Callback {
    void callback(int param);
}
class Client implements Callback{
   public void callback(int p){
       System.out.println("metod callback()."+p);
   }
   void notefaceMeth(){
       System.out.println("B классах, реализующих интерфейсы, могут определяться и другие члены.");
   }
}
class Demo{
    public static void main(String[] args) {
        Callback c=new Client();
        c.callback(4);
    }
}