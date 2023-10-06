package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {
        String sos = "119";

        int sosInt = Integer.valueOf(sos);

        int a = 3;
        int b = 6;

        int c = Integer.max(a, 6);

        System.out.println(String.format("Original value = %s with type = %s", sos, sos.getClass().getSimpleName()));
        System.out.println(String.format("Converted value = %d with type = %s", sosInt, Integer.valueOf(sos).getClass().getSimpleName()));
        System.out.println(String.format("Max of %d and %d = %d", a, b, c));
    }
}
