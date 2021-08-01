package firstexam;

import java.util.Scanner;

public class Runner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// s1-Kullancýnýn girmiþ olduðu bir sayý listesinde en büyük ve en küçük sayýlarý bulan program.ý
		
				Scanner sc = new Scanner(System.in);
				int[]a;
				System.out.println("*****************************");
				System.out.println("*en büyük sayý-en küçük sayý*");
				System.out.println("*****************************");
				System.out.println();
				
				System.out.println("kaç sayi gireceksiniz?");
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
		}
		System.out.println("en kücük sayi="+a[0]);
		System.out.println("en büyük sayi="+a[sayiadedi-1]);
			}
		}
			
				

