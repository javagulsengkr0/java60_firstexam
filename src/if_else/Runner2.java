package if_else;

import java.util.Scanner;

public class Runner2 {

	public static void main(String[] args) {
	
		//girilen say�n�n tekli�ini �iftli�ini analiz eden program kodu
		Scanner sc=new Scanner (System.in);
		System.out.println("l�tfen analiz edilecek say�y� giriniz...");
		int sayi=sc.nextInt();
		if(sayi%2==0) {
			System.out.println("sayi �iftir");
			
		}
		else {
			System.out.println("sayi tektir");
		}
		
		
		
		}//class sonu

}//main sonu
