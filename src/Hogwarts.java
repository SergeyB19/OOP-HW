public class Hogwarts {
    private String firstName;
    private String surName;
    private String faculty;

    public Hogwarts(String firstName, String surName, String faculty) {
        this.firstName = firstName;
        this.surName = surName;
        this.faculty = faculty;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
