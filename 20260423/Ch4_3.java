import java.util.Scanner ;
public class Ch4_3 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入成績");
		int score = A.nextInt() ;
		if (score >= 60) {
			 System.out.println("恭喜您,及格囉!");
		} else { 
			System.out.println("這次成績不及格，請多努力!");
		}
	}
}
