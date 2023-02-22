package homeworks.medialCenter.model;

import homeworks.medialCenter.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Patient {
    private String id;
    private String name;
    private String surname;
    private Doctor doctor;
    private Date registerDateTime;

    public Patient(String id, String name, String surname, Doctor doctor, Date registerDateTime) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public Patient() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;

        Patient patient = (Patient) o;

        if (!Objects.equals(id, patient.id)) return false;
        if (!Objects.equals(name, patient.name)) return false;
        if (!Objects.equals(surname, patient.surname)) return false;
        if (!Objects.equals(doctor, patient.doctor)) return false;
        return Objects.equals(registerDateTime, patient.registerDateTime);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (doctor != null ? doctor.hashCode() : 0);
        result = 31 * result + (registerDateTime != null ? registerDateTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", doctor=" + doctor +
                ", registerDateTime=" + DateUtil.dateToString(registerDateTime) +
                '}';
    }
}
