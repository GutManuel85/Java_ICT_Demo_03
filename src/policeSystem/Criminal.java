package policeSystem;

public class Criminal extends Person{

    private WantedStatus wantedStatus;

    public Criminal(String name, String firstName, int age, Sex sex, WantedStatus wantedStatus){
        super(name, firstName, age, sex);
        this.wantedStatus = wantedStatus;
    }

    @Override
    public String toString() {
        return "Criminal{" +
                super.toString() +
                ", wantedStatus: " + wantedStatus +
                '}';
    }

    public WantedStatus getWantedStatus() {
        return wantedStatus;
    }

    public void setWantedStatus(WantedStatus wantedStatus) {
        this.wantedStatus = wantedStatus;
    }
}
