import java.util.*;

public class Attendance {
    static Map<String, List<String>> students = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        students.put(name, new ArrayList<>());
        System.out.println("Student added successfully.");
    }

    public static void markAttendance() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        if(students.containsKey(name)) {
            System.out.print("Enter P for Present, A for Absent: ");
            String status = sc.nextLine().toUpperCase();
            students.get(name).add(status);
            System.out.println("Attendance marked.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void viewAttendance() {
        System.out.println("\nAttendance Records:");
        for(String name : students.keySet()) {
            System.out.println(name + ": " + students.get(name));
        }
    }

    public static void main(String[] args) {
        while(true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Attendance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            String choice = sc.nextLine();

            switch(choice) {
                case "1": addStudent(); break;
                case "2": markAttendance(); break;
                case "3": viewAttendance(); break;
                case "4": System.out.println("Exiting..."); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
