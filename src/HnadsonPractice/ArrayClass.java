package HnadsonPractice;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = new int[3];
		i[0] = 2;
		i[1] = 4;
		i[2] = 5;
		int LI=0;
		int HI=i.length;
		System.out.println(LI);
		System.out.println(HI);
		System.out.println("---------------------");
		for (int a = 0; a < i.length; a++) {
			System.out.println(i[a]);
		}

		String s[] = { "Enver", "Oghlem" };
		for (int b = 0; b < s.length; b++) {
			System.out.println(s[b]);
			

		}
		Object obj[]=new Object[3];
		obj[0]="USA";
		obj[1]=100;
		obj[2]='A';
		for(int a=0;a<obj.length;a++){
			System.out.println(obj[a]);
		}
	}
}
