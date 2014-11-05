package ru.disgroup.extrimistList.TransLiterations.Run;

import java.util.HashMap;
import java.util.Map;

public class Transliterations_2010 {

    private static final Map<Character, String> charMap = new HashMap<Character, String>();

    static {
        charMap.put('À', "A");
        charMap.put('Á', "B");
        charMap.put('Â', "V");
        charMap.put('Ã', "G");
        charMap.put('Ä', "D");
        charMap.put('Å', "E");
        charMap.put('¨', "E");
        charMap.put('Æ', "ZH");
        charMap.put('Ç', "Z");
        charMap.put('È', "I");
        charMap.put('É', "I");
        charMap.put('Ê', "K");
        charMap.put('Ë', "L");
        charMap.put('Ì', "M");
        charMap.put('Í', "N");
        charMap.put('Î', "O");
        charMap.put('Ï', "P");
        charMap.put('Ğ', "R");
        charMap.put('Ñ', "S");
        charMap.put('Ò', "T");
        charMap.put('Ó', "U");
        charMap.put('Ô', "F");
        charMap.put('Õ', "KH");
        charMap.put('Ö', "TS");
        charMap.put('×', "CH");
        charMap.put('Ø', "SH");
        charMap.put('Ù', "SHCH");
        charMap.put('Û', "Y");
        charMap.put('Ü', "");
        charMap.put('İ', "E");
        charMap.put('Ú', "");
        charMap.put('Ş', "IU");
        charMap.put('ß', "IA");
        charMap.put('à', "a");
        charMap.put('á', "b");
        charMap.put('â', "v");
        charMap.put('ã', "g");
        charMap.put('ä', "d");
        charMap.put('å', "e");
        charMap.put('¸', "e");
        charMap.put('æ', "zh");
        charMap.put('ç', "z");
        charMap.put('è', "i");
        charMap.put('é', "i");
        charMap.put('ê', "k");
        charMap.put('ë', "l");
        charMap.put('ì', "m");
        charMap.put('í', "n");
        charMap.put('î', "o");
        charMap.put('ï', "p");
        charMap.put('ğ', "r");
        charMap.put('ñ', "s");
        charMap.put('ò', "t");
        charMap.put('ó', "u");
        charMap.put('ô', "f");
        charMap.put('õ', "kh");
        charMap.put('ö', "ts");
        charMap.put('÷', "ch");
        charMap.put('ø', "sh");
        charMap.put('ù', "shch");
        charMap.put('ü', "");
        charMap.put('û', "y");
        charMap.put('ú', "");
        charMap.put('ı', "e");
        charMap.put('ş', "iu");
        charMap.put('ÿ', "ia");

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
