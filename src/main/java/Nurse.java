import java.util.ArrayList;
import java.util.Collection;

public class Nurse extends Employee implements MedicalDuties {

	private Collection<Patient> patients = new ArrayList<>();
	private String status;

	public Nurse(String id,String name) {
		super(id, name);
	}

	@Override
	public void assignPatient(Patient patient) {
		patients.add(patient);
	}

	@Override
	public Collection<Patient> getPatients() {
		return patients;
	}

	@Override
	public String getStatus() {
		if (patients.size() <= 2) {
			status = "Available";
		} else {
			status = "Unavailable";
		}
		return status;
	}

	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealthLevel(5);
	}

}
