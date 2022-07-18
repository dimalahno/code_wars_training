package kata6;

import java.util.TreeMap;

public class RomanNumeralConverter {

    private final TreeMap<Integer, String> romaNumber = new TreeMap<>();

    public RomanNumeralConverter() {
        romaNumber.put(1000, "M");
        romaNumber.put(900, "CM");
        romaNumber.put(500, "D");
        romaNumber.put(400, "CD");
        romaNumber.put(100, "C");
        romaNumber.put(90, "XC");
        romaNumber.put(50, "L");
        romaNumber.put(40, "XL");
        romaNumber.put(10, "X");
        romaNumber.put(9, "IX");
        romaNumber.put(5, "V");
        romaNumber.put(4, "IV");
        romaNumber.put(1, "I");
    }

    public String convert(int number) {
        int l = romaNumber.floorKey(number);

        if (number == l) {
            return romaNumber.get(number);
        }
        return romaNumber.get(l) + convert(number - l);
    }
}
