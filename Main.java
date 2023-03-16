import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи арифмитическое выражение с числами от 1 до 10 через пробел");
        String input = scanner.nextLine();

        calc(input);

    }
    public static String calc(String input)throws Exception {
        int[] arabian = {1,2,3,4,5,6,7,8,9,10};
        String[] arabianS = {"0","1","2","3","4","5","6","7","8","9","10"};
        String [] rome ={"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        String[] operator = {"+","-","/","*"};
        String[]tokens = input.split(" ");
        String output = null;
        int answer = 0;
        int actionIndex=-1;
        for (int i = 0; i < operator.length; i++) {
            if(input.contains(operator[i])){
                actionIndex = i;
                break;
            }
        }
        //Если не нашли арифметического действия, завершаем программу
        if(actionIndex==-1){
            throw new Exception("Некорректное выражение");

        }

        //выражение не больше 3-х токенов
        if (tokens.length!=3) {
            throw new Exception("Не верное выражение");
        }

        try {


            int s1 = Integer.parseInt(intAuthentificator(tokens[0]));
            int s2 = Integer.parseInt(intAuthentificator(tokens[2]));

            if (s1 > 10 || s2 > 10 || s1 < -10 || s2 < -10) {
                throw new Exception("Не верное выражение");
            }


            int res = 0;

            switch (tokens[1]) {
                case "+":
                    res = s1 + s2;
                    System.out.println("Ответ: " + res);
                    break;
                case "-":
                    res = s1 - s2;
                    System.out.println("Ответ: " + res);
                    break;
                case "*":
                    res = s1 * s2;
                    System.out.println("Ответ: " + res);
                    break;
                case "/":
                    res = s1 / s2;
                    System.out.println("Ответ: " + res);
                    break;

            }


        }catch (NumberFormatException s) {
            try {


                Roman_numerals romes1 = Roman_numerals.valueOf(tokens[0]);
                Roman_numerals romes2 = Roman_numerals.valueOf(tokens[2]);

                int r1 = romes1.getArabian();
                int r2 = romes2.getArabian();







                int res = 0;

                switch (tokens[1]) {
                    case "+":
                        res = r1 + r2;
                        System.out.println("Ответ: " + rome[res-1]);
                        break;
                    case "-":
                        res = r1 - r2;
                        System.out.println("Ответ: " + rome[res-1]);
                        break;
                    case "*":
                        res = r1 * r2;
                        System.out.println("Ответ: " + rome[res-1]);
                        break;
                    case "/":
                        res = r1 / r2;
                        System.out.println("Ответ: " + rome[res-1]);
                        break;

                }

            }catch (IllegalArgumentException e){
                throw new Exception("Не верное выражение");
            }
            catch (ArrayIndexOutOfBoundsException p){
                throw new Exception("Не может быть отрицательный результат");
            }


        }
        return input;
    }
    public static String intAuthentificator(String input) {
        String symb = input;
        for (int i = 0; i < 10; i++) {

            int a = Integer.parseInt(input);
            symb = String.valueOf(a);


        }
        return symb;
    }



}
