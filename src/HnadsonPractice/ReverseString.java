package HnadsonPractice;

public class ReverseString {
	public static String main(String[] args) {
	 String a="Hundai";
	
		int len=a.length();
		if(len==1){
		return a;
		
		}
		
		String rev="";
	
		for(int i=len-1;i>=0;i--){
			rev=rev+a.charAt(i);}
			return rev;
		
		
			
	
	}

}
