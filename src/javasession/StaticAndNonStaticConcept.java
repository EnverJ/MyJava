package javasession;

public class StaticAndNonStaticConcept {
	
	static int age=25;
	String name="Enver";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		System.out.println(age);
      getUserName();
      StaticAndNonStaticConcept.getUserName();
      System.out.println(obj.name);

      
   
      
	}
	public void login(){
		System.out.println("Login method");
	}
	public static void getUserName(){
		System.out.println("get user name method");
	}

}
