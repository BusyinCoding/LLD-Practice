import java.util.ArrayList;
import java.util.List;

public class CaBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subjects = new ArrayList<>();
        subjects.add("BusinessStudies");
        subjects.add("Economics");
        subjects.add("Marketing");
        this.subjects = subjects;
        return this;
    }
}
