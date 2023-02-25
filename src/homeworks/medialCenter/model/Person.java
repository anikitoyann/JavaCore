package homeworks.medialCenter.model;

import java.util.Objects;

public abstract class Person {
    private String id;
    private String name;
    private String surname;
    private String phone;


    public  Person(String id, String name, String surname, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;

    }


    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPhone(String phone) {
        this.phone = phone;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person persen = (Person) o;

        if (!Objects.equals(name, persen.name)) return false;
        if (!Objects.equals(surname, persen.surname)) return false;
        if (!Objects.equals(phone, persen.phone)) return false;
        return Objects.equals(id, persen.id);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phone + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}


