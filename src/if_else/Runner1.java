package if_else;

public class Runner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ya�lara g�re muaene odas� belirleme kodu
		int yas = 18;

		if (yas >= 0 && yas < 18) {
			System.out.println("�ocuk poliklini�i,oda-1");
		} else if (yas >= 18 && yas <= 64) {
			System.out.println("yeti�kin poliklini�i,oda-2");
		} else {
			System.out.println("Geriatri poliklini�i,oda-3");
		}

	}

}
