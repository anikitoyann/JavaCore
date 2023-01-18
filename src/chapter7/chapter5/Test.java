package chapter7.chapter5;

public class Test {
    double a,b;
    Test(double i, double j){
        a=i;
        b=j;
    }
    void meth(Test o){
        o.a*=2;
        o.b/=2;
    }
}
