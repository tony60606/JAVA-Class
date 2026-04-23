import java.util.Scanner ;
public class Ch4_4 {
	public static void main (String [] args) {
		Scanner A = new Scanner (System.in) ;
		System.out.println("請輸入您的年收入：百萬");
		int income = A.nextInt() ;
		if (income >= 300 ) {
			System.out.println("您的年收入為：" + income + "百萬，屬於富裕");
		} else if (income >= 150 && income < 300) {
			System.out.println("您的年收入為：" + income + "百萬，屬於小康");
		} else if (income >= 70 && income < 150) {
			System.out.println("您的年收入為：" + income + "百萬，屬於普通");
		} else {
			System.out.println("您的年收入為：" + income + "百萬，屬於清寒");
		}
	}
}
