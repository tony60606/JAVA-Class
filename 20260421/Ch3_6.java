public class Ch3_6 {
	public static void main (String [] args) {
		int A = 6 ;
		int B = 10 ;
		boolean ans = A >B ;
		System.out.println(A + ">" + B +"ans：" + ans) ;
		ans = A < B ;
		System.out.println(A + "<" + B + "ans：" + ans);
		int age = 18 ;
		int overage = 20 ;
		ans = age >= overage ;
		System.out.println(age + ">=" + overage + "ans：" + ans) ;
		ans = age <= overage ;
		System.out.println(age + "<=" + overage + "ans：" + ans);
		int C = 10 ;
		ans = B == C ;
		System.out.println(B + "==" + C + "ans：" + ans) ;
		ans = A != C ;
		System.out.println(A + "!= " + C + "ans：" + ans);
	}
}
