package javasession;

public class FunctionConcept7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		FunctionConcept7 obj=new FunctionConcept7();
		int n1=obj.SumOfTwoNum();
		System.out.println("Sum of two number is= "+n1);
		String n2=obj.products(3);
		System.out.println("product is "+n2);
		String n3=obj.cirle(3);
		System.out.println(n3);
		String n4=obj.macMin(1, 2, 3);
		System.out.println(n4);
		String n5=obj.oddEven(3);
		System.out.println(n5);
		String n6=obj.Election(24);
		System.out.println(n6);
		String n7=obj.Marks(89);
		System.out.println(n7);
		String n8=obj.Factorial(12);
		System.out.println(n8);
		}
	//1.Write a program to print the sum of two numbers entered by user by defining your own metho
       public int SumOfTwoNum(){
    	   int a=2;
    	   int b=5;
    	   int total=a+b;
    	   return total;   
	}
       //2. Define a method that returns the product of two numbers entered by user.
       public String products(int m){
    	 if(m==1){
    		 return "TV";
    	 }
    	 else{
    		 return "Laptop";
    	 }   
       }
       //3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
       
       public String cirle(int r){
    	   return  "circumference os circle is: p"+(2*r)+"  ara is: p"+(r*r);   
       }
   //4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
       public String macMin(int x ,int y, int z){
    	   if(x>y && x>z){
    		   return "X is maximum number,z is minimum number";
    	   }
    	   else if(y>z && x>z){
    		   return "Y is maximum number, z is minum number ";
    	   }
    	   else{
    		   return "z is maximum number,x is minimum number";
    	   }
       }
       //5. Define a program to find out whether a given number is even or odd.
       public String oddEven(int a){
    	   if(a%2==0){
    		   return "a is even number";
    	   }
    	   else{
    		   return a+" a is odd number";
    	   }
       }
    //6. A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote.
public String Election(int age){
	if(age>=18){
		return age+ " He/She is elligible to vote ";
	}
	else{
		return age+ " He/She is not elligible to vote";
	}
}
/*7. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail*/
public String Marks(int Grade){
	if(Grade>=91 && Grade<=100){
		return Grade+"AA";
	}
if(Grade>=81 && Grade<91){
return "AB";
}
else if(Grade>=71 && Grade<81){
	return "BB";
}
else if(Grade>=61 && Grade<70){
	return "BC";
}
else if(Grade>=51 && Grade<60){
	return "CD";
}
else if(Grade>=41 && Grade<=51){
	return "DD";
}
else{
	return "Fail";
}
}

//8. Write a program to print the factorial of a number by defining a method named 'Factorial'.
public String Factorial(int n){
	int result=1;
	for(int i=1;i<=n;i++){
		result=result*i;
	}
	{
		return "n!=" +result;
	}
}

}


