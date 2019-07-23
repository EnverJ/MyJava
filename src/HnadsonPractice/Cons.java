package HnadsonPractice;

public class Cons {
	String name;
	int age;
	char gender;
	long PhoneNumber;


	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param phoneNumber
	 */
	public Cons(String name, int age, char gender, int phoneNumber) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.PhoneNumber = phoneNumber;
	}


	public Cons() {
			System.out.println("This is default constructor");
		}
	


	public static void main(String[] args) {
Cons co1=new Cons();
System.out.println(co1);
Cons co=new Cons("Enver",28,'m',45678987);
System.out.println(co.name+" "+co.age+" "+co.gender+"  "+co.PhoneNumber);

	}

}
