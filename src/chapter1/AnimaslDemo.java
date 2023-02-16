package chapter1;

public class AnimaslDemo {
    public static void main(String[] args) {
       Animal animal1=new Animal(1);
       Animal animal2=new Animal(1);
        System.out.println(animal1.equals(animal2));
    }

}


class Animal{
    private int id;
    Animal(int id){
        this.id=id;

    }

public boolean equals(Object obj){
        Animal atheranimal=(Animal)obj;
        return this.id==atheranimal.id;

    }
}



