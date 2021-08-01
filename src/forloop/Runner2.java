package forloop;

import java.util.Scanner;

public class Runner2 {
	
	//belirtilen sayýya kadar olan sayýlarýn faktoriyelini bularak toplama yapma kodu:

	public static void main(String[] args) {
		 Scanner giris = new Scanner(System.in);
	        int n, faktoriyel;
	        int i;
            int toplam=0;
	        System.out.println("lütfen Sayi Giriniz ");
	        n = giris.nextInt();

	        faktoriyel = 1;

	        for (i = 1; i <= n; i++) {
	            faktoriyel = faktoriyel * i;
	            toplam=toplam+faktoriyel;
	           
	        }
	           
	          
	           System.out.println(toplam);
	           
	            
	      
	     
		
		
		
		

	}//main sonu

}//class sonu
