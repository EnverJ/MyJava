package Inheritance;

public class TestuNIVERSITY {

	public static void main(String[] args) {
		Universities un=new Universities();
		un.classroom();
		un.regularclasses();
		un.evningclasses();
		un.playGround();
		System.out.println("------------");
		MIT M=new MIT();
		M.classroom();
		M.PHDCourse();
		M.specialSessions();
		System.out.println("+++++++++");
		//Top Casting: //child class object can be referred by parent class ref variable
		Universities u=new MIT();
		u.classroom();
		u.playGround();
		u.evningclasses();
		System.out.println("++++++");
		//Down Casting:
		MIT T=(MIT)new Universities();
			T.classroom();
			T.playGround();
			T.PHDCourse();
			T.regularclasses();
			T.evningclasses();
		
		

	}

}
