package if_else;

public class Runner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// yaşlara göre muaene odası belirleme kodu
		int yas = 18;

		if (yas >= 0 && yas < 18) {
			System.out.println("çocuk polikliniği,oda-1");
		} else if (yas >= 18 && yas <= 64) {
			System.out.println("yetişkin polikliniği,oda-2");
		} else {
			System.out.println("Geriatri polikliniği,oda-3");
		}

	}

}
