package policeSystem;

import java.util.HashMap;
import java.util.UUID;

public class CrimeRegister {

    private static CrimeRegister crimeRegister;
    private final HashMap<Integer, Crime> crimes;
    private final HashMap<UUID, Criminal> criminals;

    private CrimeRegister() {
        this.crimes = new HashMap<>();
        this.criminals = new HashMap<>();
    }

    public static CrimeRegister getCrimeRegister(){
        if(crimeRegister == null){
            return new CrimeRegister();
        }else{
            return crimeRegister;
        }
    }

    public void addCrime(Crime crime){
        this.crimes.put(crime.hashCode(), crime);
    }

    public void addCriminal(Criminal criminal){
        this.criminals.put(criminal.getId(), criminal);
    }

}
