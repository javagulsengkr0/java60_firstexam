package if_else;

import java.util.Scanner;

public class runner3 {

	public static void main(String[] args) {
		// pin ile giri� yapan yanl�� girildi�inde puk kodu isteyen sistemin kodu

		int pin = 1234;
		int puk = 56789;
		Scanner sc = new Scanner(System.in);
		System.out.println("l�tfen pin kodunu giriniz...");
		int pin1 = sc.nextInt();
		if (pin1 == pin) {
			System.out.println("giri� yap�ld�");

		} else {
			for (int i = 0; i < 4; i++) {
				System.out.println("l�tfen tekrar deneyiniz");

				if (pin1 == pin) {
					System.out.println("giri� yap�ld�");
				} else
					System.out.println("l�tfen puk kodunu giriniz desin");
			}

		}
		int puk1 = sc.nextInt();
		if (puk1 == puk) {
			System.out.println("giri� yap�ld�");

		} else
			System.out.println("giri� i�in t�m haklar�n�z sonland�r�ld�");
	}

}
