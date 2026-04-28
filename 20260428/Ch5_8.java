public class Ch5_8 {
	public static void main (String [] args) {
		int age = 30 ;
		String name = "Tony" ;
		float height = 171.56f ;
		String msg1 = "姓名是：" ;
		String msg2 = "年齡是：" ;
		System.out.println(msg1+name+"，"+msg2+age) ;
		// %s => 填字串 、%d => 填整數、 %f => 填浮點數(%._f =>_為小數點取到第幾位)
		System.out.printf("姓名是：%s %n年齡是：%d %n身高是：%.2f",name,age,height) ;
	}
}
