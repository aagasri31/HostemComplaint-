public class Admin {
    private static Admin instance;

    private Admin() {}

    public static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }

    public void resolveComplaint(Complaint c, NotificationService n) {
        c.resolve();
        n.notifyStudents("Complaint resolved: " + c.getDescription());
    }
}