package HnadsonPractice;

import java.util.ArrayList;

public class Function {

	public static void main(String[] args) {
		Function fc=new Function();
	System.out.println(fc.isDenverCitezen("En"));
	System.out.println(fc.StudentInfor("Ekber"));
	

	}
	public boolean isDenverCitezen(String Name){
		boolean flag=false;
			if(Name.equals("Enver")){
				System.out.println("Enver is citezen");
				flag=true;
			}else{
				System.out.println(Name+" is not Denver citezen");
			}	 
		return flag;
	}
public ArrayList StudentInfor(String FirstName){
	System.out.println("First Nmais is "+FirstName);
	ArrayList ar=new ArrayList();
	if( FirstName.equals("Ekber")){
		ar.add("USA");
		ar.add("Healty");
		ar.add('B');
	}
	return ar;
	
	
}
}
