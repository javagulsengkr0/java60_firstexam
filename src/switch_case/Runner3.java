package switch_case;

import java.util.Scanner;

public class Runner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// BUR� YORUMCUSU...
		
		 Scanner sc= new Scanner (System.in);
			System.out.println("*********************************************************************");
			System.out.println("koc,boga,ikizler,yengec,aslan,basak,terazi,akrep,yay,oglak,kova,balik");
		    System.out.println("1   2      3       4      5     6     7      8    9    10   11    12" );
		    System.out.println("*********************************************************************");
		 System.out.println("BURCUNUZA KAR�ILIK GELEN TU�LAMAYI YAPINIZ...");
		int secim=sc.nextInt();
	
		 switch (secim) {
		
		case 1:
			System.out.println(" KO�=Enerjik, atak, cesur, lider �zelli�i ta��yan, "
					+ "sa�lam iradeli, h�rsl�. bencil, egemen,"
					+ " ba��ms�z karakterli, �abuk sinirlenen, sab�rs�z, kavgac�.");
			
			break;
			case 2:
				System.out.println("BO�A=D�zenli ya�am seven, tutkular�na sar�lan,"
						+ " pratik, g�venilir, sab�rl�, i� ya�am�nda uyumlu, "
						+ "sistemli, zenginli�i ve iyi ya�am� seven, midesine "
						+ "d��k�n, so�ukkanl�, iradeli, sad�k, sevecen, tutucu, inat��.");
				break;
			case 3:
				System.out.println("�K�ZLER=Ak�ll�, uyumlu, her i�e yatk�n, entelekt�el,"
						+ " mant�kl�, canl�, konu�kan, hareketli, yabanc� dillere yetenekli,"
						+ " zamana uyan, heyecanl�, de�i�ken, huzursuz, kurnaz, merakl�, karars�z.");
				break;
			case 4:
				System.out.println("YENGE�=�nat��, sab�rl�, duyarl�, iyi kalpli, sevimli, hayal g�c� y�ksek,"
						+ " koruyucu, vatansever, becerikli, zeki, evcimen, heyecanl�, al�ngan, "
						+ "�abuk sinirlenen, de�i�ken, somurtkan, ba���lamaz, dengesiz.");
				break;
			case 5:
				System.out.println("ASLAN= Ne�eli, umutlu, y�ce g�n�ll�, eli a��k, yarat�c�, co�kun,"
						+ " heyecanl�, geni� d���nceli, kendini be�enmi�, sabit fikirli, kibirli.");
				break;
			case 6:
				System.out.println("BA�AK=Tela�l� olmayan, rahat, kavgadan ve tart��madan ka��nan,"
						+ " ay�rt edici, inceleyici, d�r�st, d�zenli, titiz, dakik, kuruntulu,"
						+ " ince eleyip s�k dokuyan, geleneklere ba�l�, �nemsiz konularda fazla duran.");
				break;
			case 7:
				System.out.println("TERAZ�=D�r�st, kurallara ba�l�, uyumlu, b�y�leyici, insanlarla iyi ge�inen, "
						+ "duygusal, diplomatik, karars�z, kinci, kolay etkilenen, saf, temiz ruhlu.");
				break;
			case 8:
				System.out.println("AKREP=Sa�lam iradeye sahip, kararl�, g��l�, sezgi g�c� y�ksek,"
						+ " anlay��l�, yard�msever, k�skan�, dik kafal�, kinci, inat��, ku�kucu.");
				break;
			case 9:
				System.out.println("YAY=A��k s�zl�, d�r�st, iyimser, g�lery�zl�, a��k d���nceli,"
						+ " uyumlu, felsefe ve yarg� yetene�i olan, �zg�rl��� seven, g�venilir,"
						+ " olaylar� abart�c�, huzursuz, a��r� u�larda ya�ayan, kaprisli.");
				break;
			case 10:
				System.out.println("O�LAK=Nazik, sevimli, g�venilir, kararl�, tutkulu, �zenli, "
						+ "d�zenli, sab�rl�, disiplinli, kat� g�r�n��l�, �ok kesin tav�rl�, tutucu.");
				break;
			case 11:
				System.out.println(" KOVA=Heyecanl�, insanc�l, ba��ms�z, yarat�c�, ileri g�r��l�,"
						+ " arkada� canl�s�, dik kafal�.");
				break;
			case 12:
				System.out.println("BALIK= Anla��lmas� zor, sevimli, duygusal, duyarl�,"
						+ " uyumlu, kolay etkilenen, iyi kalpli, anlay��l�, heyecanl�,"
						+ " gizlili�i seven, karars�z, kolay etkilenen.");
				break;
			
		 	default:
		 		System.err.println("HATALI SE��M YAPTINIZ!");
		 	
			
		}
		 
		
		 
		
	}
}