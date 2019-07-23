package HnadsonPractice;

import java.util.ArrayList;

public class ArrayListConstruction {
	//String st="Enver";
	ArrayList<String> Denver;
	
	

	/**
	 * @param st
	 * @param denver
	 */
	public ArrayListConstruction( ArrayList<String> denver) {
		
		//this.st = st;
		this.Denver = denver;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> ar=new ArrayList<String>();
        ar.add("ARURA");
        ar.add("DTC");
        ArrayListConstruction obj=new ArrayListConstruction(ar);
        System.out.println(obj);
	}

}
