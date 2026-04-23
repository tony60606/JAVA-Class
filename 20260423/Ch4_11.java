public class Ch4_11 {
	public static void main (String [] args) {
		for (int X = 50 ; X >= 0 ; X -= 10 ) {
			System.out.print(X + "、") ;
		}
		for (int A = 50 ; A >= 0 ; A -= 5) {
			for(int B = 0 ; B <= 50 ; B += 10 ) {
				System.out.print("A=" + A + "、B=" + B + ";") ;
			}
			System.out.println() ;
		}
	}
}
