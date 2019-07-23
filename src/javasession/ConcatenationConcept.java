package javasession;

public class ConcatenationConcept {

	public static void main(String[] args) {
		// find greatest number
		int a=25;
		int b=78;
		int c=87;
		int d=90;
		if(a>b && a>c && a>d){
			System.out.println("Greatest number is "+a);
		}
		else if(b>c && b>d){
			System.out.println("Greatest number is "+b);
		}
		else{
			System.out.println("Greatest number is "+d);
		}
		//2. Write a Java program to test a number is positive or negative.

		int x=35;
		int y=-11;
		if(x>0){
			System.out.println(x +" is positive number");
		}
		else{
			System.out.println(x+"is nagative number");
		}
		if(y>0){
			System.out.println(y+" positive number");
		}
		else{
			System.out.println(y+" is nagative number");
		}
		//3. Write a Java program to print the capital city of different countries. EXAMPLE:
		String country="India";
		if(country.equals("India")){
			System.out.println("India capital city is New Delhi");
			
		}
		else if(country.equals("Russia")){
			System.out.println("Capital ci ty is Moscow");
			
		}
		else if(country.equals("USA")){
			System.out.println("USA capital city is Washington.DC");
		}
		else if(country.equals("Turkey")){
			System.out.println("Turkey's capital is Ankara");
		}
		else if(country.equals("French")){
			System.out.println("French capital city is Paris");
		}
		else if(country.equals("UK")){
			System.out.println("UK capital city is London");
		}
		else if(country.equals("Germany")){
			System.out.println("Germany capital city is Berlin");
		}
		else{
			System.out.println("Not country is defined with country name");
		}
	}

}
