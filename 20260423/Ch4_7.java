import java.util.Scanner ;
public class Ch4_7 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入課程代號") ;
		String Class = A.next() ;
		switch (Class) {
			case "A" :
				System.out.println("課程A：JAVA") ;
			break ;
			case "B" :
				System.out.println("課程B：Python") ;
			break ;
			case "C" :
				System.out.println("課程C：C++") ;
			break ;
			case "D" :
				System.out.println("課程D：AI") ;
			break ;
			case "E" :
				System.out.println("課程E：AutoCAD") ;
			break ;
			case "F" :
				System.out.println("課程F：C語言") ;
			break ;
			default :
				System.out.println("請重新輸入") ;
			break ;
		}
	}
}
