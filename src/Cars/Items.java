package Cars;

public class Items {
	private String carName;
	private CarType carType;
	private int carcp;
	private Insurance insuranceType;
	public int getCarcp() {
		return carcp;
	}
	public void setCarcp(int carcp) {
		this.carcp = carcp;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public CarType getCarType() {
		return carType;
	}
	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	public Insurance getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(Insurance insuranceType) {
		this.insuranceType = insuranceType;
	}
}
