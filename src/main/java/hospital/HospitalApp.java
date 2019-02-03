package hospital;
import medical.personnel.Doctor;
import medical.personnel.Nurse;
import nonmedical.personnel.Janitor;

public class HospitalApp {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();
		
		Doctor doctor = new Doctor("1", "Doctor");
		Nurse nurse = new Nurse("2","Nurse");
		Janitor janitor = new Janitor("3", "Janitor");
		
		hospital.hire(doctor);
		hospital.hire(nurse);
		hospital.hire(janitor);
		
		System.out.println(hospital.getEmployees());
		System.out.println(hospital.getMedicalPersonnel());
		
		hospital.showEmployeeInfo();
	}

}
