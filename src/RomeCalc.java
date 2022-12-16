
class RomeCalc {
    static void Calc(String firstRome, String secondRome) throws Exception {
        int first = RomeToArab.Convert(firstRome);
        int second = RomeToArab.Convert(secondRome);
        int i = switch (Parser.getPoiner()) {
            case 1 -> first + second;
            case 2 -> first - second;
            case 3 -> first * second;
            case 4 -> first / second;
            default -> 0;
        };
        if (i<=0){
            throw new Exception();
        }
        System.out.println("Результат вычисления римский числел: " + ArabToRoman.Convert(i));
    }
}
