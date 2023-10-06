package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale addressOne = new AdressePostale();
        addressOne.streetNumber = 20;
        addressOne.streetName = "rue Lilly Rein";
        addressOne.postalCode = 74000;
        addressOne.city = "Bernice";


        AdressePostale addressTwo = new AdressePostale();
        addressTwo.streetNumber = 6;
        addressTwo.streetName = "rue Urbain la Liberté";
        addressTwo.postalCode = 34100;
        addressTwo.city = "Lollipop";

        System.out.println("Address one -------");
        System.out.println(addressOne.streetNumber + " " + addressOne.streetName);
        System.out.println(addressOne.postalCode + "," + addressOne.city);

        System.out.println("--------------------------------------------------");

        System.out.println("Address two --------");
        System.out.println(addressTwo.streetNumber + " " + addressTwo.streetName);
        System.out.println(addressTwo.postalCode + "," + addressTwo.city);
    }
}
