import java.util.Scanner ;
public class Ch4_5 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入數字") ;
		int num = A.nextInt() ;
		if (num == 1) {
			System.out.println("1：播放") ;
		} else if (num == 2) {
			System.out.println("2：暫停") ;
		} else if (num == 3) {
			System.out.println("3：離開") ;
		} else {
			System.out.println("無此操作") ;
		}
	}
}
