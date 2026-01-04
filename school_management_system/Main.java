package school_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(01,"Rose",40000);
        Teacher t2 = new Teacher(02,"Mellisa",50000);
        Teacher t3 = new Teacher(03,"John",30000);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(t1);
        teachersList.add(t2);
        teachersList.add(t3);

        Student s1 = new Student(1001,"jegadeesh",5);
        Student s2 =  new Student(1002,"peter",6);
        Student s3 = new Student(1003,"sarah",4);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);

        School pvn = new School(teachersList,studentsList);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== SCHOOL MONEY MANAGEMENT ======");
            System.out.println("1. Pay Student Fees");
            System.out.println("2. Pay Teacher Salary");
            System.out.println("3. View School Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();

                    Student student = findStudentById(studentsList, sid);
                    if (student != null) {
                        System.out.print("Enter fee amount: ");
                        int amount = sc.nextInt();
                        student.payFees(amount);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Teacher ID: ");
                    int tid = sc.nextInt();

                    Teacher teacher = findTeacherById(teachersList, tid);
                    if (teacher != null) {
                        teacher.receiveSalary();
                    } else {
                        System.out.println("Teacher not found!");
                    }
                    break;

                case 3:
                    System.out.println("Total Money Earned: " + School.getTotalMoneyEarned());
                    System.out.println("Total Money Spent: " + School.getTotalMoneySpent());
                    System.out.println("Net Balance: " + School.getNetBalance());
                    break;

                case 4:
                    System.out.println("Thank you! Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static Student findStudentById(List<Student> students, int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    private static Teacher findTeacherById(List<Teacher> teachers, int id) {
        for (Teacher t : teachers) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
}



