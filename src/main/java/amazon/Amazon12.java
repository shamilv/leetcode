package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Amazon12 {
    public String intToRoman(int num) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> e: entries) {
            e.getKey()
        }
        Collections.sort(new ArrayList<>(entries), (a, b) -> b.getKey() - a.getKey());
        StringBuilder builder = new StringBuilder();
        while (num > 0) {
            if (num >= 1000) {
                builder.append("M");
                num -= 1000;
            } else if (num >= 900) {
                builder.append("CM");
                num -= 900;
            } else if (num >= 500) {
                builder.append("D");
                num -= 500;
            } else if (num >= 400) {
                builder.append("CD");
                num -= 400;
            } else if (num >= 100) {
                builder.append("C");
                num -= 100;
            } else if (num >= 90) {
                builder.append("XC");
                num -= 90;
            } else if (num >= 50) {
                builder.append("L");
                num -= 50;
            } else if (num >= 40) {
                builder.append("XL");
                num -= 40;
            } else if (num >= 10) {
                builder.append("X");
                num -= 10;
            } else if (num == 9) {
                builder.append("IX");
                num -= 9;
            } else if (num >= 5) {
                builder.append("V");
                num -= 5;
            } else if (num == 4) {
                builder.append("IV");
                num -= 4;
            } else if (num >= 1) {
                builder.append("I");
                num -= 1;
            } 
            
        }
        return builder.toString();
    }
}