import java.util.ArrayList;
import java.util.Collection;

public class Doctor implements MedicalDuties {

	private String name;
	private Collection<Patient> patients = new ArrayList<>();
	private String status;

	public String getName() {
		return name;
	}

	@Override
	public Collection<Patient> getPatients() {
		return patients;
	}

	@Override
	public String getStatus() {
		if (patients.size() <= 5) {
			status = "Available";
		} else {
			status = "Unavailable";
		}
		return status;
	}

	public Doctor(String name) {
		this.name = name;
	}

	@Override
	public void assignPatient(Patient patient) {
		patients.add(patient);

	}

	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealthLevel(10);

	}

}
