package policeSystem;

public class Main {

    public static void main(String[] args) {

        CrimeRegister crimeRegister = CrimeRegister.getCrimeRegister();
        CommandLineInterface cli = new CommandLineInterface();
        cli.start(crimeRegister);



        /*
        Criminal criminal1 = new Criminal("Evil", "Max", 28,
                Sex.MALE, WantedStatus.WANTED);
        Crime crime1 = new Crime(
                LocalDate.of(2024,4,3),
                "Ebikon",
                668472,
                214923,
                CrimeType.MURDER,
                Arrays.asList(criminal1.getId())
        );
         */
    }
}
