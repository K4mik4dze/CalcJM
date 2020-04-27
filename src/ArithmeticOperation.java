import java.util.Arrays;

public class ArithmeticOperation{
    public String[] functions = {"+", "-", "*", "/"};
    String s;
    boolean func = false; //для проверки значения на диапазон арифметических значений

    public ArithmeticOperation(String s) {
        this.s = s;
        func = Arrays.asList(functions).contains(s);
    }

    public static void launch(Numbers first, Numbers second, ArithmeticOperation function) {
        int result = 0;
        if ((function.func && first.arab && second.arab) || (function.func && first.rome && second.rome)) {
            if (function.s.equals("+")) result = addition(first.i, second.i);
            else if (function.s.equals("-")) result = subtraction(first.i, second.i);
            else if (function.s.equals("*")) result = multiplication(first.i, second.i);
            else if (function.s.equals("/")) result = division(first.i, second.i);
            if (first.rome) System.out.println(arabToRome(result));
            else System.out.println(result);
        } else
            System.out.println("В вашем выражении допушены ошибки, которые идут вразрез с задачами калькулятора. Попробуйте снова.");
    }

    public static int addition(int frst, int scnd) {
        return frst + scnd;
    }

    public static int subtraction(int frst, int scnd) {
        return frst - scnd;
    }

    public static int multiplication(int frst, int scnd) {
        return frst * scnd;
    }

    public static int division(int frst, int scnd) {
        return frst / scnd;
    }

    public static String arabToRome(int i) {
        String roman = "";
        while (i >= 100) {
            roman += "C";
            i -= 100;
        }
        while (i >= 50) {
            roman += "L";
            i -= 50;
        }
        while (i >= 10) {
            roman += "X";
            i -= 10;
        }
        while (i >= 5) {
            roman += "V";
            i -= 5;
        }
        while (i >= 1) {
            roman += "I";
            i -= 1;
        }

        roman = roman.replace("IIII", "IV");
        roman = roman.replace("VIV", "IX");
        roman = roman.replace("XXXX", "XL");
        roman = roman.replace("LXL", "XC");

        return roman;
    }
}
