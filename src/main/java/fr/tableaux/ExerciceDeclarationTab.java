package fr.tableaux;

/**
 * TP 05
 */
public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        // Déclarez un tableau d’entiers contenant tous les chiffres suivants : 8, -7, 12, 1, -2, 14, 17, 9
        int[] intArray = {8, -7, 12, 1, -2, 14, 17, 9};

        // Affichez l’élément du tableau d’index 0 du tableau
        System.out.println(intArray[0]);

        // Affichez la longueur du tableau
        System.out.println(intArray.length);

        // Affichez l’entier positionné au dernier index du tableau
        System.out.println(intArray[intArray.length - 1]);

        // Affichez l’entier d’index 10. Pourquoi cela échoue ? Affichez un commentaire dans votre code pour l’expliquer.

        System.out.println("""
                System.out.println(intArray[10]); will fail because the index for an array starts at 0 and for an array of size 8, the last index is 7.
                So the index 10 doesn't exist.
                """);
        System.out.println(intArray[10]);


    }
}
