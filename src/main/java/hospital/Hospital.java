package hospital;
import java.util.ArrayList;
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

	public Collection<Employee> getMedicalPersonnel() {
		Collection<Employee> medicalPersonnel = new ArrayList<>();
		for (Employee employee : employees.values()) {
			if (employee instanceof MedicalDuties) {
				medicalPersonnel.add(employee);
			}
		}
		return medicalPersonnel;
	}
	
	public void showEmployeeInfo() {
		for(Employee employee: employees.values()) {
			System.out.println(employee.getClass() +  " " +
		employee.getName()+ " " + employee.getId());
		}
	}

}
