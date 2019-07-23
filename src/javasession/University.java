package javasession;

public class University {
	//1. Design a University class template with the following features:
	String name;
	String Country;
	String StablishedDate;
	//ArrayList<String> course=new ArrayList<String>();
	
	/**
	 * @param name
	 * @param country
	 * @param stablishedDate
	 * @param course
	 */
	public University(String name, String country, String stablishedDate) {
		
		this.name = name;
		this.Country = country;
		this.StablishedDate = stablishedDate;
		//this.course = course;
		/*course.add("IT");
		course.add("Math");
		for(int i=0;i<course.size();i++){
			System.out.println(course(i));
		}*/		
	}
	public String toString(){
		return "";
	}
	public static void main(String[] args) {
		
		University un=new University("Nanakai Univerfsity", "C", "1919");
		System.out.println(un.name+" "+un.Country+" "+un.StablishedDate);

	


	}

}
