package JavaInter;

public class ReverseString {
//how to reverse a string
	//difference between string and StringBuffer
	//do we have reverse function String?
	public static void main(String[] args) {
		String s="Selenium";
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
