package homeworks.medialCenter.storage;

import homeworks.medialCenter.model.Doctor;

public class DoctorStorage {

    private Doctor[] doctors = new Doctor[10];
    private int size = 0;


    public void add(Doctor value) {
        if (size == doctors.length) {
            extend();
        }

        doctors[size++] = value;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, size);
        doctors = tmp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i] + " ");
        }

    }

    public Doctor getid(String id) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = doctors[i];
            if (doctor.getId().equals(id)) {
                return doctor;
            }
        }
        return null;
    }

    public void searchDoctor(String profession) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = doctors[i];
            if (doctor.getProfession().equals(profession)) {
                System.out.println(doctor);
            } else System.out.println("doctor" + profession + "does exists");
        }
    }

    public void deleteDoctor(String id) {
        for (int i = 0; i < size; i++) {
            Doctor doctor = doctors[i];
            doctors[i] = doctors[i + 1];
        }
        size--;
    }

    public int Getsize() {
        return size;
    }

}


