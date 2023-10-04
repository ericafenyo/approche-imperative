package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        // Déclarez un tableau de chaines de caractères contenant 5 noms de villes au choix.
        String[] cities = {"New York", "London", "Paris", "Berlin", "Cairo"};

        // Affichez les 5 éléments du tableau
        // I didn't specify the number of cities in the loop
        // because my cities are exactly five in numbers.
        for (String city : cities) {
            System.out.println(city);
        }

        // Affichez la longueur du tableau
        System.out.println(cities.length);

        // Modifiez l’élément d’index 3 du tableau avec la valeur de ville "Reims"
        cities[3] = "Reims";

        // Affichez les 5 éléments du tableau après modification
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
