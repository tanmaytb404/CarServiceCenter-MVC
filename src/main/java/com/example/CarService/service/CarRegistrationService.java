package com.example.CarService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CarService.domain.Vehicle;

@Service
public class CarRegistrationService implements Registration {

	@Autowired
	Vehicle car;

	@Override
	public Boolean registerCar(String vehicleNo, String vehicleName, String CarDetails, String CarWork) {
		car.createVehicle(vehicleNo, vehicleName, CarDetails, CarWork);
		return car.saveVehicleDetails();
	}

	@Override
	public Vehicle getNewCar() {
		return this.car;
	}

}
