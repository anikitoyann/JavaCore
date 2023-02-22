package homeworks.medialCenter.storage;


import homeworks.medialCenter.model.Doctor;
import homeworks.medialCenter.model.Patient;
import homeworks.medialCenter.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import static homeworks.employee.util.DateUtil.sdf;
import static homeworks.employee.util.DateUtil.stringToDate;

public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size = 0;


    public void add(Patient patient) {
        if (size == patients.length) {
            extend();
        }

        patients[size++] = patient;
    }

    private void extend() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, size);
        patients = tmp;
    }


    public void print(Date date) {
        for (int i = 0; i < size; i++) {
            Patient patient = patients[i];
            if (patient.getRegisterDateTime().equals(date)) {
                System.out.println(patient);
            } else {
                System.out.println("There are no registered users today");

            }
        }
    }


    public Patient searchpatinetID(String id) {
        for (int i = 0; i < size; i++) {
            Patient patient = patients[i];
            if (patient.getId().equals(id)) {
                return patient;
            }
        }
        return null;
    }

    public void searchPatients(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Patient patient = patients[i];
            if (patient.getDoctor().equals(doctor)) {
                System.out.println(patient);
            }
        }
    }
}
