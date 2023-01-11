package chapter6;

public class Boxx {
    double width;
    double height;
    double depth;
    double volume() {
        return width * depth * height;
    }
    void setDim (int w,int h,int d){
        width=w;
        height=h;
        depth=d;
    }
}
