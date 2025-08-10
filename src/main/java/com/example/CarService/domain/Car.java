package com.example.CarService.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.CarService.repository.CarDAO;

import lombok.Data;

@Data
@Component
public class Car implements Vehicle {

	@Autowired
	CarDAO carDAO;

	String RegisterationNumber;
	String CarName;
	String CarDetails;
	String CarWork;
	Integer CarId;

	@Override
	public int saveVehicleDetails() {

		if (RegisterationNumber != null && CarName != null && CarDetails != null) {
			int carId = carDAO.save(this);
			System.out.println("new car added" + this.CarName + "  " + this.RegisterationNumber + this.CarDetails);
			return carId;
		} else {
			return -1;
		}

	}

	@Override
	public void createVehicle(String RegistrationNumber, String CarName, String CarDetails, String CarWork) {
		this.setRegisterationNumber(RegistrationNumber);
		this.setCarName(CarName);
		this.setCarDetails(CarDetails);
		this.setCarWork(CarWork);
	}

}
