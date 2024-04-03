package policeSystem;

public enum Sex {

    MALE('M', "männlich"),
    FEMALE('F', "weiblich"),
    DIVERSE('D', "divers");

    private final char abbreviation;
    private final String description;

    Sex(char abbreviation, String description){
        this.abbreviation = abbreviation;
        this.description = description;
    }

    public char getAbbreviation() {
        return abbreviation;
    }

    public String getDescription() {
        return description;
    }
}
