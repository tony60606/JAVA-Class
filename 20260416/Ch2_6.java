public class Ch2_6 {
	public static void main (String [] args) {
		final float pi = 3.14159f ; //宣告final後,後續將無法對變數的值進行修改
		System.out.println(pi) ;
		int r = 10 ;
		float area = r*r*pi ;
		System.out.println("面積="+area) ;
	}
}
