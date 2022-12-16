class ArabCalc {

    static void Calc(String first, String second) throws Exception {
        if (Integer.parseInt(first)>10||Integer.parseInt(second)>10){
            throw new Exception();
        }
        var i = 0;
        switch (Parser.getPoiner()){
            case 1: i = Integer.parseInt(first)+Integer.parseInt(second); break;
            case 2: i = Integer.parseInt(first)-Integer.parseInt(second); break;
            case 3: i = Integer.parseInt(first)*Integer.parseInt(second); break;
            case 4: i = Integer.parseInt(first)/Integer.parseInt(second); break;
        }
        System.out.println("Результат вычисления арабских чисел: "+i);
    }
}
