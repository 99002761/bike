package com.bikeapp.bean;

public class BikeLog {
	private String vin;
	private String engine_status;
	private Double latitude;
	private Double longitude;
    private String Name;
	private Long odometer = 250L;
	private String timestamp;
	//private boolean flag = false;
	private Integer engine_rpm;
	private Integer speed;
	private Integer Fuel_Capacity;
	private Integer Fuel_Consumption;
	//Engine_type
    private Double Engine_load;
    private Integer Engine_temp;
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getEngine_status() {
		return engine_status;
	}
	public void setEngine_status(String engine_status) {
		this.engine_status = engine_status;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getOdometer() {
		return odometer;
	}
	public void setOdometer(Long odometer) {
		this.odometer = odometer;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getEngine_rpm() {
		return engine_rpm;
	}
	public void setEngine_rpm(Integer engine_rpm) {
		this.engine_rpm = engine_rpm;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	public Integer getFuel_Capacity() {
		return Fuel_Capacity;
	}
	public void setFuel_Capacity(Integer fuel_Capacity) {
		Fuel_Capacity = fuel_Capacity;
	}
	public Integer getFuel_Consumption() {
		return Fuel_Consumption;
	}
	public void setFuel_Consumption(Integer fuel_Consumption) {
		Fuel_Consumption = fuel_Consumption;
	}
	public Double getEngine_load() {
		return Engine_load;
	}
	public void setEngine_load(Double engine_load) {
		Engine_load = engine_load;
	}
	public Integer getEngine_temp() {
		return Engine_temp;
	}
	public void setEngine_temp(Integer engine_temp) {
		Engine_temp = engine_temp;
	}
	@Override
	public String toString() {
		return "Bike [vin=" + vin + ", engine_status=" + engine_status + ", latitude=" + latitude + ", longitude="
				+ longitude + ", Name=" + Name + ", odometer=" + odometer + ", timestamp=" + timestamp + ", engine_rpm="
				+ engine_rpm + ", speed=" + speed + ", Fuel_Capacity=" + Fuel_Capacity + ", Fuel_Consumption="
				+ Fuel_Consumption + ", Engine_load=" + Engine_load + ", Engine_temp=" + Engine_temp + "]";
	}
    


}
