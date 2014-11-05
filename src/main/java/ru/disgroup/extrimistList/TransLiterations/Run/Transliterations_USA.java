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
    	
    	glasnye.add('�');
    	glasnye.add('�');
    	glasnye.add('�');
    	glasnye.add('�');
    	glasnye.add('�');
    	glasnye.add('�');
    	glasnye.add('�');
    	glasnye.add('�');
    	glasnye.add('�');
    	glasnye.add('�');
    	
    }

    
    static {
    	
    	soft_hard.add('�');
    	soft_hard.add('�');
    }
   
    
    
    static {
    	symbol.add(' ');
    	symbol.add('-');
    	
    }
    
   
    static {
        charMap.put('�', "A");
        charMap.put('�', "B");
        charMap.put('�', "V");
        charMap.put('�', "G");
        charMap.put('�', "D");
        charMap.put('�', "E");  //YE
        charMap.put('�', "E");  //YE
        charMap.put('�', "ZH");
        charMap.put('�', "Z");
        charMap.put('�', "I");
        charMap.put('�', "Y");
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
        charMap.put('�', "YU");
        charMap.put('�', "YA");
        charMap.put('�', "a");
        charMap.put('�', "b");
        charMap.put('�', "v");
        charMap.put('�', "g");
        charMap.put('�', "d");
        charMap.put('�', "e");  //ye
        charMap.put('�', "e");  //ye
        charMap.put('�', "zh");
        charMap.put('�', "z");
        charMap.put('�', "i");
        charMap.put('�', "y");
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
        charMap.put('�', "y");
        charMap.put('�', "");
        charMap.put('�', "e");
        charMap.put('�', "");
        charMap.put('�', "ya");
        charMap.put('�', "ya");

    }

    public String transliterate(String string) {
    	
    	Character previousChar = null;
    	
        StringBuilder transliteratedString = new StringBuilder();
        
        for (int i = 0; i < string.length(); i++) {
        	
        	
        	String charFromMap = null;
        	Character ch = string.charAt(i);
     
        	
        	
        	switch (ch){
        	
        	case '�': 
        	
        		if(glasnye.contains(Character.toUpperCase(previousChar)) || soft_hard.contains(Character.toUpperCase(previousChar)) 
        				|| symbol.contains(Character.toUpperCase(previousChar)) || previousChar == null) {
          			
        			charFromMap = "ye";
        			
        		} else 
        			charFromMap = charMap.get(ch);
        		
        		break;
        	
        	case '�' :
        		
                 if(glasnye.contains(Character.toUpperCase(previousChar)) || soft_hard.contains(Character.toUpperCase(previousChar))
                	 || symbol.contains(Character.toUpperCase(previousChar)) || previousChar == null) {
          			
        			charFromMap = "YE";
        			
        		}  else 
        			charFromMap = charMap.get(ch);
        		
        		break;
        	
        	case '�' :
        			
                if(glasnye.contains(Character.toUpperCase(previousChar)) || soft_hard.contains(Character.toUpperCase(previousChar))
                		|| symbol.contains(Character.toUpperCase(previousChar)) || previousChar == null) {
          			
        			charFromMap = "ye";
        			
        		} else 
        			charFromMap = charMap.get(ch);
        		
        		break;
        		
        	case '�' :

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
