import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

import java.util.Collection;

import org.junit.Test;

public class NurseTest {
	
	Nurse underTest = new Nurse("Alan");
	
	@Test
	public void shouldHaveAName() {
		String checkName = underTest.getName();
		assertThat(checkName, is("Alan"));
	}
	
	@Test
	public void shouldBeAbleToAssignAPatientToNurseWorkload() {
		Patient patient1 = new Patient();
		underTest.assignPatient(patient1);
		Collection<Patient> nursesPatients = underTest.getPatients();
		assertThat(nursesPatients, contains(patient1));
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
	public void statusShouldReportAsUnavailableWith3Patients() {
		Patient patient1 = new Patient();
		Patient patient2 = new Patient();
		Patient patient3 = new Patient();
		underTest.assignPatient(patient1);
		underTest.assignPatient(patient2);
		underTest.assignPatient(patient3);
		String statusCheck = underTest.getStatus();
		assertThat(statusCheck, is("Unavailable"));
	}
	
	@Test
	public void shouldIncreaseHealthLevelBy5WhenCareForPatiet() {
		Patient patient = new Patient();
		underTest.assignPatient(patient);
		underTest.careForPatient(patient);
		int healthCheck = patient.getHealthLevel();
		assertThat(healthCheck, is(10));
	}
	
	@Test
	public void shouldIncreaseHealthLevelFrom2To7WhenCareForPatient() {
		Patient patient = new Patient(2);
		underTest.assignPatient(patient);
		underTest.careForPatient(patient);
		int healthCheck = patient.getHealthLevel();
		assertThat(healthCheck, is(7));
	}
	
	@Test
	public void shouldBeAnInstanceOfMedicalDuties() {
		assertThat(underTest, instanceOf(MedicalDuties.class));
	}
		
	

}
