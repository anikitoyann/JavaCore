package homeworks.medialCenter;

import homeworks.medialCenter.model.Doctor;
import homeworks.medialCenter.model.Patient;
import homeworks.medialCenter.storage.DoctorStorage;
import homeworks.medialCenter.storage.PatientStorage;
import homeworks.medialCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import static homeworks.employee.util.DateUtil.sdf;

public class MedialCenterDemo implements Commands {
    public static Scanner scanner = new Scanner(System.in);
    public static DoctorStorage doctorStorage = new DoctorStorage();
    public static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) throws ParseException {
        Doctor doctor = new Doctor("a1a", "Ani", "Kitoyan", "ascas@mail.ru", "7885545", "doctor");
        doctorStorage.add(doctor);
        patientStorage.add(new Patient("a7a", "Amalya", "Harutynyan", doctor, DateUtil.stringToDate("21/02/23")));
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
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    print_all_patients();
                    break;
                case PRINT_TODAYES_PATIENTS:
                    today_Patients();
                    break;
                default:
                    System.out.println("Wrong index,Try again");
            }
        }
    }

    private static void today_Patients() throws ParseException {
        System.out.println("please input today day");
        String date= scanner.nextLine();
        Date datte=sdf.parse(date);
        patientStorage.print(datte);
    }

    private static void print_all_patients() {
        System.out.println("please input doctorId");
        doctorStorage.print();
        System.out.println("please choose doctorId");
        String doctorID = scanner.nextLine();
        Doctor doctor = doctorStorage.getid(doctorID);
        if (doctor == null) {
            System.out.println("Wrong doctor id,Try agayin");
        } else {
            patientStorage.searchPatients(doctor);
        }
    }


    private static void add_Patinet() throws ParseException {
        if (doctorStorage.Getsize() == 0) {
            System.out.println("please add doctor");
            return;
        }
        doctorStorage.print();
        System.out.println("please choose doctor");
        String doctorID = scanner.nextLine();
        Doctor doctorById = doctorStorage.getid(doctorID);
        if (doctorById != null) {
            System.out.println("please input id,name,surname,doctor(id),registerDateTime");
            String patientSTr = scanner.nextLine();
            String[] patientStrData = patientSTr.split(",");
            String id = patientStrData[0];
            Patient patientId = patientStorage.searchpatinetID(id);
            if (patientId == null) {
                Patient patient = new Patient(patientStrData[0], patientStrData[1], patientStrData[2], doctorById, DateUtil.stringToDate(patientStrData[4]));
                patientStorage.add(patient);
            } else {
                System.out.println("patiend with" + id + "already exsist");
            }

        } else System.out.println("wrong doctor id,please agayin");
    }

    private static void changeDoctorByid() {
        doctorStorage.print();
        System.out.println("please choose doctorId");
        String doctorID = scanner.nextLine();
        {
            Doctor doctor = doctorStorage.getid(doctorID);
            if (doctor == null) {
                System.out.println("Wrong doctor id,Try agayin");
            } else {
                System.out.println("please input new name");
                String name = scanner.nextLine();
                doctor.setPhoneNumber(name);
                System.out.println("please input new surname");
                String surname = scanner.nextLine();
                doctor.setSurname(surname);
                System.out.println("please input new PhoneNumber");
                String phoneNumber = scanner.nextLine();
                doctor.setPhoneNumber(phoneNumber);
                System.out.println("please input new email");
                String email = scanner.nextLine();
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
        doctorStorage.searchDoctor(profession);
        System.out.println("proffesia changed!!");
    }

    private static void deleteDoctorbyid() {
        doctorStorage.print();
        System.out.println("please choose doctorId");
        String doctorID = scanner.nextLine();
        {
            Doctor doctor = doctorStorage.getid(doctorID);
            if (doctor == null) {
                System.out.println("Wrong doctor id,Try agayin");
            } else {
                doctorStorage.deleteDoctor(doctorID);
                System.out.println("doctor deleted!!");
            }
        }
    }

    private static void add_doctor() {
        System.out.println("please input id,name,surname,email,phoneNumber,professia");
        String doctorSTr = scanner.nextLine();
        String[] doctorStrData = doctorSTr.split(",");
        String id = doctorStrData[0];
        Doctor doctorid = doctorStorage.getid(id);
        if (doctorid == null) {
            Doctor doctor = new Doctor(doctorStrData[0], doctorStrData[1], doctorStrData[2], doctorStrData[3], doctorStrData[4], doctorStrData[5]);
            doctorStorage.add(doctor);
            System.out.println("Saved");
        } else {
            System.out.println("Doctor with" + id + "already exsist");
        }

    }
}


