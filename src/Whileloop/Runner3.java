package Whileloop;

import java.util.Scanner;

public class Runner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//s�n�r� belirlenen say�lar�n toplam�
				Scanner sinir= new Scanner(System.in);
				System.out.println("L�TFEN N SAY�S�N� BEL�RT�N�Z...");
				double toplam=0;
				int a=0;
				int n=sinir.nextInt();
				while(a<n) {
					a++;
				toplam=toplam+a;	
				}
				System.out.println("toplam="+toplam);
				
	}

}
