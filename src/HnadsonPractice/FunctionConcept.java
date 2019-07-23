package HnadsonPractice;

public class FunctionConcept {

	public static void main(String[] args) {
		FunctionConcept obj = new FunctionConcept();
		String ni = obj.name();
		System.out.println(ni);
		int sc = obj.Score();
		System.out.println(sc);
		System.out.println(obj.isUScitizen(true));
		String mn=obj.sum(21, -10);
		System.out.println(mn);
		int score=obj.StudenMarks("Enver");
		System.out.println(score);
		String[] ar=obj.Studentin("Enver");
		System.out.println(ar);
	}

	public String name() {
		String name = "Enver";
		return name;
	}

	public int Score() {
		int a = 90;
		return a;
	}
	public boolean isUScitizen(boolean ture){
		boolean flag=false;
		String name="E";
		if(name.equals("Enver")){
			System.out.println("Enver is US citizen");
			flag=ture;
		}
		return flag;
	}
	public String sum(int m, int n ){
		int b=m+n;
		if(b>0){
			return "m>-n";
		}
		else{
			return "m<(-n)";
		}
		
		}
	public int StudenMarks(String name){
		System.out.println("Stuedent name is"+ name);
		if(name.equals("Enver")){
			return 100;
		}
		else if(name.equals("Navee")){
			return 98;
		}
		else{
			return 0;
		}
	}
	public String[] Studentin(String name){
		System.out.println("Student name"+name);
		if(name.equals("Enver")){
			 String infor[]={"Enver"+"E.T"+"A"};
			 return infor;
		}	
		else{
			return null;
		}
	}

}