import java.util.Objects;

abstract class Parser {
    private static boolean Arab;
    private static int poiner = 0;
    private static String first = "";
    private static String second = "";
    private static String firstRome = "";
    private static String secondRome = "";

    public static boolean isArab() {
        return Arab;
    }

    public static int getPoiner() {
        return poiner;
    }

    public static String getFirst() {
        return first;
    }

    public static String getSecond() {
        return second;
    }

    public static String getFirstRome() {
        return firstRome;
    }

    public static String getSecondRome() {
        return secondRome;
    }

    static void parser(char[] arr) throws Exception {
        for (char c : arr) {
            if (Character.isDigit(c)) {
                if (poiner > 0) {
                    second = second + c;
                    Arab = true;
                } else {
                    first = first + c;
                }
            } else if (!Character.isDigit(c)) {
                if (poiner == 0) {
                    switch (c) {
                        case 'I' -> firstRome = firstRome + "I";
                        case 'V' -> firstRome = firstRome + "V";
                        case 'X' -> firstRome = firstRome + "X";
                        case '+' -> poiner = 1;
                        case '-' -> poiner = 2;
                        case '*' -> poiner = 3;
                        case '/' -> poiner = 4;
                        default -> throw new Exception();
                    }
                    continue;
                }
                if (poiner > 0) {
                    Arab = false;
                    switch (c) {
                        case 'I' -> secondRome = secondRome + "I";
                        case 'V' -> secondRome = secondRome + "V";
                        case 'X' -> secondRome = secondRome + "X";
                        case '+', '-', '*', '/' -> throw new Exception();
                    }
                }
            }
        }
        if (!(Objects.equals(first, "")) && !(Objects.equals(secondRome, ""))) {
            throw new Exception();
        }
        if (!(Objects.equals(firstRome, "")) && !(Objects.equals(second, ""))) {
            throw new Exception();
        }
        if (poiner == 0) {
            throw new Exception();
        }
    }
}
