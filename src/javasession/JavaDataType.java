package javasession;
public class JavaDataType {
	public static void main(String[] args) {
		//data type session
		//1.integer
		//a.int; size in bytes:4 bytes,range:-2147483648 to 2147483658
		int i=10;
		 i=76;
		 System.out.println(i);
	//b.short,2bytes, range:-32768 to 32767
	short p=10;
	short t=12;
	System.out.println(p*t);
	//c.Byte range:-128 t 127
	byte a1=50;
	byte a2=3;
	System.out.println("this is byte "+a1/a2);
	//d.long: 8 bytes=64 bits
		long distance=10000000;
		System.out.println("this is long distance"+'\t'+distance);
		
		
		
		
   //2.double 
		//a: float: 4 bytes (6 to 7 dismal point)
		float f1=4.3333f;
		float f2=(float)2.1111;
		System.out.println("this is float"+f1+f2);
		//b: :8 byte (15 digits of dismal )
		double d1=12.234234567890d;
		System.out.println("double is "+d1);
	//3.character; ASCII value
	char x='y';
	char z='k';
	System.out.println(z+x);
	//4.boolean:t/f
	boolean b=true;
	boolean c=false;
	System.out.println(c);
	System.out.println(b);
	//5.String :is not a data type; it is a default class in java
	String s1="Hello World";
	String s2="I like java";
	System.out.println(s1+'\t'+s2);
	System.out.println(s1+'\n'+s2);
	
	
	}
}