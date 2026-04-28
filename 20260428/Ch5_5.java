// 輸出0~n的數字
import java.util.Scanner ;
public class Ch5_5 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.print("請輸入一個數字： ") ;
		int a = A.nextInt() ;
		for (int i = 0 ; i <= a ; i++) {
			System.out.print(i + " ") ;
		}
	}
}
