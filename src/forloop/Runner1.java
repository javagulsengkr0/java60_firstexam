package forloop;



public class Runner1 {

	public static void main(String[] args) {
		
		//11 ile 50 arasındaki tek sayıların toplamını bulan program;
		int toplam=0;
		for(int i=49;i>=11;i-=2) {
			toplam=toplam+i;
			
		}
		
		System.out.println(toplam);
			

	}

}
