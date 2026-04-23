import java.util.Scanner ;
public class Ch4_6 {
	public static void main (String [] args) {
		Scanner A = new Scanner(System.in) ;
		System.out.println("請輸入號碼") ;
		int num = A.nextInt() ;
		switch (num) {
			case 1 :
				System.out.println("您點的是1號餐") ;
			break ;
			case 2 :
				System.out.println("您點的是2號餐") ;
			break ;
			case 3 :
				System.out.println("您點的是3號餐") ;
			break ;
			case 4 :
				System.out.println("您點的是4號餐") ;
			break ;
			case 5 :
				System.out.println("您點的是5號餐") ;
			break ;
			case 6 :
				System.out.println("您點的是6號餐") ;
			break ;
			default :
				System.out.println("請重新輸入") ;
			break ;
		}
	}
}
