package switch_case;

import java.util.Scanner;

public class Runner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// BURÇ YORUMCUSU...
		
		 Scanner sc= new Scanner (System.in);
			System.out.println("*********************************************************************");
			System.out.println("koc,boga,ikizler,yengec,aslan,basak,terazi,akrep,yay,oglak,kova,balik");
		    System.out.println("1   2      3       4      5     6     7      8    9    10   11    12" );
		    System.out.println("*********************************************************************");
		 System.out.println("BURCUNUZA KARÞILIK GELEN TUÞLAMAYI YAPINIZ...");
		int secim=sc.nextInt();
	
		 switch (secim) {
		
		case 1:
			System.out.println(" KOÇ=Enerjik, atak, cesur, lider özelliði taþýyan, "
					+ "saðlam iradeli, hýrslý. bencil, egemen,"
					+ " baðýmsýz karakterli, çabuk sinirlenen, sabýrsýz, kavgacý.");
			
			break;
			case 2:
				System.out.println("BOÐA=Düzenli yaþam seven, tutkularýna sarýlan,"
						+ " pratik, güvenilir, sabýrlý, iþ yaþamýnda uyumlu, "
						+ "sistemli, zenginliði ve iyi yaþamý seven, midesine "
						+ "düþkün, soðukkanlý, iradeli, sadýk, sevecen, tutucu, inatçý.");
				break;
			case 3:
				System.out.println("ÝKÝZLER=Akýllý, uyumlu, her iþe yatkýn, entelektüel,"
						+ " mantýklý, canlý, konuþkan, hareketli, yabancý dillere yetenekli,"
						+ " zamana uyan, heyecanlý, deðiþken, huzursuz, kurnaz, meraklý, kararsýz.");
				break;
			case 4:
				System.out.println("YENGEÇ=Ýnatçý, sabýrlý, duyarlý, iyi kalpli, sevimli, hayal gücü yüksek,"
						+ " koruyucu, vatansever, becerikli, zeki, evcimen, heyecanlý, alýngan, "
						+ "çabuk sinirlenen, deðiþken, somurtkan, baðýþlamaz, dengesiz.");
				break;
			case 5:
				System.out.println("ASLAN= Neþeli, umutlu, yüce gönüllü, eli açýk, yaratýcý, coþkun,"
						+ " heyecanlý, geniþ düþünceli, kendini beðenmiþ, sabit fikirli, kibirli.");
				break;
			case 6:
				System.out.println("BAÞAK=Telaþlý olmayan, rahat, kavgadan ve tartýþmadan kaçýnan,"
						+ " ayýrt edici, inceleyici, dürüst, düzenli, titiz, dakik, kuruntulu,"
						+ " ince eleyip sýk dokuyan, geleneklere baðlý, önemsiz konularda fazla duran.");
				break;
			case 7:
				System.out.println("TERAZÝ=Dürüst, kurallara baðlý, uyumlu, büyüleyici, insanlarla iyi geçinen, "
						+ "duygusal, diplomatik, kararsýz, kinci, kolay etkilenen, saf, temiz ruhlu.");
				break;
			case 8:
				System.out.println("AKREP=Saðlam iradeye sahip, kararlý, güçlü, sezgi gücü yüksek,"
						+ " anlayýþlý, yardýmsever, kýskanç, dik kafalý, kinci, inatçý, kuþkucu.");
				break;
			case 9:
				System.out.println("YAY=Açýk sözlü, dürüst, iyimser, güleryüzlü, açýk düþünceli,"
						+ " uyumlu, felsefe ve yargý yeteneði olan, özgürlüðü seven, güvenilir,"
						+ " olaylarý abartýcý, huzursuz, aþýrý uçlarda yaþayan, kaprisli.");
				break;
			case 10:
				System.out.println("OÐLAK=Nazik, sevimli, güvenilir, kararlý, tutkulu, özenli, "
						+ "düzenli, sabýrlý, disiplinli, katý görünüþlü, çok kesin tavýrlý, tutucu.");
				break;
			case 11:
				System.out.println(" KOVA=Heyecanlý, insancýl, baðýmsýz, yaratýcý, ileri görüþlü,"
						+ " arkadaþ canlýsý, dik kafalý.");
				break;
			case 12:
				System.out.println("BALIK= Anlaþýlmasý zor, sevimli, duygusal, duyarlý,"
						+ " uyumlu, kolay etkilenen, iyi kalpli, anlayýþlý, heyecanlý,"
						+ " gizliliði seven, kararsýz, kolay etkilenen.");
				break;
			
		 	default:
		 		System.err.println("HATALI SEÇÝM YAPTINIZ!");
		 	
			
		}
		 
		
		 
		
	}
}