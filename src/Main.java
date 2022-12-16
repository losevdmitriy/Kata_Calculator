import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите арифметическую операцию:");
        Scanner scr = new Scanner(System.in);
        String inpMath = scr.nextLine().toUpperCase();
        char[] arr = inpMath.toCharArray();
        Parser.parser(arr);

        if (Parser.isArab() == true){
            ArabCalc.Calc(Parser.getFirst(),Parser.getSecond());
        }
        if (Parser.isArab() == false){
            RomeCalc.Calc(Parser.getFirstRome(),Parser.getSecondRome());
        }

    }
}