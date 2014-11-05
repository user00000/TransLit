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
	   
	   Character ch ='�';
	   
	  // System.out.println(Character.toUpperCase(ch) + " "+ ch);
	   
	}
	
	 
	    @Ignore
	    public void simpleTr(){
	    	
	    System.out.println(smplTr.transliterate("��������������"));
	    System.out.println(smplTr.transliterate("� ��� �� �� TR"));
	    System.out.println(smplTr.transliterate("���"));
	    System.out.println(smplTr.transliterate("��������� ����� �� ����� �����"));
	    System.out.println(smplTr.transliterate("������������ ���������� "));
	    System.out.println(smplTr.transliterate("123 345 54-8 9-9 ="));
	    System.out.println(smplTr.transliterate("����� ������ ����� "));
	    System.out.println(smplTr.transliterate("Ÿ �� �� ��"));
	    System.out.println(smplTr.transliterate("�������"));
	    System.out.println(smplTr.transliterate("�������"));
	    	
	    	
	    }
	    
	    
	    
	   
	    @Ignore
	    public void trans_usa(){
	    	
	    	System.out.println(tr_usa.transliterate("�������������� ����������� �������"));
	    	System.out.println(tr_usa.transliterate("�����"));
	    	
	    	
	    }
	    
	    
	    
	    @Test
	    public void after_soft_symbol(){
	    	
	    	assertEquals(tr_usa.transliterate("�����������"),"Anatolyevich");
	    	
	    }


	    
	    @Test
        public void first_e_simbol(){
    	  
    	  assertEquals(tr_usa.transliterate("�����"),"Yelkin");
    	  
        }

        
        @Test
        public void e_sympol(){
        	assertEquals(tr_usa.transliterate("��������"),"Planernaya");
        }
		
	    
	
}
