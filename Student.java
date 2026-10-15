public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}
