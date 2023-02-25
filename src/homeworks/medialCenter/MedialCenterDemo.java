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
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    print_All_PatientsByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    personStorage.printTodayPatients();
                    break;
                default:
                    System.out.println("Wrong index,Try again");
            }
        }
    }


    private static void print_All_PatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctorID");
        String id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(id);
        if (doctor != null) {
            personStorage.searchPatientsDoctor(doctor);
        } else {
            System.out.println("Wrong doctor " + id + "Try agayin");
        }

    }



    private static void add_Patinet() throws ParseException {
        personStorage.printDoctors();
        System.out.println("please choose doctorId");
        String id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(id);
        if (doctor != null) {
            System.out.println("please input id(id card),name,surname,phone,registerDateTime(dd/MM/yyyy HH:mm");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            Date registrDateTime = DateUtil.stringToDateTime(patientData[4]);
            if (personStorage.isDoctorAvailable(registrDateTime, doctor)) {
                try {
                    Patient patient = new Patient(patientData[0], patientData[1], patientData[2], patientData[3], DateUtil.stringToDateTime(patientData[4]));
                    personStorage.add(patient);
                    System.out.println("Patient registered!!!");
                } catch (ParseException e) {
                    System.out.println("Incorrect registerDate time,please try again!!!");
                }
            } else {
                System.out.println("Doctor is unAvailable in that date time, please choose another");
            }
        } else {
            System.out.println("patiend with" + id + "already exsist");
        }

    }

    private static void changeDoctorByid() {
        personStorage.printDoctors();
        System.out.println("please choose doctorId");
        String doctorID = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorID);
        if (doctorById != null) {
            System.out.println("Please input name,surname,email,phone,proffesion");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setEmail(doctorData[2]);
            doctorById.setPhone(doctorData[3]);
            doctorById.setProfession(doctorData[4]);
            System.out.println("doctor was updated");
        } else {
            System.out.println("doctor is" + doctorID + "does not exists!!!");

        }
    }


    private static void searchDoctorByProfession() {
        System.out.println("please input proffesion");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
        System.out.println("search result found");
    }

    private static void deleteDoctorbyid() {
        personStorage.printDoctors();
        System.out.println("Please choose doctorId");
        String doctorId = scanner.nextLine();
        Doctor doctor = (Doctor) personStorage.getDoctorById(doctorId);
        if (doctor != null) {
            personStorage.deleteDoctorById(doctorId);
            System.out.println("doctor deleted!!");
        } else {
            System.out.println("Wrong id.Try again");
        }
    }

    private static void add_doctor() {
        System.out.println("please input id,name,surname,email,phoneNumber,professia");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = (Doctor) personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor(doctorId, doctorData[1], doctorData[2], doctorData[3], doctorData[4], doctorData[5]);
            personStorage.add(doctor);
            System.out.println("doctor added");
        } else {
            System.out.println("Doctor with" + doctorId + "already exsist");
        }

    }
}


