package chapter12.chaper1;

public enum Apple {
    JONATAN(10),GOLDENDEL(5),REDDEL(12),WINESAP(7),CORTLAND(8);

  private int price;
    Apple(int p){
        price=p;
    }
    int getPrice(){
        return price;
    }

}
