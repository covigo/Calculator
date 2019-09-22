/**
 * Created by covigo on 15.09.2019.
 */
public class ArabicDigitsConverter {
    public static String convertArabicToRoman (int a) {

        StringBuffer stringBuffer = new StringBuffer();

         String oneRomanDigit;


         String [] romanDigits = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};




        if ((0 < a) & (a < 10) ) {
            oneRomanDigit = romanDigits[a - 1];
        }

        else if (a==0) {
            oneRomanDigit = "NVLL";
        }

        // Нуля в римской системе счёта не было, поэтому заменяем арабское число 0 на новоизобретенное псевдолатинское "NVLL"

        else if (a==100) {
            oneRomanDigit = "C";
        }

        // арабское число "100" будет встречаться лишь в одном случае - если пользователь решит перемножить 10 и 10 или X и X,
        // поэтому сделаем единственное упоминание числа 100 - "C", числа больше 100 на латынь переводить не будем

        else if ((-10 < a) & (a < 0)) {
            a = -1 * a;
        oneRomanDigit = "-" + romanDigits [a-1];
        }

        // отрицательных чисел в римской системе счёта не было,
        // поэтому отрицательные числа по-римски будем указывать как "-III", "-VII" и т.д.
        // самое отрицательное число, которое может получиться в результате четырёх математических действий,
        // перечисленных в задании (+, -, *, /), с числами от 1 до 10, это -9, поэтому ограничимся им

        // далее осуществляется перевод чисел от 11 до 99 из арабской в римскую форму записи



        else {

            int aXC = a/90;
            if (aXC !=0) {
                stringBuffer.append("XC");
            }
            // здесь проверяем: если заданное число равно или больше 90, то записываем в StringBuffer "XC",

            int aPostXC = a % 90;
            // также вычисляем остаток от деления на 90

            int aL = aPostXC / 50;
            if (aL !=0) {
                stringBuffer.append("L");
            }
            // здесь проверяем: если заданное число равно или больше 50, то записываем в StringBuffer "L",

            int aPostL = aPostXC % 50;
            // также вычисляем остаток от деления на 50


            int aXL = aPostL / 10;
            int c = 0;
            while (c < aXL) {
                stringBuffer.append("X");
                if (c==3) {
                    stringBuffer.delete(1,4);
                    stringBuffer.append("L");
                }
            c++;
            }
            int aI = aPostL % 10;
            // здесь вычисляем, сколько в остатке от деления на 50 десяток; остаток от деления на 10

            if (aI > 0) {
                String d = romanDigits[aI - 1];
                stringBuffer.append(d);
            }
            oneRomanDigit = stringBuffer.toString();
            // здесь вычисляем остаток от предыдущих действий

        }
        // System.out.println(oneRomanDigit);
        // данная строка нужна только для проверки работаспособности кода при отладке
        return oneRomanDigit;
    }
}
