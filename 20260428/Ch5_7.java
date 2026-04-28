// 輸入偶數 while迴圈
import java.util.Scanner ;
public class Ch5_7 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		while (true) {
			System.out.println("請輸入一個數字：") ;
			int a = A.nextInt() ;
			if (a % 2 == 0) {
				System.out.println("偶數") ;
				break ;
			}
			System.out.println("不是偶數") ;
		}
	}
}
