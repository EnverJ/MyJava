package javasession;

import java.util.ArrayList;
import java.util.List;

public class Oglem {
	String name;
	String stablishedYear;
	String country;
	List<String> course;
public Oglem(){
	String name="Nankai";
	String stablishedYear="1991";
	String country="C";
	List<String> course=new ArrayList<String>();
}

	/**
 * @param name
 * @param stablishedYear
 * @param country
 * @param course
 */
public Oglem(String name, String stablishedYear, String country) {
	this.name = name;
	this.stablishedYear = stablishedYear;
	this.country = country;
	course=new ArrayList<String>();
	//this.course = course;
}
public  Oghlem(){
	
	
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Oglem og=new Oglem("Nankai","C","1991");
System.out.println(og);
	}

}
