package simpleTransliterations;

import org.junit.Ignore;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;



import ru.disgroup.extrimistList.TransLiterations.Run.Transliterations_2010;
import ru.disgroup.extrimistList.TransLiterations.Run.Transliterations_USA;

public class Transliterations_USA_test {

	
	Transliterations_2010  smplTr = null;
	Transliterations_USA   tr_usa = null;
	
	@BeforeMethod 
	public void createclass(){
		
	   smplTr =  new Transliterations_2010();
	   
	   tr_usa = new Transliterations_USA();
	   
	   Character ch ='к';
	   
	  // System.out.println(Character.toUpperCase(ch) + " "+ ch);
	   
	}
	
	 
	    @Ignore
	    public void simpleTr(){
	    	
	    System.out.println(smplTr.transliterate("Транслитерация"));
	    System.out.println(smplTr.transliterate("Ж ЖЖЖ жж жж TR"));
	    System.out.println(smplTr.transliterate("ЙОд"));
	    System.out.println(smplTr.transliterate("Уважаемый Абдул Об Стулл Аббей"));
	    System.out.println(smplTr.transliterate("Здравствуйте Пожалуйста "));
	    System.out.println(smplTr.transliterate("123 345 54-8 9-9 ="));
	    System.out.println(smplTr.transliterate("Мария Марией Марии "));
	    System.out.println(smplTr.transliterate("Её ай ой ух"));
	    System.out.println(smplTr.transliterate("выиграл"));
	    System.out.println(smplTr.transliterate("подъезд"));
	    	
	    	
	    }
	    
	    
	    
	   
	    @Ignore
	    public void trans_usa(){
	    	
	    	System.out.println(tr_usa.transliterate("Транслитерация Анатольевич подьезд"));
	    	System.out.println(tr_usa.transliterate("Ёлкин"));
	    	
	    	
	    }
	    
	    
	    
	    @Test
	    public void after_soft_symbol(){
	    	
	    	assertEquals(tr_usa.transliterate("Анатольевич"),"Anatolyevich");
	    	
	    }


	    
	    @Test
        public void first_e_simbol(){
    	  
    	  assertEquals(tr_usa.transliterate("Ёлкин"),"Yelkin");
    	  
        }

        
        @Test
        public void e_sympol(){
        	assertEquals(tr_usa.transliterate("Планёрная"),"Planernaya");
        }
		
	    
	
}
