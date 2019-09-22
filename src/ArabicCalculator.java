/**
 * Created by covigo on 15.09.2019.
 */


public class ArabicCalculator {

    static int arabicCalculatorResult = 0;

    static int calculate(int a, String o, int b) {
        if (o.equals("+")) {
            arabicCalculatorResult = a + b;
        }

        if (o.equals("-")) {
            arabicCalculatorResult = a - b;
        }

        if (o.equals("*")) {
            arabicCalculatorResult = a * b;
        }

        if (o.equals("/")) {
            arabicCalculatorResult = a / b;
        }

        return arabicCalculatorResult;

    }
}

