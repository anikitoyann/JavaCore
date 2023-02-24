package homeworks.medialCenter;

import homeworks.medialCenter.model.Doctor;
import homeworks.medialCenter.model.Patient;
import homeworks.medialCenter.model.Person;
import homeworks.medialCenter.storage.PersonStorage;
import homeworks.medialCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import static homeworks.employee.util.DateUtil.sdf;

public class MedialCenterDemo implements Commands {
    Person personD = new Doctor();
    Person personP = new Patient();
    public static Scanner scanner = new Scanner(System.in);
    public static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    add_doctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorbyid();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorByid();
                    break;
                case ADD_PATIENT:
                    add_Patinet();
                    break;
                default:
                    System.out.println("Wrong index,Try again");
            }
        }
    }





    private static void add_Patinet() throws ParseException {
        if (personStorage.Getsize() == 0) {
            System.out.println("please add doctor");
            return;
        }
        personStorage.printDoctor();
        System.out.println("please choose doctorId");
        String doctorID = scanner.nextLine();
        Doctor doctorById = (Doctor) personStorage.getid(doctorID);
        if (doctorById != null) {
            System.out.println("please input id,name,surname,phoneNumber,doctor(id),registerDateTime");
            String patientSTr = scanner.nextLine();
            String[] patientStrData = patientSTr.split(",");
            String id = patientStrData[0];
            Patient patientId = (Patient) personStorage.getid(id);
            if (patientId == null) {
                Patient patient = new Patient(patientStrData[0], patientStrData[1], patientStrData[2], patientStrData[3], doctorById, DateUtil.stringToDate(patientStrData[5]));
                personStorage.add(patient);
                System.out.println("Saved");
            } else {
                System.out.println("patiend with" + id + "already exsist");
            }

        } else System.out.println("wrong doctor id,please agayin");
    }

    private static void changeDoctorByid() {
        personStorage.printDoctor();
        System.out.println("please choose doctorId");
        String doctorID = scanner.nextLine();
        {
            Person person = personStorage.getid(doctorID);
            if (person == null) {
                System.out.println("Wrong doctor id,Try agayin");
            } else {
                System.out.println("please input new name");
                String name = scanner.nextLine();
                person.setPhoneNumber(name);
                System.out.println("please input new surname");
                String surname = scanner.nextLine();
                person.setSurname(surname);
                System.out.println("please input new PhoneNumber");
                String phoneNumber = scanner.nextLine();
                person.setPhoneNumber(phoneNumber);
                System.out.println("please input new email");
                String email = scanner.nextLine();
                Doctor doctor = new Doctor();
                doctor.setEmail(email);
                System.out.println("please input new proffesion");
                String proffesion = scanner.nextLine();
                doctor.setProfession(proffesion);
                System.out.println("changed new data");
            }


        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("please input proffesion");
        String profession = scanner.nextLine();
        personStorage.searchDoctor(profession);
        System.out.println("search result found");
    }

    private static void deleteDoctorbyid() {
        personStorage.printDoctor();
        System.out.println("please choose doctorId");
        String doctorID = scanner.nextLine();
        {
            Doctor doctor = (Doctor) personStorage.getid(doctorID);
            if (doctor == null) {
                System.out.println("Wrong doctor id,Try agayin");
            } else {
                personStorage.deleteDoctor(doctorID);
                System.out.println("doctor deleted!!");
            }
        }
    }

    private static void add_doctor() {
        System.out.println("please input id,name,surname,email,phoneNumber,professia");
        String doctorSTr = scanner.nextLine();
        String[] doctorStrData = doctorSTr.split(",");
        String id = doctorStrData[0];
        Doctor doctorid = (Doctor) personStorage.getid(id);
        if (doctorid == null) {
            Doctor doctor = new Doctor(doctorStrData[0], doctorStrData[1], doctorStrData[2], doctorStrData[3], doctorStrData[4], doctorStrData[5]);
            personStorage.add(doctor);
            System.out.println("Saved");
        } else {
            System.out.println("Doctor with" + id + "already exsist");
        }

    }
}


