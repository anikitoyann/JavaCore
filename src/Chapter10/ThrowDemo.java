package Chapter10;

public class ThrowDemo {
    static void demopoc(){
        try{
            throw new NullPointerException("дeмoнcтpaция");
        } catch (NullPointerException e){
            System.out.println("Иcключeниe перехвачено в теле "
                    + "метода demoproc ()");
            throw  e;
        }
    }

    public static void main(String[] args) {
        try{
            demopoc();
        } catch (NullPointerException e){
            System.out.println("Пoвтopный перехват: "+e);
        }
    }
}
