package firstexam;

import java.util.Scanner;

public class Runner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// s5- kullanýcýdan girdi ile Ýçi boþ olan kare oluþturun 
					// * * *
					// *   *
					// * * *
			Scanner sc=new Scanner(System.in);
			System.out.println("yildiz sayisini belirtiniz?");
			int yildiz=sc.nextInt();
			for (int j=1; j<=yildiz; j++){
				System.out.print("* ");
			}
			System.out.println("");
			
			for (int i=1; i<=yildiz-2; i++) {
				System.out.print("* ");
				for (int j=1; j<=yildiz-2; j++)
				{
					System.out.print("  ");
				}
				System.out.println("*");
			}
			for (int j=1; j<=yildiz; j++){
				System.out.print("* ");
			}
			}// main Sonu
		}// Class Sonu