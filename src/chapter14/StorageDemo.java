package chapter14;

public class StorageDemo {
    public static void main(String[] args) {
        Storage<Student> studentStorage = new Storage<>();
        Storage<Student> studentStorage1 = new Storage<>();
        Storage<Book> bookStorage = new Storage<>();
        Storage<String> stringStorage = new Storage<>();
        Storage<Integer> numbers = new Storage<>();
        numbers.add(5);
        studentStorage1 = studentStorage;
        Student student = new Student("poxos", "pogosyan", 25);
        Book book = new Book("Ahhh", "descripition", 125000);
        studentStorage.add(student);
        bookStorage.add(book);

        Student byIndex = studentStorage.getByIndex(0);
        System.out.println(byIndex.getName());
        Book byIndexx = bookStorage.getByIndex(0);
        System.out.println(byIndexx.getTitle());
        bookStorage.print();
        studentStorage.print();
        stringStorage.add("kkkk");
        String Byindex = stringStorage.getByIndex(0);
        System.out.println(Byindex.length());
    }
}
