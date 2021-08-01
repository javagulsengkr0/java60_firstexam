package if_else;

import java.util.Scanner;

public class runner3 {

	public static void main(String[] args) {
		// pin ile giriþ yapan yanlýþ girildiðinde puk kodu isteyen sistemin kodu

		int pin = 1234;
		int puk = 56789;
		Scanner sc = new Scanner(System.in);
		System.out.println("lütfen pin kodunu giriniz...");
		int pin1 = sc.nextInt();
		if (pin1 == pin) {
			System.out.println("giriþ yapýldý");

		} else {
			for (int i = 0; i < 4; i++) {
				System.out.println("lütfen tekrar deneyiniz");

				if (pin1 == pin) {
					System.out.println("giriþ yapýldý");
				} else
					System.out.println("lütfen puk kodunu giriniz desin");
			}

		}
		int puk1 = sc.nextInt();
		if (puk1 == puk) {
			System.out.println("giriþ yapýldý");

		} else
			System.out.println("giriþ için tüm haklarýnýz sonlandýrýldý");
	}

}
