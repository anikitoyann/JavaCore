package homeworks.medialCenter.storage;

import homeworks.medialCenter.model.Doctor;
import homeworks.medialCenter.model.Patient;
import homeworks.medialCenter.model.Person;

import java.util.Date;

public class PersonStorage {

    private Person[] persons = new Person[10];
    private int size = 0;
    Person person1 = new Patient();
    Person person2 = new Doctor();


    public void add(Person value) {
        if (size == persons.length) {
            extend();
        }

        persons[size++] = value;
    }

    private void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, size);
        persons = tmp;
    }


    public void printDoctor() {

        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            System.out.println(persons[i] + " ");
        }

    }


    public Person getid(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person.getId().equals(id)) {
                return persons[i];
            }
        }
        return null;
    }


    public void searchDoctor(String profession) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Person) {
                Doctor doctor1 = (Doctor) persons[i];
                if (doctor1.getProfession().equals(profession)) {
                    System.out.println(doctor1);
                } else System.out.println("doctor" + profession + "does exists");
            }
        }
    }

    public void deleteDoctor(String id) {
        for (int i = 0; i < size; i++) {

            Doctor doctor1 = (Doctor) persons[i];
            persons[i] = persons[i + 1];
        }
        size--;
    }

    public int Getsize() {
        return size;
    }


}


