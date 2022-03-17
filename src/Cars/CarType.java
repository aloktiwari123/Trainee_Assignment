package Cars;

public enum CarType {
	Hatchback(5),Sedan(8),SUV(10);
	
	private int value;  
	private CarType(int value)
	{  
	this.setValue(value);  
	}
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
