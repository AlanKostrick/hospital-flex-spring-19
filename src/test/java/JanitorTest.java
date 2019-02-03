import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import hospital.Employee;
import nonmedical.personnel.Janitor;

public class JanitorTest {
	
	Janitor underTest = new Janitor("1","Name");
	
	@Test
	public void shouldBeAnInstanceOfEmployee() {
		assertThat(underTest, instanceOf(Employee.class));
	}

}
