package chapter8.chapter4;

public class A {
    int i,j;
    A(int a,int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println(i+" "+j);
    }
}
class B extends A{
    int k;
    B(int a, int b, int c){
        super(a,b);
        k=c;
    }
    void show(String msg){
        System.out.println(msg+k);
    }
}
class Override{
    public static void main(String[] args) {
        B subob=new B(4,5,6);
        subob.show("This k");
        subob.show();
    }
}
