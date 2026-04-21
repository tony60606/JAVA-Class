import java.util.Scanner ;
public class Ch3_10 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入身高") ;
		float h = A.nextFloat() ;
		System.out.println("請輸入體重") ;
		int w = A.nextInt() ;
		float BMI = w / (h * h) ;
		System.out.println("您的BMI計算結果為：" + BMI) ;
	}
}
