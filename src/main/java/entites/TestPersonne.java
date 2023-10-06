package entites;

import entites2.Personne;

public class TestPersonne {
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

        Personne personOne = new Personne();
        personOne.firstName = "Pendragon";
        personOne.lastName = "Morgana";
        personOne.address = addressOne;

        Personne personTwo = new Personne();
        personTwo.firstName = "Snap";
        personTwo.lastName = "Loreta";
        personTwo.address = addressTwo;

        System.out.println("Person one --------");
        System.out.println("First name:" + personOne.firstName);
        System.out.println("Last name:" + personOne.lastName);
        System.out.println("Address:" + addressOne);

        System.out.println(" ");

        System.out.println("Person two --------");
        System.out.println("First name:" + personTwo.firstName);
        System.out.println("Last name:" + personTwo.lastName);
        System.out.println("Address:" + addressTwo);
    }
}
