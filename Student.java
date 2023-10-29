import java.util.Scanner;

class Student {
     String name;
     int registerNumber;
     int[] subjectMarks = new int[5];

    void Student(String a, int rn, int[] marks) {
        name = a;
        registerNumber = rn;
        subjectMarks = marks;
    }

     int calculateTotalMarks() {
        int totalMarks = 0;
        for (int mark : subjectMarks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

     void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Subject Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjectMarks[i]);
        }
        System.out.println("Total Marks: " + calculateTotalMarks());
    }
}
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Register Number: ");
        int registerNumber = scanner.nextInt();

        int[] subjectMarks = new int[5];
        System.out.println("Enter Subject Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
        }

        Student student = new Student(name, registerNumber, subjectMarks);
        student.displayStudentDetails();

        scanner.close();
    }
}