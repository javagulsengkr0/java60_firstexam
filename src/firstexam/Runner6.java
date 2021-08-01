package firstexam;

import java.util.Random;
import java.util.Scanner;

public class Runner6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// s6- Aþaðýda örnek verilen yapý ile bir oyun yapýn.
				// kullanýcýnýn 3 hakký olacak sayý tahmin edecek.
		        // son hakký bittiðinde kaç yaklaþýk bulduðunu yazýnýz.-->****YAPAMADIM*****
				// not: sayý 60 olsun: k. 32, yanlýþ, yukarý

				Random rastgele = new Random();
				int r = rastgele.nextInt(100);
				System.out.println(r);

				Scanner sc = new Scanner(System.in);
				System.out.println("SAYI TAHMÝNÝ YAPINIZ...");
				int sayi1 = sc.nextInt();

				if (sayi1 == r) {
					System.out.println("DOÐRU TAHMÝN.");
				}

				else {
					System.err.println("HATALI TAHMÝN YAPTINIZ!");
					if(sayi1<=r) {
						System.out.println("ÝPUCU : SAYINIZI BÜYÜLTÜNÜZ");
					}
					else {
						System.out.println("ÝPUCU : SAYINIZI KÜÇÜLTÜNÜZ");
					}

					System.out.println("YENÝ SAYÝ TAHMÝNÝ...");
					int sayi2 = sc.nextInt();
					if (sayi2 == r) {
						System.out.println("DOÐRU TAHMÝN");
					} else {
						System.err.println("HATALI TAHMÝN YAPTINIZ!");
						
						if(sayi2<=r) {
							System.out.println("ÝPUCU : SAYINIZI BÜYÜLTÜNÜZ");
						}
						else {
							System.out.println("ÝPUCU : SAYINIZI KÜÇÜLTÜNÜZ");
						}

						System.out.println("YENÝ SAYI TAHMÝNÝ...");
						int sayi3 = sc.nextInt();
						if (sayi3 == r) {
							System.out.println("DOÐRU TAHMÝN");
						}
						else {
							System.out.println("HATALI SEÇÝM!");
							System.err.println("KAYBETTÝNÝZ!");
						}
					}
				}

	}

}
