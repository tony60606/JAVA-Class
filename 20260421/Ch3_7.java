public class Ch3_7 {
	public static void main (String [] args) {
		int w = 129 ;
		int h =  171 ;
		int ow = 80 ;
		int oh = 180 ;
		int BMI = w / h * h ;
		int oBMI = ow / oh * oh ;
		boolean GPS = true ;
		System.out.println(w<=ow && BMI <= oBMI) ; //and：&& => 兩邊為真才為真
		System.out.println(h >= oh || BMI >= oBMI) ; //or：|| => 單邊為真即為真
		System.out.println(!(w >= ow ) ); //not：! => 唱反調
		System.out.println(!GPS);
	}
}
