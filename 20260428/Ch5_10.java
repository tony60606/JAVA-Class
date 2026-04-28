import java.util.Scanner ;
public class Ch5_10 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入西元年：") ;
		int year = A.nextInt() ;
		int W = year - 1911 ;
		System.out.printf("西元%d年就是民國%d年",year,W) ;
	}
}
