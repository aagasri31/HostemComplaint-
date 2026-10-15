
import java.util.*;

public class NotificationService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void notifyStudents(String msg) {
        for (Student s : students) {
            s.update(msg);
        }
    }
}
