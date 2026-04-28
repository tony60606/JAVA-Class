public class Ch5_2 {
	public static void main (String [] args) {
		int i = 0 ;
		while (i <= 9) {
			int j = 9 ;
			while (j >= 0) {
				System.out.print("i = " + i+" 、 j = " + j + "：") ;
				System.out.println("i * j = " + i*j) ;
				System.out.println("=========================") ;
				j -- ;
			}
			i ++ ;
		}
	}
}
