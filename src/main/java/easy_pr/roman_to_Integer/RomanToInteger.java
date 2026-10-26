package easy_pr.roman_to_Integer;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> values = new HashMap<>();
    static {
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
    }

    public int romanToInt(String s) {
        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int curr = values.get(s.charAt(i));
            if (i + 1 < n && curr < values.get(s.charAt(i + 1))) {
                total -= curr;
            } else {
                total += curr;
            }
        }

        return total;
    }
}
