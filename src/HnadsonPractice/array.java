package HnadsonPractice;

import java.util.ArrayList;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a[] = new int[3]; a[0] = 2; a[1] = 3; a[2] = 4; int LI = 0; int
		 * HI = a.length; System.out.println("LI " + LI + "  " + "HI " + HI);
		 * for (int b = 0; b < a.length; b++) { System.out.println(a[b]); } //
		 * DOUBLE ARRAY double d[] = new double[2]; d[0] = 2.07; d[1] = 9.98;
		 * for (int i = 0; i <= d.length; i++) { System.out.println(d[i]); } //
		 * int c[]={8,3,2,4}; for(int m=0;m<c.length;m++){
		 * System.out.println(c[m]); }
		 */
		// String
		String name[] = new String[3];
		name[0] = "ABC";
		name[1] = "Enver";
		name[2] = "Oghlem";
		for (int n = 0; n < name.length; n++) {
			System.out.println(name[n]);
		}
		Object ob[] = new Object[2];
		ob[0] = 2;
		ob[1] = "Denver";
		for (int p = 0; p < ob.length; p++) {
			System.out.println(ob[p]);
		}
		String h[]={"Enver","pooo"};
		for(int f=h.length-1;f>=0;f--){
			System.out.println(h[f]);
		}
		ArrayList ar1=new ArrayList();
		ar1.add("IIFIUA");
		ar1.add(1, 3);
		System.out.println(ar1);
		
	}

}
