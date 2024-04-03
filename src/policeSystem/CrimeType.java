package policeSystem;

public enum CrimeType {

    MURDER ("Mord", 10, 20),
    ROBBERY ("Raub", 1 , 10),
    BURGLARY ("Einbruch", 1 , 5),
    ASSAULT ("Körperverletzung", 1, 10),
    THEFT ("Diebstahl", 1, 10),
    FRAUD ("Betrug", 1, 10),
    ARSON ("Brandstiftung", 1, 10),
    KIDNAPPING ("Entführung", 5, 15),
    DRUG_TRAFFICKING ("Drogenhandel", 1, 15),
    CYBERCRIME ("Cyberkriminalität", 1, 10),
    DOMESTIC_VIOLENCE ("Häusliche Gewalt", 1, 10),
    HUMAN_TRAFFICKING ("Menschenhandel", 1, 15),
    VANDALISM ("Vandalismus", 1, 3),
    EXTORTION ("Erpressung", 1, 10);

    private final String description;
    private final int minPenaltyInYears;
    private final int maxPenaltyInYears;

    CrimeType(String description, int minPenaltyInYears, int maxPenaltyInYears) {
        this.description = description;
        this.minPenaltyInYears = minPenaltyInYears;
        this.maxPenaltyInYears = maxPenaltyInYears;
    }
}


