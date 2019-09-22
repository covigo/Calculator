import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

/**
 * Created by covigo on 14.09.2019.
 */


public class ScannerTesterPrinter {

        static void scanTestPrint ()
        throws IncorrectInputFormatException

        {
           String trueRomanPattern =  "(I|II|III|IV|V|VI|VII|VIII|IX|X)([\\+|\\-|\\*|\\/])(I|II|III|IV|V|VI|VII|VIII|IX|X)";
           String trueArabicPattern = "(\\d|10)([\\+|\\-|\\*|\\/])(\\d|10)";


            Scanner scanner = new Scanner(System.in);
           // String scannedString;

            while (scanner.hasNextLine()  & (scanner.hasNext(trueArabicPattern) || scanner.hasNext(trueRomanPattern)))

                {
                        if (scanner.hasNext(trueArabicPattern)) {

                        // сверяем с шаблоном требуемых арабских чисел
                        // в итоге сюда попадают только строки, записанные арабскими цифрами

                        // System.out.println("Передача арабских чисел");
                        // строка для проверки работоспособности кода

                        scanner.next(trueArabicPattern);
                        MatchResult match = scanner.match();
                        String stringX = match.group(1);
                        String operations = match.group(2);
                        String stringY = match.group(3);
                        int x = Integer.parseInt(stringX);
                        int y = Integer.parseInt(stringY);

                        System.out.println(ArabicCalculator.calculate(x, operations, y));
                        // вычисление и вывод результата в консоль

                        }

                        else if (scanner.hasNext(trueRomanPattern))

                        // сверяем с шаблоном требуемых римских чисел
                        // в итоге сюда попадают только строки, записанные римскими цифрами
                        {
                            scanner.next(trueRomanPattern);
                            MatchResult match = scanner.match();
                            String stringX = match.group(1);
                            String operations = match.group(2);
                            String stringY = match.group(3);

                            int x = RomanDigitsConverter.convertRomanToArabic(stringX);
                            int y = RomanDigitsConverter.convertRomanToArabic(stringY);

                            // int x = Integer.parseInt(stringX);
                            // int y = Integer.parseInt(stringY);

                            // System.out.println(x);
                            // System.out.println(operations);
                            // System.out.println(y);

                            int arabicResult = ArabicCalculator.calculate(x, operations, y);
                            // вычисление
                            System.out.println(ArabicDigitsConverter.convertArabicToRoman(arabicResult));
                            // преобразование арабских чисел в римские и вывод результата в консоль)

                            // System.out.println("Передача римских чисел");
                            // строка для проверки работоспособности кода

                        }

                    }

            throw new IncorrectInputFormatException ();

        }
    }


