package HnadsonPractice;

public class MoethdOverLoading {
	public void Enver(){
		System.out.println("zero parameter overloading");
	}
	public void Enver(String StudentID){
		System.out.println("Search base don the studentID");
	}
	public void Enver(int ID){
		System.out.println("Search based on the ID");
	}
public void Enver(String name,String city){
	System.out.println("Serach based on the name and city  "+name+" "+city);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MoethdOverLoading me=new MoethdOverLoading();
		 me.Enver();
		 me.Enver(34567);
		 me.Enver("2345678");
		 me.Enver("Enver", "Kahsgar");
		

	}

}
