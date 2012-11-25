
public class run {
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager(new Patient("John", 33, "Tuberculosis"));
		hm.addPatient(new Patient("Mary", 66, "Meningitis"));
		hm.addPatient(new Patient("Tash", 32, "Hypacondriactitos"));
		hm.addPatient(new Patient("Jan", 53, "Mental"));
		hm.addPatient(new Patient("Luke", 30, "Cold"));
		hm.addPatient(new Patient("Paul", 51, "Asthma"));
		hm.addPatient(new Patient("Joe", 28, "Eating Disorder"));
		hm.addPatient(new Patient("Baz", 35, "ADHD"));
		hm.addPatient(new Patient("Simon", 56, "Depression"));
		hm.addPatient(new Patient("Josh", 66, "Bi-Polar"));
	}

}
