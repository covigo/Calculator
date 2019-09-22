/**
 * Created by covigo on 14.09.2019.
 */



public class Calculator {
    public static void main (String [] args) {

 String message0 = "Пожалуйста, введите числа от 1 до 10 или от I до X через знак математического действия: +, -, *, /. ";
 String message1 = "Пример 1: 1 + 2. ";
 String message2 = "Пример 2: VI / III.";
 String message3 = "Недопустимый ввод. ";

 System.out.println("Здравствуйте! " + message0);
 System.out.println(message1);
 System.out.println(message2);


        try {
            ScannerTesterPrinter.scanTestPrint();
        }
        catch (IncorrectInputFormatException iIFEx) {
            System.out.println(message3 + message0 + message1 + message2);
        }


    }
}


