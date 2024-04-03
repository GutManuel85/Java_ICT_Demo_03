package policeSystem;

import java.util.Scanner;

public class CommandLineInterface {

    private int command;
    private final Scanner scanner;

    public CommandLineInterface() {
        this.command = Command.MAIN_MENU.getCommandNumber();
        this.scanner = new Scanner(System.in);
    }

    public void start(CrimeRegister crimeRegister) {
        while (command != Command.EXIT.getCommandNumber()) {
            switch (command) {
                case 0: {
                    showMainMenu();
                    break;
                }
                case 1: {
                    addCriminal(crimeRegister);
                    break;
                }
                case 2: {
                    addCrime(crimeRegister);
                    break;
                }
                case 3: {
                    exit();
                    break;
                }
                default: {
                    System.out.println("Befehl unbekannt.");
                }
            }
        }
    }


    private void showMainMenu() {
        System.out.print(
                "*************** Willkommen im Crime System CLI *************** \n" +
                        "Folgende Funktionalitäten stehen zur Verfügung: \n" +
                        "1. Kriminelle Person erfassen \n" +
                        "2. Verbrechen erfassen \n" +
                        "3. Programm beenden \n" +
                        "Bitte Nummer eingeben: "
        );
        this.command = this.scanner.nextInt();
    }

    private void addCriminal(CrimeRegister crimeRegister) {
        System.out.println("*************** Kriminelle Person erfassen ***************");
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Vorname: ");
        String firstName = scanner.next();
        System.out.print("Alter: ");
        int age = scanner.nextInt();
        Sex sex = chooseSex();
        WantedStatus wantedStatus = chooseWantedStatus();
        Criminal criminal = new Criminal(name, firstName, age, sex, wantedStatus);
        System.out.println("--- Folgende Person erfasst ---");
        System.out.println(criminal);
        crimeRegister.addCriminal(criminal);
    }

    private Sex chooseSex(){
        System.out.print(String.format(
                "Geschlecht (%s = %s, %s = %s, %s = %s): ",
                Sex.MALE.getDescription(),
                Sex.MALE.getAbbreviation(),
                Sex.FEMALE.getDescription(),
                Sex.FEMALE.getAbbreviation(),
                Sex.DIVERSE.getDescription(),
                Sex.DIVERSE.getAbbreviation()));
        char sexAbbreviation = scanner.next().toUpperCase().charAt(0);
        Sex sex;
        switch (sexAbbreviation) {
            case 'M': {
                sex = Sex.MALE;
                break;
            }
            case 'F': {
                sex = Sex.FEMALE;
                break;
            }
            default: {
                sex = Sex.DIVERSE;
            }
        }
        return sex;
    }

    private WantedStatus chooseWantedStatus(){
        System.out.print(String.format(
                "Fahndungsstatus (%s = %s, %s = %s, %s = %s): ",
                WantedStatus.WANTED.getDescription(),
                WantedStatus.WANTED.getAbbreviation(),
                WantedStatus.FUGITIVE.getDescription(),
                WantedStatus.FUGITIVE.getAbbreviation(),
                WantedStatus.ARRESTED.getDescription(),
                WantedStatus.ARRESTED.getAbbreviation()
        ));
        char wantedStatusAbbreviation = scanner.next().toUpperCase().charAt(0);
        WantedStatus wantedStatus;
        switch (wantedStatusAbbreviation) {
            case 'F': {
                wantedStatus = WantedStatus.FUGITIVE;
                break;
            }
            case 'V': {
                wantedStatus = WantedStatus.ARRESTED;
                break;
            }
            default: {
                wantedStatus = WantedStatus.WANTED;
            }
        }
        return wantedStatus;
    }

    private void addCrime(CrimeRegister crimeRegister) {
        System.out.println("*************** Verbrechen erfassen ***************");

    }

    private void exit() {
        System.out.println("*************** System wird beendet ***************");
    }
}
