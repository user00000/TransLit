package ru.disgroup.extrimistList.TransLiterations.Run;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class Transliterations_USA {

    private static final Map<Character, String> charMap = new HashMap<Character, String>();
    private static final Set<Character> glasnye = new HashSet<Character>();
    private static final Set<Character> soft_hard = new HashSet<Character>();
    private static final Set<Character> symbol = new HashSet<Character>();
    
    static { 
    	
    	glasnye.add('À');
    	glasnye.add('Ó');
    	glasnye.add('Î');
    	glasnye.add('Û');
    	glasnye.add('È');
    	glasnye.add('İ');
    	glasnye.add('ß');
    	glasnye.add('Ş');
    	glasnye.add('¨');
    	glasnye.add('Å');
    	
    }

    
    static {
    	
    	soft_hard.add('Ü');
    	soft_hard.add('Ú');
    }
   
    
    
    static {
    	symbol.add(' ');
    	symbol.add('-');
    	
    }
    
   
    static {
        charMap.put('À', "A");
        charMap.put('Á', "B");
        charMap.put('Â', "V");
        charMap.put('Ã', "G");
        charMap.put('Ä', "D");
        charMap.put('Å', "E");  //YE
        charMap.put('¨', "E");  //YE
        charMap.put('Æ', "ZH");
        charMap.put('Ç', "Z");
        charMap.put('È', "I");
        charMap.put('É', "Y");
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
        charMap.put('Ş', "YU");
        charMap.put('ß', "YA");
        charMap.put('à', "a");
        charMap.put('á', "b");
        charMap.put('â', "v");
        charMap.put('ã', "g");
        charMap.put('ä', "d");
        charMap.put('å', "e");  //ye
        charMap.put('¸', "e");  //ye
        charMap.put('æ', "zh");
        charMap.put('ç', "z");
        charMap.put('è', "i");
        charMap.put('é', "y");
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
        charMap.put('û', "y");
        charMap.put('ü', "");
        charMap.put('ı', "e");
        charMap.put('ú', "");
        charMap.put('ş', "ya");
        charMap.put('ÿ', "ya");

    }

    public String transliterate(String string) {
    	
    	Character previousChar = null;
    	
        StringBuilder transliteratedString = new StringBuilder();
        
        for (int i = 0; i < string.length(); i++) {
        	
        	
        	String charFromMap = null;
        	Character ch = string.charAt(i);
     
        	
        	
        	switch (ch){
        	
        	case 'å': 
        	
        		if(glasnye.contains(Character.toUpperCase(previousChar)) || soft_hard.contains(Character.toUpperCase(previousChar)) 
        				|| symbol.contains(Character.toUpperCase(previousChar)) || previousChar == null) {
          			
        			charFromMap = "ye";
        			
        		} else 
        			charFromMap = charMap.get(ch);
        		
        		break;
        	
        	case 'Å' :
        		
                 if(glasnye.contains(Character.toUpperCase(previousChar)) || soft_hard.contains(Character.toUpperCase(previousChar))
                	 || symbol.contains(Character.toUpperCase(previousChar)) || previousChar == null) {
          			
        			charFromMap = "YE";
        			
        		}  else 
        			charFromMap = charMap.get(ch);
        		
        		break;
        	
        	case '¸' :
        			
                if(glasnye.contains(Character.toUpperCase(previousChar)) || soft_hard.contains(Character.toUpperCase(previousChar))
                		|| symbol.contains(Character.toUpperCase(previousChar)) || previousChar == null) {
          			
        			charFromMap = "ye";
        			
        		} else 
        			charFromMap = charMap.get(ch);
        		
        		break;
        		
        	case '¨' :

                if(glasnye.contains(Character.toUpperCase(previousChar)) || soft_hard.contains(Character.toUpperCase(previousChar))
                		|| symbol.contains(Character.toUpperCase(previousChar)) || previousChar == null) {
          			
       			charFromMap = "YE";
       			
       		} else 
       			charFromMap = charMap.get(ch);
                
        		break;
        	
        	
        	default:
       	
           	 charFromMap = charMap.get(ch);
        	 break;
        	
        	}
        	
        	
        	
        	
        	
            
            if (charFromMap == null) {
                transliteratedString.append(ch);
            } else {
                transliteratedString.append(charFromMap);
            }
            
            previousChar = ch;
            
        }
        return transliteratedString.toString();
    }
}
