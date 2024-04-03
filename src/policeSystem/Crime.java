package policeSystem;

import java.time.LocalDate;
import java.util.*;

public class Crime {

    private final LocalDate date;
    private final String locality;
    private final double coordinatesLatitude;
    private final double coordinatesLongitude;
    private final CrimeType crimeType;
    private final List<UUID> criminalIDs;


    public Crime(LocalDate date, String locality, double coordinatesLatitude, double coordinatesLongitude,
                 CrimeType crimeType, List<UUID> criminalIDs) {
        this.date = date;
        this.locality = locality;
        this.coordinatesLatitude = coordinatesLatitude;
        this.coordinatesLongitude = coordinatesLongitude;
        this.crimeType = crimeType;
        this.criminalIDs = criminalIDs;
    }

    @Override
    public String toString() {
        return "Crime{" +
                "date=" + date +
                ", locality='" + locality + '\'' +
                ", coordinatesLatitude=" + coordinatesLatitude +
                ", coordinatesLongitude=" + coordinatesLongitude +
                ", crimeType=" + crimeType +
                ", criminalIDs=" + criminalIDs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Crime crime)) return false;
        return Double.compare(getCoordinatesLatitude(), crime.getCoordinatesLatitude()) == 0 &&
                Double.compare(getCoordinatesLongitude(), crime.getCoordinatesLongitude()) == 0 &&
                Objects.equals(getDate(), crime.getDate()) &&
                Objects.equals(getLocality(), crime.getLocality()) &&
                getCrimeType() == crime.getCrimeType()
                && Objects.equals(getCriminalIDs(), crime.getCriminalIDs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDate(), getLocality(), getCoordinatesLatitude(),
                getCoordinatesLongitude(), getCrimeType(), getCriminalIDs());
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLocality() {
        return locality;
    }

    public double getCoordinatesLatitude() {
        return coordinatesLatitude;
    }

    public double getCoordinatesLongitude() {
        return coordinatesLongitude;
    }

    public CrimeType getCrimeType() {
        return crimeType;
    }

    public List<UUID> getCriminalIDs() {
        return criminalIDs;
    }
}
