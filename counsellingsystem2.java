import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class College {
    String name;
    Map<String, Integer> departmentSeats;

    public College(String name) {
        this.name = name;
        this.departmentSeats = new HashMap<>();
    }
}

class Student {
    String name;
    int marks;
    int cutoff;
    String selectedCollege;
    String selectedDepartment;

    public Student(String name, int marks, int cutoff) {
        this.name = name;
        this.marks = marks;
        this.cutoff = cutoff;
    }
}

public class counsellingsystem2 {
    static List<College> colleges = new ArrayList<>();
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        initializeColleges();
        takeStudentDetails();
        allocateColleges();
        displayAvailableSeats();
        selectBranchAndDepartment();
        updateDatabase();
    }

    private static void initializeColleges() {
        colleges.add(new College("CollegeA"));
        colleges.add(new College("CollegeB"));
        colleges.add(new College("CollegeC"));

        for (College college : colleges) {
            college.departmentSeats.put("Department1", 10);
            college.departmentSeats.put("Department2", 15);
            college.departmentSeats.put("Department3", 20);
        }
    }

    private static void takeStudentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Marks: ");
            int marks = scanner.nextInt();
            System.out.print("Cutoff: ");
            int cutoff = scanner.nextInt();

            students.add(new Student(name, marks, cutoff));
        }
    }

    private static void allocateColleges() {
        for (Student student : students) {
            for (College college : colleges) {
                if (student.marks >= student.cutoff && college.departmentSeats.values().stream().anyMatch(seats -> seats > 0)) {
                    student.selectedCollege = college.name;
                    break;
                }
            }
        }
    }

    private static void displayAvailableSeats() {
        System.out.println("Available Seats:");
        for (College college : colleges) {
            System.out.println(college.name);
            for (Map.Entry<String, Integer> entry : college.departmentSeats.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " seats");
            }
            System.out.println();
        }
    }

    private static void selectBranchAndDepartment() {
        Scanner scanner = new Scanner(System.in);

        for (Student student : students) {
            System.out.println("Student: " + student.name);
            System.out.println("Available options for " + student.selectedCollege + ":");
            College selectedCollege = colleges.stream().filter(c -> c.name.equals(student.selectedCollege)).findFirst().orElse(null);

            if (selectedCollege != null) {
                System.out.println("Departments:");
                for (Map.Entry<String, Integer> entry : selectedCollege.departmentSeats.entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue() + " seats");
                }

                System.out.print("Enter the preferred department: ");
                String selectedDepartment = scanner.next();
                student.selectedDepartment = selectedDepartment;

                // Update available seats
                int availableSeats = selectedCollege.departmentSeats.getOrDefault(selectedDepartment, 0);
                selectedCollege.departmentSeats.put(selectedDepartment, availableSeats - 1);
            }
        }
    }

    private static void updateDatabase() {
        // In a real-world scenario, you would update a database here.
        // For simplicity, this example only prints the selected choices.
        System.out.println("\nUpdated Database:");
        for (Student student : students) {
            System.out.println(student.name + " - College: " + student.selectedCollege + ", Department: " + student.selectedDepartment);
        }
    }
}
