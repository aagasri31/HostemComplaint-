public class Complaint {
    private int id;
    private String description;
    private String status;

    public Complaint(int id, String description) {
        this.id = id;
        this.description = description;
        this.status = "Pending";
    }

    public void resolve() {
        status = "Resolved";
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}