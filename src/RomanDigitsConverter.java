/**
 * Created by covigo on 22.09.2019.
 */
public class RomanDigitsConverter {
    static int convertRomanToArabic (String roman) {

        int arabic = 0;
        String[] romanDigits = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int[] arabicDigits = new int[romanDigits.length];
        int i = 0;
        while (i < romanDigits.length) {
            arabicDigits[i] = i + 1;
            i++;
        }

        int j = 0;

        while (j<romanDigits.length) {
            if (roman.equals(romanDigits[j])) {
                arabic = arabicDigits[j];
            }
            j++;
        }

        return arabic;
    }

}
