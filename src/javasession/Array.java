package javasession;

public class Array {

	public static void main(String[] args) {
		// Question 1: Write a program to print the following pattern using
		// static Array and for loop:
		int x[]=new int[4];
		int y[]=new int[10];
		for (int a = 0; a <x.length; a++) {
			for (int b = 0; b <y.length; b++) {
				System.out.print(b +" "+a+"");
			}
			System.out.println();
		}
		// Question 2: Write a program to create a static Array, having
		// following cricket data:
		// --name, age, team name, DOB, gender, Strike Rate
		// --Try to create multiple Object Arrays for different players
		// --Try to print all the values of each player on the console
		Object k[] = new Object[5];
		k[0] = "Enver";
		k[1] = "Agile";
		k[2] = "20 Sep";
		k[3] = 'M';
		k[4] = 8;
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}
		/*Question 3: Try to print the following pattern on the console:
			n = 4
			n = 3
			n = 2
			n = 1
			n = 0 */
		int m[]=new int[5];
		for(int n=0;n<m.length;n++){
			System.out.println("n= "+n);
			
		}
		for(int p=1; p<=9; p++){
			for(int d=1; d<=9; d++){
				System.out.print(p+""+d+" "); //11 12 13 14 15  21 22 23 24 25
			}
			System.out.println();
		}
		

	}

}
