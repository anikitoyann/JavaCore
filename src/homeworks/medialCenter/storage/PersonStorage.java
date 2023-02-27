package homeworks.medialCenter.storage;

import homeworks.medialCenter.model.Doctor;
import homeworks.medialCenter.model.Patient;
import homeworks.medialCenter.model.Person;
import homeworks.medialCenter.model.Proffesion;
import homeworks.medialCenter.util.DateUtil;

import java.util.Date;

public class PersonStorage {

    private Person[] persons = new Person[10];
    private int size;

    public void add(Person person) {
        if (size == persons.length) {
            extend();
        }

        persons[size++] = person;
    }


    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (persons[i] instanceof Doctor) {
                System.out.println(person + " ");
            }
        }
    }

    public void printPatients() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (persons[i] instanceof Patient) {
                System.out.println(person + " ");
            }
        }


    }


    public void searchDoctorByProfession(Proffesion profession) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                Doctor doctor = (Doctor) persons[i];
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                } else {
                    System.out.println("doctor" + profession + "does exists");
                }
            }
        }
    }


    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor && person.getId().equals(id)) {
                deletePersonByIndex(i);
            }
        }
    }

    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor && person.getId().equals(id)) {
                return (Doctor) persons[i];
            }
        }
        return null;
    }

    public void searchPatientsDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (((Patient) person).getDoctor() != null && patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }}

    public void printTodayPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (DateUtil.isSameDay(today, patient.getRegisterDateTime())) {
                    System.out.println(patient);
                }
            }
        }
    }

    public boolean isDoctorAvailable(Date registerDateTime, Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (patient.getDoctor().equals(doctor) && patient.getRegisterDateTime().equals(registerDateTime))
                    return false;

            }
        }
        return true;
    }

    private void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, size);
        persons = tmp;
    }

    private void deletePersonByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;

    }


}


