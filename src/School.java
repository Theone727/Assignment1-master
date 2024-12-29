import java.util.LinkedList;
import java.util.List;

class School {
    private List<Person> members;

    public School() {
        members = new LinkedList<>();
    }

    public void addMember(Person person) {
        if (person != null) {
            members.add(person);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("School Members:\n");
        for (int i = 0; i < members.size(); i++) {
            result.append(i + 1).append(". ").append(members.get(i)).append("\n");
        }
        return result.toString();
    }
}
