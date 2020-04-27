import java.util.Arrays;

public class Numbers {
    public String[] digits1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public String[] digits2 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    int i;
    boolean arab; //для проверки значения на диапазон арабских чисел
    boolean rome; //для проверки значения на диапазон римских чисел

    public Numbers(String s) {
        arab = Arrays.asList(digits1).contains(s);
        rome = Arrays.asList(digits2).contains(s);

        if (arab) {
            i = Integer.parseInt(s);
        } else if (rome) {
            int j = 0;
            while (j < digits2.length) {
                if (s.equals(digits2[j])) {
                    i = j + 1;
                    break;
                }
                j++;
            }
        }
    }
}