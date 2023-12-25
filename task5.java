import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private Map<String, Double> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void addGrade(String course, double grade) {
        grades.put(course, grade);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (double grade : grades.values()) {
            total += grade;
        }

        return total / grades.size();
    }
}

class StudentManagementSystem {
    private ArrayList<Student> students;
    private Scanner scanner;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Register a new student");
            System.out.println("2. Add grades to a student");
            System.out.println("3. View student information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    registerStudent();
                    break;
                case 2:
                    addGrades();
                    break;
                case 3:
                    viewStudentInfo();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private void registerStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        Student student = new Student(name, id);
        students.add(student);
        System.out.println("Student registered successfully.");
    }

    private void addGrades() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        Student student = findStudentById(id);
        if (student != null) {
            System.out.print("Enter course name: ");
            String course = scanner.next();
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();

            student.addGrade(course, grade);
            System.out.println("Grade added successfully.");
        } else {
            System.out.println("Student not found with ID: " + id);
        }
    }

    private void viewStudentInfo() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        Student student = findStudentById(id);
        if (student != null) {
            System.out.println("Student Information:");
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Grades: " + student.getGrades());
            System.out.println("Average Grade: " + student.getAverageGrade());
        } else {
            System.out.println("Student not found with ID: " + id);
        }
    }

    private Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}

public class studentms {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        system.run();
    }
}

