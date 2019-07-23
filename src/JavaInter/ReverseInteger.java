package JavaInter;

public class ReverseInteger {

	public static void main(String[] args) {
		// 1.using algo
		long num=123456;
		long rev=0;
		while(num!=0){
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		//2.StringBuffer
		long num1=456789;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}
	

}
 