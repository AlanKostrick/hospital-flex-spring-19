import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;

import hospital.Employee;
import hospital.Hospital;
import medical.personnel.Doctor;
import medical.personnel.Nurse;
import nonmedical.personnel.Janitor;

public class HospitalTest {

	@Test
	public void shouldBeAbleToHireADoctor() {
		Hospital underTest = new Hospital();
		Doctor doctor = new Doctor("1", "Dr. Who");
		underTest.hire(doctor);
		Employee foundDoctor = underTest.find(doctor);
		assertThat(foundDoctor, is(doctor));
	}

	@Test
	public void shouldBeAbleToHireADoctorAndANurse() {
		Hospital underTest = new Hospital();
		Doctor doctor = new Doctor("1", "Dr. Who");
		Nurse nurse = new Nurse("2", "Nurse");
		underTest.hire(doctor);
		underTest.hire(nurse);
		Collection<Employee> employees = underTest.getEmployees();
		assertThat(employees, containsInAnyOrder(doctor, nurse));
	}

	@Test
	public void shouldFindAllMedicalPersonnel() {
		Hospital underTest = new Hospital();
		Doctor doctor = new Doctor("1", "Dr. Who");
		Nurse nurse = new Nurse("2", "Nurse");
		Janitor janitor = new Janitor("3", "Janitor");
		underTest.hire(doctor);
		underTest.hire(nurse);
		underTest.hire(janitor);
		Collection<Employee> medicalPersonnel = underTest.getMedicalPersonnel();
		assertThat(medicalPersonnel, containsInAnyOrder(doctor, nurse));
		assertThat(medicalPersonnel, not(containsInAnyOrder(janitor)));
	}

}
