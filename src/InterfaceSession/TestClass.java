package InterfaceSession;

public class TestClass {
	public static void main(String[] args) {
		FortisHospital fs=new FortisHospital();
		fs.ambulanceServices();
		fs.cardioServices();
		fs.childCareServices();
		fs.dentalServices();
		fs.medicalInsuranceServices();
		fs.mentalHealthServices();
		USMedical us=new FortisHospital();
		us.ambulanceServices();
		System.out.println(USMedical.min_fee);
	}

}
