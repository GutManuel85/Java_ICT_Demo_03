package polymorphism_demo.gameCharacters;

public enum Horse {
    DESTRIER("Destrier", 10),
    COURSER("Courser", 9),
    CHARGER("Charger", 8),
    ROUNCEY("Rouncey", 9);


    public final String race;
    public final int speed;

    private Horse(String race, int speed) {
        this.race = race;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "race='" + race + '\'' +
                ", speed=" + speed +
                '}';
    }
}
