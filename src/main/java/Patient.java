
public class Patient {

	private static final int DEFAULT_HEALTH_LEVEL = 5;
	private int healthLevel;

	public int getHealthLevel() {
		return healthLevel;
	}

	// default no args constructor
	public Patient() {
		this.healthLevel = DEFAULT_HEALTH_LEVEL;
	}

	// customized constructor thru method overloading
	public Patient(int healthLevel) {
		this.healthLevel = healthLevel;
	}

	public void increaseHealthLevel(int amount) {
		healthLevel += amount;
	}

}
