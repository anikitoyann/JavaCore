package chapter1;

import java.util.Objects;

public class Book {
   private String title;

   private String auther;
   private double price;
    public Book(String title, String auther, double price) {
        this.title = title;
        this.auther = auther;
        this.price = price;
    }

    public Book() {
    }

    public String getTitle() { 
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        if (Double.compare(book.price, price) != 0) return false;
        if (!Objects.equals(title, book.title)) return false;
        return Objects.equals(auther, book.auther);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = title != null ? title.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (auther != null ? auther.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", auther='" + auther + '\'' +
                ", price=" + price +
                '}';
    }
}
