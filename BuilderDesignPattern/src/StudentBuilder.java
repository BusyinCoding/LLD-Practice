import java.util.List;

public abstract class StudentBuilder {
    int rollNo;
    String name;
    String email;
    int age;
    String dob;
    List<String> subjects;

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
    public StudentBuilder setDob(String dob) {
        this.dob = dob;
        return this;
    }
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public abstract StudentBuilder setSubjects();
    public Student build()
    {
        return new Student(this);
    }


}
