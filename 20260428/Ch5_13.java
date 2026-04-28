import java.util.Scanner ;
public class Ch5_13 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入密碼：") ;
		int num = A.nextInt() ;
		int right = 1234 ;
		int time = 1 ;
		while (num != right) {
			if (time < 3) { 
				System.out.println("密碼錯誤!請重新輸入：") ;
				num = A.nextInt() ;
			} else {
				System.out.println("登入失敗，請於一 個小時後再重試") ;
				return ;
			}
			time ++ ;
		}
		System.out.println("登入成功!") ;
	}
}
