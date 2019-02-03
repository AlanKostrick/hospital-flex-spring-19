import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<String, Employee> employees = new HashMap<>();

	public void hire(Employee employee) {
		employees.put(employee.getId(), employee);
	}

	public Employee find(Employee employee) {
		return employees.get(employee.getId());
	}

	public Collection<Employee> getEmployees() {
		return employees.values();
	}

}
