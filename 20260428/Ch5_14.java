import java.util.Scanner ;
public class Ch5_14 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入密碼：") ;
		int psw = A.nextInt() ;
		if(psw == 1234) {
			System.out.println("登入成功") ;
		} else {
			System.out.println("登入失敗") ;
		}
	}
}
			
