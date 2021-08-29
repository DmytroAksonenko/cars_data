package com.aksonenko.cars_data.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aksonenko.cars_data.entity.Car;
import com.aksonenko.cars_data.service.CarService;

@Controller
public class MainController {

	@Autowired
	private CarService carService;

	@RequestMapping("/")
	public String showHome() {

		return "home";
	}

	@RequestMapping("/cars")
	public String showAllCars(Model model) {

		List<Car> allCars = carService.getAllCars();
		model.addAttribute("allCars", allCars);

		return "all-cars";
	}

	@RequestMapping("/data")
	public String data() {

		return "car-db";
	}

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String importData(@RequestParam("file") File file, Model model) {

		model.addAttribute("file", file);
		String path = file.getAbsolutePath();
		Car car = new Car();

		try {

			BufferedReader lineReader = new BufferedReader(new FileReader(path, StandardCharsets.UTF_8));
			String lineText = null;

			lineReader.readLine();

			while ((lineText = lineReader.readLine()) != null) {

				String lineReplaced = lineText.replaceAll("\"", "");
				String[] data = lineReplaced.split(";");
				
				car.setPerson(data[0]);
				car.setRegAddrKoatuu(Long.valueOf(data[1]));
				car.setOperCode(Integer.valueOf(data[2]));
				car.setOperName((data[3]));
				car.setdReg((data[4]));
				car.setDepCode(Integer.parseInt(data[5]));
				car.setDep((data[6]));
				car.setBrand((data[7]));
				car.setModel((data[8]));
				car.setVin((data[9]));
				car.setMakeYear(Integer.parseInt(data[10]));
				car.setColor((data[11]));
				car.setKind((data[12]));
				car.setBody((data[13]));
				car.setPurpose((data[14]));
				car.setFuel((data[15]));
				car.setCapacity(Integer.parseInt(data[16]));
				car.setOwnWeight(Integer.parseInt(data[17]));
				car.setTotalWeight(Integer.parseInt(data[18]));
				car.setnRegNew((data[19]));

				carService.saveCar(car);

			}

			lineReader.close();

		} catch (Exception e) {

		}

		return "car-db";
	}

}
