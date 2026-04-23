import java.util.Scanner ;
public class Ch4_8 {
	public static void main (String [] args) {
		Scanner A = new Scanner (System.in) ;
		System.out.println("請輸入成績") ;
		int score = A.nextInt() ;
		String msg = "" ;
		if (score >= 60) {
			msg = "及格" ;
		} else {
			msg = "不及格" ;
		}
		System.out.println(msg) ;
		String msg2 = score >= 60 ? "及格" : "不及格" ; //三元運算子
		System.out.println(msg2) ;
	}
}
