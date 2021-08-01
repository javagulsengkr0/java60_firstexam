package if_else;

import java.util.Scanner;

public class Runner2 {

	public static void main(String[] args) {
	
		//girilen sayýnýn tekliðini çiftliðini analiz eden program kodu
		Scanner sc=new Scanner (System.in);
		System.out.println("lütfen analiz edilecek sayýyý giriniz...");
		int sayi=sc.nextInt();
		if(sayi%2==0) {
			System.out.println("sayi çiftir");
			
		}
		else {
			System.out.println("sayi tektir");
		}
		
		
		
		}//class sonu

}//main sonu
