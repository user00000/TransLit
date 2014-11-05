package ru.disgroup.extrimistList.TransLiterations.Run;

import java.util.HashMap;
import java.util.Map;

public class Transliterations_2010 {

    private static final Map<Character, String> charMap = new HashMap<Character, String>();

    static {
        charMap.put('�', "A");
        charMap.put('�', "B");
        charMap.put('�', "V");
        charMap.put('�', "G");
        charMap.put('�', "D");
        charMap.put('�', "E");
        charMap.put('�', "E");
        charMap.put('�', "ZH");
        charMap.put('�', "Z");
        charMap.put('�', "I");
        charMap.put('�', "I");
        charMap.put('�', "K");
        charMap.put('�', "L");
        charMap.put('�', "M");
        charMap.put('�', "N");
        charMap.put('�', "O");
        charMap.put('�', "P");
        charMap.put('�', "R");
        charMap.put('�', "S");
        charMap.put('�', "T");
        charMap.put('�', "U");
        charMap.put('�', "F");
        charMap.put('�', "KH");
        charMap.put('�', "TS");
        charMap.put('�', "CH");
        charMap.put('�', "SH");
        charMap.put('�', "SHCH");
        charMap.put('�', "Y");
        charMap.put('�', "");
        charMap.put('�', "E");
        charMap.put('�', "");
        charMap.put('�', "IU");
        charMap.put('�', "IA");
        charMap.put('�', "a");
        charMap.put('�', "b");
        charMap.put('�', "v");
        charMap.put('�', "g");
        charMap.put('�', "d");
        charMap.put('�', "e");
        charMap.put('�', "e");
        charMap.put('�', "zh");
        charMap.put('�', "z");
        charMap.put('�', "i");
        charMap.put('�', "i");
        charMap.put('�', "k");
        charMap.put('�', "l");
        charMap.put('�', "m");
        charMap.put('�', "n");
        charMap.put('�', "o");
        charMap.put('�', "p");
        charMap.put('�', "r");
        charMap.put('�', "s");
        charMap.put('�', "t");
        charMap.put('�', "u");
        charMap.put('�', "f");
        charMap.put('�', "kh");
        charMap.put('�', "ts");
        charMap.put('�', "ch");
        charMap.put('�', "sh");
        charMap.put('�', "shch");
        charMap.put('�', "");
        charMap.put('�', "y");
        charMap.put('�', "");
        charMap.put('�', "e");
        charMap.put('�', "iu");
        charMap.put('�', "ia");

    }

    public String transliterate(String string) {
        StringBuilder transliteratedString = new StringBuilder();
        
        for (int i = 0; i < string.length(); i++) {
            
        	Character ch = string.charAt(i);
            
        	String charFromMap = charMap.get(ch);
            
            if (charFromMap == null) {
                transliteratedString.append(ch);
            } else {
                transliteratedString.append(charFromMap);
            }
        }
        return transliteratedString.toString();
    }
}
