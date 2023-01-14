package chapter6.chapter;

public class Box {
    double width;
    double height;
    double depth;
    Box(){
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        width=10;
        height=10;
        depth=10;
    }
    double volume(){
        return width*height*depth;
    }

}
