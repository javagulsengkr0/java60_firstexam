package Whileloop;

public class Runner1 {
	public static void main(String[] args) {
		  
		//tan�mlad���m�z a ve b say�lar� aras�ndaki say�lar�n birbirlerine g�re olan durumlar�n�n incelenmesi
		int a = 0;
		int b = 10;
	while (a < b) {
		    a++;
		    b--;
		    if(a==b) {
		    	System.out.println(b+"="+a);
		    }
		    else {
		    System.out.println(b + ">" + a);
		}
	}
}
}
	