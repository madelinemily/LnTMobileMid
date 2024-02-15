import java.util.Scanner;

public abstract class Vehicle {
	protected String type;
	protected String brand;
	protected String name;
	protected String licenseNumber;
	protected Integer topSpeed;
	protected Integer gasCap;
	protected Integer wheel;
	protected String vehicleType;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String type, String brand, String name, String licenseNumber, Integer topSpeed, Integer gasCap, Integer wheel, String vehicleType, Integer enternSystem) {
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.topSpeed = topSpeed;
		this.gasCap = gasCap;
		this.wheel = wheel;
		this.vehicleType = vehicleType;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}
	public Integer getGasCap() {
		return gasCap;
	}
	public void setGasCap(Integer gasCap) {
		this.gasCap = gasCap;
	}
	public Integer getWheel() {
		return wheel;
	}
	public void setWheel(Integer wheel) {
		this.wheel = wheel;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public abstract void inputData(Scanner scanner);
	
	public abstract void viewData();
	
	public abstract void viewSingleData();
	
}
