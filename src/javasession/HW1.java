package javasession;

public class HW1 {
	
	
	public static void main(String[] args) {
		//1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		//Expected Output :
		//	Hello 
			//Naveen K
     System.out.println("Hello"+"\n"+"Naveen K");
     /*2. Write a Java program to print the sum of two numbers. 
     Test Data: 
    	 74 + 36 
    	 Expected Output :
    	 110*/
     int a=74;
     int b=36;
     System.out.println(a+b);
     /*3. Write a Java program to divide two numbers and print on the screen. 
Test Data : 
50/3
Expected Output :
16*/
     byte c=50;
     byte d=3;
     System.out.println(c/d);
     /*4. Write a Java program to print the result of the following operations. Change your test data accordingly.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9 
c. 20 + -3*5 / 8 
d. 5 + 15 / 3 * 2 - 8 % 3 
Expected Output :
43 
1 
19 
13*/
     byte e=-5;
     byte f=8;
     byte g=6;
     System.out.println(e+f*g);
     short h=55;
     short i=9;
     System.out.println((h+i)%i);
     int k=20;
     int l=-3;
     int m=5;
     int n=8;
     int p=15;
     int q=3;
     int r=2;
     System.out.println(k+l*m/n);
     System.out.println(m+p/q*r-n%q);
     /*5. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
Expected Output
2.138888888888889 */
     double d1=25.5;
     double d2=3.5;
     double d3=40.5;
     double d4=4.5;
     System.out.println((d1*d2-d2*d2)/(d3-d4));
     
	}

}
