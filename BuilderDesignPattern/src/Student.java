import java.util.List;

public class Student {
    int rollNo;
    String name;
    String email;
    int age;
    String dob;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder)
    {
        this.rollNo = studentBuilder.rollNo;
        this.name = studentBuilder.name;
        this.email = studentBuilder.email;
        this.age = studentBuilder.age;
        this.dob = studentBuilder.dob;
        this.subjects = studentBuilder.subjects;
    }
    public String toString()
    {
        return "Roll No: " + rollNo + "\nName: " + name + "\nEmail: " + email + "\nAge: " + age + "\nDOB: " + dob + "\nSubjects: " + subjects;
    }


}
