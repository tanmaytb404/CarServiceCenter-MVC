package com.example.CarService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.CarService.domain.Car;
import com.example.CarService.service.Registration;

@Controller
public class RegisterController {

	@RequestMapping("/register")
	public String getRegistrationPage(Model m) {
		return "carregister";
	}

	@Autowired
	@Qualifier("carRegistrationService")
	Registration registration;

	@RequestMapping("/done")
	public String getResponsePage(@ModelAttribute Car car) {
		if (car.getRegisterationNumber() == null || car.getRegisterationNumber().trim().isEmpty()
				|| car.getCarName() == null || car.getCarName().trim().isEmpty()) {
			return "carregister";
		}
		boolean result = registration.registerCar(car.getRegisterationNumber(), car.getCarName(), car.getCarDetails(),
				car.getCarWork());
		if (result)
			return "success";
		else
			return "carregister";
	}
}
