package JavaInter;

public class RemoveJunk {

	public static void main(String[] args) {
		// how to remove junk character
		//"[^a-zA-Z0-9]",""
		String s="//Selenium+java";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
int len=s.length();
String tr="";
for(int a=len-1;a>=0;a--){
	tr=tr+s.charAt(a);


}
System.out.println(tr);
StringBuffer st=new StringBuffer(s);
System.out.println(st.reverse());
	}
	
 
 
}
