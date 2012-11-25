
public class HospitalManager {
	private Patient patientListStart = null;
	
	public HospitalManager(Patient firstPatient)
	{
		this.patientListStart = firstPatient;
	}
	
	public void addPatient(Patient nextPatient)
	{
		this.patientListStart.addPatient(nextPatient);
	}
}
