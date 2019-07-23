package javasession;

public class ConstructorPractice {
	String name;
	int age;
	char gender;
	

	public ConstructorPractice(String name, int age, char gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorPractice obj=new ConstructorPractice("Enver",28, 'm');
		ConstructorPractice obj2=new ConstructorPractice("Oghlem",33, 'f');
		System.out.println(obj2.name+" "+obj2.age+" "+obj2.gender);
		System.out.println(obj.name);
		

	}

}
