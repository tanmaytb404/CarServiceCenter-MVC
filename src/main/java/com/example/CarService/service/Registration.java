package com.example.CarService.service;

import com.example.CarService.domain.Vehicle;

public interface Registration {

	public Boolean registerCar(String vehicleNo, String vehicleName, String CarDetails, String CarWork);

	public Vehicle getNewCar();
}
