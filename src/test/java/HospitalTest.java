import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;

public class HospitalTest {
	
	@Test
	public void shouldBeAbleToHireADoctor() {
		Hospital underTest = new Hospital();
		Doctor doctor = new Doctor("1","Dr. Who");
		underTest.hire(doctor);
		Employee foundDoctor = underTest.find(doctor);
		assertThat(foundDoctor, is(doctor));
	}
	
	@Test
	public void shouldBeAbleToHireADoctorAndANurse() {
		Hospital underTest = new Hospital();
		Doctor doctor = new Doctor("1","Dr. Who");
		Nurse nurse = new Nurse("2","Nurse");
		underTest.hire(doctor);
		underTest.hire(nurse);
		Collection<Employee> employees = underTest.getEmployees();
		assertThat(employees, containsInAnyOrder(doctor,nurse));
	}

}
