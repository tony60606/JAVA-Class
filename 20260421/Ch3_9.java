import java.util.Scanner ;
public class Ch3_9 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入要計算的第一個數字") ;
		int X = A.nextInt() ;
		System.out.println("請輸入要計算的第二個數字") ; 
        int Y = A.nextInt() ;
        int ans = X +Y ;
        System.out.println("計算結果為：" + ans) ;
	}
}
