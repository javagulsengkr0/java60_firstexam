package forloop;

import java.util.Scanner;

public class Runner2 {
	
	//belirtilen say�ya kadar olan say�lar�n faktoriyelini bularak toplama yapma kodu:

	public static void main(String[] args) {
		 Scanner giris = new Scanner(System.in);
	        int n, faktoriyel;
	        int i;
            int toplam=0;
	        System.out.println("l�tfen Sayi Giriniz ");
	        n = giris.nextInt();

	        faktoriyel = 1;

	        for (i = 1; i <= n; i++) {
	            faktoriyel = faktoriyel * i;
	            toplam=toplam+faktoriyel;
	           
	        }
	           
	          
	           System.out.println(toplam);
	           
	            
	      
	     
		
		
		
		

	}//main sonu

}//class sonu
