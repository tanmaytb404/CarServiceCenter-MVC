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
	public Boolean saveVehicleDetails() {
		int id = carDAO.save(this);
		setCarId(id);
		return id > 0;
	}

	@Override
	public void createVehicle(String RegistrationNumber, String CarName, String CarDetails, String CarWork) {
		this.setRegisterationNumber(RegistrationNumber);
		this.setCarName(CarName);
		this.setCarDetails(CarDetails);
		this.setCarWork(CarWork);
	}

}
