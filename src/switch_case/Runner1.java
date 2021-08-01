package switch_case;
import java.util.Scanner;
public class Runner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	        Scanner giris = new Scanner(System.in);
	        int i;

	        System.out.println("SAÐLIÐINIZ ÝÇÝN BURADAYIZ");
	        System.out.println("(1) ÇOCUK POLÝKLÝNÝÐÝ");
	        System.out.println("(2) YETÝÞKÝN POLÝKLÝNÝÐÝ");
	        System.out.println("(3) GERÝATRÝ POLÝKLÝNÝÐÝ");
	        System.out.println("SEÇÝMÝNÝZ?");
	        i = giris.nextInt();

	        switch (i) {
	        case 1 :
	            System.out.println("A BLOK 3.KAT");
	            System.out.println("DR GÜL SEVÝNÇ");
	            break;

	        case 2 :
	            System.out.println("A BLOK 8. KAT");
	            System.out.println("DR.SERKAN ÇALIÞ");
	            break;

	        case 3 :
	            System.out.println("B BLOK 5. KAT");
	            System.out.println("DR.EDA GÖK");
	            
	            break;

	        default :
	            System.out.println("HATALI SEÇÝM YAPTINIZ!!LÜTFEN 1,2 VEYA"
	            		+ " 3 SEÇÝNÝZ.");
	            break;
	        }
	}
	}

