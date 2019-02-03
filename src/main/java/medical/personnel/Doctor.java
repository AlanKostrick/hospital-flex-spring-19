package medical.personnel;
import java.util.ArrayList;
import java.util.Collection;

import hospital.Employee;
import hospital.MedicalDuties;
import hospital.Patient;

public class Doctor extends Employee implements MedicalDuties {

	private Collection<Patient> patients = new ArrayList<>();
	private String status;

	@Override
	public Collection<Patient> getPatients() {
		return patients;
	}
	
	public Doctor(String id, String name) {
		super(id, name);
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


	@Override
	public void assignPatient(Patient patient) {
		patients.add(patient);

	}

	@Override
	public void careForPatient(Patient patient) {
		patient.increaseHealthLevel(10);

	}

}
