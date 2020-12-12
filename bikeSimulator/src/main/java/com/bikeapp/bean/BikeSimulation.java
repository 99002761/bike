package com.bikeapp.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BikeSimulation {
	private Integer vin;
	private Integer speed;
	private Integer heading;
	private Double latitude;
	private Double longitude;
	private Long odometer = 250L;
	private String timestamp;

	
	/**
//	 * Queue data structure with fixed size to hold the status-logs of vehicle simulation.
//	 */
	@JsonIgnore
	 public   LinkedBlockingQueue<String> vehicleSimulationLog = new LinkedBlockingQueue<>(40);

	@JsonIgnore
	 List<String> dtc_list =new ArrayList<>();


}
