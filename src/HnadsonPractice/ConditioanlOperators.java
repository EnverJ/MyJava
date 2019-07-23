package HnadsonPractice;

public class ConditioanlOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price=9800;
		int tax=120;
		int total=9920;
		if(price==9800){
			tax=100;
			total=9000;
			System.out.println(total);
		}
		String contry="USA";
		String Capital="DC";
		String flag="Stars";
		if(flag.equals("Stars")){
			System.out.println(contry+"  "+Capital);
		}

	}

}
