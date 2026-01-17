import java.util.ArrayList;
import java.util.List;

public class EngineerBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
       List<String> subjects = new ArrayList<>();
       subjects.add("Maths");
       subjects.add("COA");
       subjects.add("DBMS");
       this.subjects = subjects;
       return this;
    }

}
