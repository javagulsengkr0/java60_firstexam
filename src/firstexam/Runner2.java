package firstexam;

import java.util.Scanner;

public class Runner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// s2-Bir dizinin i�indeki say�lar� s�ralamak
				Scanner sc = new Scanner(System.in);
				int[]a;
				System.out.println("****************");
				System.out.println("*s�ral� say�lar*");
				System.out.println("****************");
				System.out.println();
				
				System.out.println("ka� sayi gireceksiniz?");
				int sayiadedi=sc.nextInt();
				a=new int[sayiadedi];
				for(int i=0;i<sayiadedi;i++) {
					System.out.println((i+1)+".sayiyi giriniz");
					a[i]=sc.nextInt();
				}
				for(int j=0;j<a.length-1;j++) {
					for(int i=0;i<a.length-1;i++) {
						if(a[i]>a[i+1]) {
							int temp=a[i];
							a[i]=a[i+1];
							a[i+1]=temp;
						}
					}
				}		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
				

		

	}

}
