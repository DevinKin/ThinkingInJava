package typeinfo;

public class Position {
    private String title;
    private Person person;

    public Position(String jobTitle, Person employee) {
        title = jobTitle;
        person = employee;
        if (person == null) {
            person = Person.NULL;
        }
    }
    public Position(String jobTitle) {
        title = jobTitle;
        person = Person.NULL;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        if (person == null)
            person = Person.NULL;
    }

    @Override
    public String toString() {
        return "Position: " + title + " " + person;
    }
}
