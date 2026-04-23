import java.util.Scanner ;
public class Ch4_2 {
	public static void main (String [] args) {
		Scanner A = new Scanner (System.in) ;
		System.out.println("請輸入年齡") ;
		int age = A.nextInt() ;
		if (age >= 18) {
			System.out.println("已成年" + age + "歲") ;
		} else {
			System.out.println("未成年" + age + "歲") ;
		}
	}
}
