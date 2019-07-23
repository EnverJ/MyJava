package javasession;

public class MainMethodOverloading {
	
	 
 public static void main(String[] args) {
	System.out.println("java is a island");
	 MainMethodOverloading obj=new MainMethodOverloading();
	 obj.main();
	 obj.main(3);
}


 
 public static void main(){
	 System.out.println("Java is also a programming language");
 }
 public static void main(int a){
	 System.out.println("I like java very much");
	 System.out.println(a);
	 
 }

}
