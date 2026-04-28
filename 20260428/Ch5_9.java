import java.util.Scanner ;
public class Ch5_9 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入兩個小數：") ;
		float a = A.nextFloat() ;
		float b = A.nextFloat() ;
		float ans = a +b ;
		System.out.printf("第一個小數為：%.2f %n第二個小數為：%.2f %n兩個相加和為：%.2f",a,b,ans) ;
	}
}
