package chapter1;

public class BookStorage {
    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book value) {
        if (size == array.length - 1) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {
        Book[] newarray = new Book[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        array = newarray;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }

    }


    public void search(String keyword) {
        boolean found=false;
        for(int i=0;i<size;i++){
            Book book=array[i];
            if(book.getTitle().contains(keyword)) {
                found=true;
                System.out.println(book);
            }
            if(!found){
                System.out.println("book with"+keyword+"exsist");
            }
        }
    }
}
