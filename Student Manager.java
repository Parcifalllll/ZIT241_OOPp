import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean removeStudent(String lastName, String firstName, String middleName) {
        for (Student s : students) {
            if (s.getLastName().equalsIgnoreCase(lastName)
                    && s.getFirstName().equalsIgnoreCase(firstName)
                    && s.getMiddleName().equalsIgnoreCase(middleName)) {
                students.remove(s);
                return true;
            }
        }
        return false;
    }

    public void findStudent(String lastName) {
        for (Student s : students) {
            if (s.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println(s);
            }
        }
    }

    public void printByGroup(String group) {
        for (Student s : students) {
            if (s.getGroup().equalsIgnoreCase(group)) {
                System.out.println(s);
            }
        }
    }
}
