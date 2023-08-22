package Calculator;
import java.util.Scanner;

public class Blacklist_aqa {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        calculator(input);
    }

    public static String calculator(String input) throws Exception {
        String[] operator = {"+", "-", "/", "*"};
        String[] tokens = input.split(" ");
        int actionIndex = -1;
        for (int i = 0; i < operator.length; i++) {
            if (input.contains(operator[i])) {
                actionIndex = i;
                break;
            }
        }
        //Если не нашли арифметического действия, завершаем программу
        if (actionIndex == -1) {
            throw new Exception("Отсутсвие математического действия");

        }
        if (tokens.length != 3) {
            throw new Exception("Не верное количество операнд");

        }

        try {


            int s1 = Integer.parseInt(intAuthentificator(tokens[0]));
            int s2 = Integer.parseInt(intAuthentificator(tokens[2]));

            if (s1 > 10 || s2 > 10 || s1 < 1 || s2 < 1) {
                throw new Exception("Не верные операнды");
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


        }catch (NumberFormatException s)
        {throw new Exception("Не верные операнды");
        };
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
