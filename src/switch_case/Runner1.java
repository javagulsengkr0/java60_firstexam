package switch_case;
import java.util.Scanner;
public class Runner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	        Scanner giris = new Scanner(System.in);
	        int i;

	        System.out.println("SA�LI�INIZ ���N BURADAYIZ");
	        System.out.println("(1) �OCUK POL�KL�N���");
	        System.out.println("(2) YET��K�N POL�KL�N���");
	        System.out.println("(3) GER�ATR� POL�KL�N���");
	        System.out.println("SE��M�N�Z?");
	        i = giris.nextInt();

	        switch (i) {
	        case 1 :
	            System.out.println("A BLOK 3.KAT");
	            System.out.println("DR G�L SEV�N�");
	            break;

	        case 2 :
	            System.out.println("A BLOK 8. KAT");
	            System.out.println("DR.SERKAN �ALI�");
	            break;

	        case 3 :
	            System.out.println("B BLOK 5. KAT");
	            System.out.println("DR.EDA G�K");
	            
	            break;

	        default :
	            System.out.println("HATALI SE��M YAPTINIZ!!L�TFEN 1,2 VEYA"
	            		+ " 3 SE��N�Z.");
	            break;
	        }
	}
	}

