import com.sun.jdi.connect.LaunchingConnector;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] expression = new String[3];
        System.out.println("Введите выражение для расчета:");

        for (int i = 0; i < 3; i++) {
            expression[i] = scanner.next();
        }
        scanner.close();

        Numbers first = new Numbers(expression[0]);
        Numbers second = new Numbers(expression[2]);
        ArithmeticOperation function = new ArithmeticOperation(expression[1]);
        ArithmeticOperation.launch(first, second, function);
    }
}
