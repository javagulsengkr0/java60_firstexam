package Whileloop;

public class Runner1 {
	public static void main(String[] args) {
		  
		//tanımladığımız a ve b sayıları arasındaki sayıların birbirlerine göre olan durumlarının incelenmesi
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
	