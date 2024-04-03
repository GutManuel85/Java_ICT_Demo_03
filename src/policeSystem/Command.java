package policeSystem;

public enum Command {

    MAIN_MENU(0),
    ADD_CRIMINAL(1),
    ADD_CRIME(2),
    EXIT(3);

    private final int commandNumber;

    Command(int commandNumber){
        this.commandNumber = commandNumber;
    }

    public int getCommandNumber() {
        return commandNumber;
    }
}
