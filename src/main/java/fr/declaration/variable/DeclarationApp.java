package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        byte mByte = 36;
        short mShort = 83;
        int mInt = 4;
        long mLong = 247786L;
        float mFloat = 5.97F;
        double mDouble = 8.66D;
        boolean mBoolean = false;
        String mString = "Inter";

        System.out.println(mByte);
        System.out.println(mShort);
        System.out.println(mInt);
        System.out.println(mLong);
        System.out.println(mFloat);
        System.out.println(mDouble);
        System.out.println(mBoolean);
        System.out.println(mString);
        System.out.println('\u8563');


        String randomString = "Voici le résultat d’un calcul : 1+5=6";
        System.out.println(randomString);
        System.out.println("\n");
        randomString = "Voici le résultat d’un calcul \n: 1+5=6";
        System.out.println(randomString);

    }
}
