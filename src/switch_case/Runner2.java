package switch_case;

import java.util.Scanner;

public class Runner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hesap makinasi kodu
	 Scanner sc= new Scanner (System.in);
	 System.out.println("lütfen yapmak istediðniz iþlemi seçiniz");
	 int secim=sc.nextInt();
	
	 System.out.println("1. sayiyi giriniz");
	 int sayi1=sc.nextInt();
	 System.out.println("2.sayiyi giriniz");
	 int sayi2=sc.nextInt();
	 
	 switch (secim) {
	case 1:
		System.out.println("toplam sonuc="+(sayi1+sayi2));
		break;
	case 2:
		System.out.println("çýkarma sonuc="+(sayi1-sayi2));
		break; 
	case 3:
		System.out.println("çarpma sonuc="+(sayi1*sayi2));
		break;
	case 4:
	System.out.println("bölme sonuc="+(sayi1/sayi2));
	    break;
	default:
		System.out.println("hatalý seçim!");
		break;
	}
		

	}

}
