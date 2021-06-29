package chapterSeven;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Formatter;
import java.util.Scanner;

public class StudentsRecords {

//    private String firstName;
//    private String lastName;
//    private int level;
  // private int yearOfBirth;

//    public StudentsRecords(String firstName, String lastName, int level, int yearOfBirth) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.level = level;
//        this.yearOfBirth = yearOfBirth;
//    }

//    public int calculateAge(){
//        LocalDate date = LocalDate.now();
//        int currentYear = date.getYear();
//        return currentYear - getYearOfBirth();
//    }
//
//    public int getYearOfBirth() {
//        return yearOfBirth;
//    }


//    public static void main(String[] args) {
//        Scanner studentInput = new Scanner(System.in);
//        StudentsRecords studentsRecords = new StudentsRecords();
//        System.out.println("first Name");
//        String firstName = studentInput.next();
//        System.out.println("last Name");
//        String lastName = studentInput.next();
//        System.out.println("level");
//        int level = studentInput.nextInt();
//        System.out.println("year of birth");
//        int yearOfBirth = studentInput.nextInt();
//
//
//       System.out.println(studentsRecords.calculateAge());
//    }









    public void saveRecord(){
        try(Formatter formatter = new Formatter("students_records.txt");
                Scanner studentInput = new Scanner(System.in))
        {
            System.out.println("Enter students record and ENTER + CTRL + D to stop");
            formatter.format("%s %s %s %s %s%n", "first Name", "last Name", "level", "Birth Year","Age");

            while (studentInput.hasNext()){
                String firstName = studentInput.next();
                String lastName =  studentInput.next();
                String level = studentInput.next();
                int yearOfBirth = studentInput.nextInt();


                formatter.format("%s  |  %s  |  %s  |  %d  |  %d %n", firstName, lastName, level, yearOfBirth, LocalDate.now().getYear() - yearOfBirth);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        StudentsRecords records = new StudentsRecords();
        records.saveRecord();
    }






























}
