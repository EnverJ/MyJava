package HnadsonPractice;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> ar=new ArrayList<String>();
    
   ar.add("Oglem");
    ar.add("Enver");
    
    System.out.println(ar.size());// physical size of ArrayList
    ar.add(12.4);
    ar.add('a');
    System.out.println(ar.size());
    System.out.println(ar.get(0));
    System.out.println(ar.get(3));
   // System.out.println(ar.get(6));// java.lang.IndexOutOfBoundsException
    
    //remove
    ar.remove(2);
   System.out.println("------------------");
   System.out.println(ar.get(2));
   System.out.println(ar.size());
   System.out.println("-----------");
   //how to print all the value of ArrayList
   for(int i=0;i<ar.size();i++){
	   System.out.println(ar.get(i));
	   System.out.println("-------------");
	   //Generics in ArrayList
	   ArrayList<Integer> ar1=new ArrayList<Integer>();
	   ar1.add(2345678);
	   ar1.add(4567);
	   ar1.add(34);
	   System.out.println(ar1.size());
	   System.out.println("++++++++");
	   ArrayList<Object> obj=new ArrayList<Object>();
	   obj.add("Test");
	   obj.add(768);
	   obj.add('e');
	   System.out.println(obj.size());
	   System.out.println(obj.get(0));
	   obj.add(90);
	   for(int a=0;a<obj.size();a++){
		   System.out.println(obj.get(a));
	   }
	   int b=100;
	   int c=200;
	   if(c==b){
		   System.out.println("b equals to a");
	   }
	   else
	   {
		   System.out.println("B and c is not equal");
	   }
	   
   }
	}

};
