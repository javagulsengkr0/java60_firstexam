package firstexam;

import java.util.Random;
import java.util.Scanner;

public class Runner6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// s6- A�a��da �rnek verilen yap� ile bir oyun yap�n.
				// kullan�c�n�n 3 hakk� olacak say� tahmin edecek.
		        // son hakk� bitti�inde ka� yakla��k buldu�unu yaz�n�z.-->****YAPAMADIM*****
				// not: say� 60 olsun: k. 32, yanl��, yukar�

				Random rastgele = new Random();
				int r = rastgele.nextInt(100);
				System.out.println(r);

				Scanner sc = new Scanner(System.in);
				System.out.println("SAYI TAHM�N� YAPINIZ...");
				int sayi1 = sc.nextInt();

				if (sayi1 == r) {
					System.out.println("DO�RU TAHM�N.");
				}

				else {
					System.err.println("HATALI TAHM�N YAPTINIZ!");
					if(sayi1<=r) {
						System.out.println("�PUCU : SAYINIZI B�Y�LT�N�Z");
					}
					else {
						System.out.println("�PUCU : SAYINIZI K���LT�N�Z");
					}

					System.out.println("YEN� SAY� TAHM�N�...");
					int sayi2 = sc.nextInt();
					if (sayi2 == r) {
						System.out.println("DO�RU TAHM�N");
					} else {
						System.err.println("HATALI TAHM�N YAPTINIZ!");
						
						if(sayi2<=r) {
							System.out.println("�PUCU : SAYINIZI B�Y�LT�N�Z");
						}
						else {
							System.out.println("�PUCU : SAYINIZI K���LT�N�Z");
						}

						System.out.println("YEN� SAYI TAHM�N�...");
						int sayi3 = sc.nextInt();
						if (sayi3 == r) {
							System.out.println("DO�RU TAHM�N");
						}
						else {
							System.out.println("HATALI SE��M!");
							System.err.println("KAYBETT�N�Z!");
						}
					}
				}

	}

}
