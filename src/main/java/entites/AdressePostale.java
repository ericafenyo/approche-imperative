package entites;

public class AdressePostale {
    int streetNumber;
    String streetName;
    String city;
    int postalCode;

    @Override
    public String toString() {
        return String.format("%d %s,%d,%s", streetNumber, streetName, postalCode, city);
    }
}
