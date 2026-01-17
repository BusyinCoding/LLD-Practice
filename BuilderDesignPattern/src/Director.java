public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student constructStudent() {
        if (studentBuilder instanceof EngineerBuilder) {
            return createEngineerStudent();
        }

        if (studentBuilder instanceof CaBuilder) {
            return createCaStudent();
        }
        return null;
    }

    public Student createEngineerStudent() {
        return studentBuilder.setRollNo(1).setAge(10).setName("Aman").setSubjects().build();
    }

    public Student createCaStudent() {
        return studentBuilder.setRollNo(2).setAge(12).setName("Ankit").setSubjects().build();

    }
}


