package nonmedical.personnel;
import hospital.Employee;

public class Janitor extends Employee {

	public Janitor(String id, String name) {
		super(id, name);
	}

	@Override
	public String getStatus() {
		return null;
	}

}
