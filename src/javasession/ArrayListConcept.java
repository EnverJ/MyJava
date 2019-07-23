package javasession;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Black");
		arr.add("White");
		arr.add(0,"Red");
		arr.add("Green");
		arr.set(2, "Yellow");
		
		for(int i=0; i<arr.size();i++)
		System.out.println("This is colur: "+arr.get(i));
		//2. Write a Java program to insert an element into the array list at the first and last positions.
        //3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println(arr.get(3));
		//4. Write a Java program to update specific array element by given element.
       //5. Write a Java program to remove the third element from a array list. 
		System.out.println(arr.remove(2));
//6. Write a Java program to search an element in a array list.
		boolean found=arr.contains("Black");
		System.out.println(found);
		
		//7. Write a Java program to reverse elements in a array list
		for(int a=arr.size()-1;a>=0;a--){
			System.out.println("After reverse: "+arr.get(a));
		}
		//8. Write a Java program to extract a portion of a array list.
        List<String> sub_list=arr.subList(0, 2);
        System.out.println("Poetion from 0 to 3 are: "+sub_list);
        
        //9. Write a Java program of swap two elements in an array list.
        
      
	
        

       
		

	}

}
