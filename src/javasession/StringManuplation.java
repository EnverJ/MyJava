package javasession;

public class StringManuplation {

	public static void main(String[] args) {
		// value of the specific condition
		String str="HEy I wil be automation king";
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf('k'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a', 5));
		System.out.println(str.indexOf('a', str.indexOf('a')+1));
		System.out.println(str.indexOf("king"));
		System.out.println(str.indexOf("more "));
String user="Enver";
if(user.indexOf("Enver")>=45){
System.out.println("Enver is available");	
}else{
	System.out.println("Enver is not available");
}
//trim
String s1="        world  cup  ";
System.out.println(s1.trim() );
//SubString
String str1="Your user id is EnverAutomationLab";
System.out.println(str1.subSequence(16, str1.length()));
//Compairson
String st1="The rain has started here";
String st2="the Rain has started here";
System.out.println(st1.equals(st2));
System.out.println(st1.equalsIgnoreCase(st2));
//upper and lower case
System.out.println(st1.toUpperCase());
//split
String lang="Java-Python-DotNet-Ruby";
String langing[]=lang.split("-");
System.out.println(langing[1]);
for(int i=0;i<=langing.length;i++){
	System.out.println(langing[i]);
}




	}

}
