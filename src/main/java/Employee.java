
public abstract class Employee {

	protected String id;
	protected String name;

	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}

	public Employee(String id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public abstract String getStatus();


}
