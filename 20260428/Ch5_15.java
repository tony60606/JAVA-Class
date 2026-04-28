import java.util.Scanner ;
public class Ch5_15 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		for(int i = 0 ; i <= 3 ; i++) {
			System.out.println("請輸入密碼：") ;
			int psw = A.nextInt() ;
			if (psw == 1234) {
				System.out.println("登入成功") ;
			} else {
				if (i < 3) {
					System.out.println("登入失敗，請重新輸入") ;
				} else { 
					System.out.println("登入失敗，請於一個小時後重試") ;
					break ;
				}
			}
		}
	}
}
