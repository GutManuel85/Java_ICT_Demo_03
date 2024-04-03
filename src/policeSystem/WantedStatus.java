package policeSystem;

public enum WantedStatus {

    WANTED('G',"Gesucht"),
    FUGITIVE('F', "Flüchtig"),
    ARRESTED('V', "Verhaftet");

    private final char abbreviation;
    private final String description;

    WantedStatus(char abbreviation, String description) {
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
