import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create student
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        Student s1 = new Student(name);

        // Notification system
        NotificationService service = new NotificationService();
        service.addStudent(s1);

        // Choose complaint type
        System.out.println("\nSelect Complaint Type:");
        System.out.println("1. WiFi");
        System.out.println("2. Water");
        System.out.println("3. Electricity");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Enter description
        System.out.print("Enter complaint description: ");
        String desc = sc.nextLine();

        // Create complaint based on choice (POLYMORPHISM)
        Complaint c;

        if (choice == 1) {
            c = new WiFiComplaint(1, desc);
        } else if (choice == 2) {
            c = new WaterComplaint(1, desc);
        } else if (choice == 3) {
            c = new ElectricityComplaint(1, desc);
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        // Admin resolves complaint
        Admin admin = Admin.getInstance();
        admin.resolveComplaint(c, service);

        sc.close();
    }
}