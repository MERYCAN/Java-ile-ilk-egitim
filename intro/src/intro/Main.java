package intro;

public class Main {

	public static void main(String[] args) {
	 //main java başlangic noktasidir
	   System.out.println("Hello World!");
       String metin= "naber la";
       String altmetin = "vade süresi";
    		   
    	//değişken isimleri camilCase yazılır
       
       System.out.println(metin);
      //tam sayılar int
       
       int vade = 12 ;
       
       double dolarDun = 18.14;
       double dolarBugun = 18.30; 

   
     boolean dolarDustuMu = false ;
     
     
    		 
     if (dolarBugun<dolarDun) { //true
    	 String okYonu = "down.svg";
    	 System.out.println(okYonu);
		
       }else if(dolarBugun>dolarDun) {
    	   String okYonu= "up.svg";
           System.out.println(okYonu);
    	   
    	   
       }
     
     else {
    	String okYonu = "equal.svg";
    			
    System.out.println(okYonu);
		
   }
	System.out.println("------------------------------------------------");
	//array listeler
     
     String [] krediler = {"Hızlı Kredi","maaşını halk banktan alanlar","emekli"};
     for (int i = 0; i < krediler.length; i++) {
    	System.out.println(krediler[i]);
		
	}
     
	
	
	
	System.out.println(31);
	}
}
     
	



