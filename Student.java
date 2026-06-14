public class Student {

    private String lastName;
    private String firstName;
    private String middleName;
    private String group;

    public Student(String lastName, String firstName, String middleName, String group) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.group = group;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + middleName + ", группа: " + group;
    }
}
