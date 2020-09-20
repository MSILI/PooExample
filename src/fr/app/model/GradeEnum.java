package fr.app.model;

public enum GradeEnum {

    MCA("MCA"),
    MCB("MCB"),
    PROF("Professeur");

    GradeEnum(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                '}';
    }
}
