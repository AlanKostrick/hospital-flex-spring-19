import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.util.Collection;

import org.junit.Test;

import hospital.Employee;
import hospital.MedicalDuties;
import hospital.Patient;
import medical.personnel.Doctor;

public class DoctorTest {

	Doctor underTest = new Doctor("1","Alan");

	@Test
	public void shouldBeInstanceOfMedicalDuties() {
		assertThat(underTest, instanceOf(MedicalDuties.class));
	}
	
	@Test
	public void shouldBeAnInstanceOfEmployee() {
		assertThat(underTest, instanceOf(Employee.class));
	}

	@Test
	public void shouldHaveAName() {
		String checkName = underTest.getName();
		assertThat(checkName, is("Alan"));
	}

	@Test
	public void shouldBeAbleToAssignAPatientToDoctorWorkload() {
		Patient patient1 = new Patient();
		underTest.assignPatient(patient1);
		Collection<Patient> doctorsPatients = underTest.getPatients();
		assertThat(doctorsPatients, contains(patient1));
	}

	@Test
	public void statusShouldReportAsAvailableWith2Patients() {
		Patient patient1 = new Patient();
		Patient patient2 = new Patient();
		underTest.assignPatient(patient1);
		underTest.assignPatient(patient2);
		String statusCheck = underTest.getStatus();
		assertThat(statusCheck, is("Available"));
	}

	@Test
	public void statusShouldReportAsUnavailableWith5Patients() {
		Patient patient1 = new Patient();
		Patient patient2 = new Patient();
		Patient patient3 = new Patient();
		Patient patient4 = new Patient();
		Patient patient5 = new Patient();
		Patient patient6 = new Patient();
		underTest.assignPatient(patient1);
		underTest.assignPatient(patient2);
		underTest.assignPatient(patient3);
		underTest.assignPatient(patient4);
		underTest.assignPatient(patient5);
		underTest.assignPatient(patient6);
		String statusCheck = underTest.getStatus();
		assertThat(statusCheck, is("Unavailable"));
	}

	@Test
	public void shouldIncreaseHealthLevelBy10WhenCareForPatiet() {
		Patient patient = new Patient();
		underTest.assignPatient(patient);
		underTest.careForPatient(patient);
		int healthCheck = patient.getHealthLevel();
		assertThat(healthCheck, is(15));
	}

}
