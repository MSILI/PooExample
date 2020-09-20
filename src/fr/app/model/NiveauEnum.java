package fr.app.model;

public enum NiveauEnum {
    L1("L1"),
    L2("L2"),
    L3("L3"),
    M1("M1"),
    M2("M2");

    private String name;

    NiveauEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "NiveauEnum{" +
                "name='" + name + '\'' +
                '}';
    }
}
