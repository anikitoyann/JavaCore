package chapter1;

public class ReposityTest {
    public static void main(String[] args) {

        Repository<String> stringRepository = new Repository<>();
        stringRepository.save("Ani");
        String strings = stringRepository.get(0);
        System.out.println(strings);
        Repository<Integer>integerRepository=new Repository<>();
        integerRepository.save(14);
        Integer integer=integerRepository.get(0);
        System.out.println(integer);
    }
}