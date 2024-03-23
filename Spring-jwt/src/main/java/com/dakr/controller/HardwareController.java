package com.dakr.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.model.Hardware;
import com.dakr.service.HardwareServiceImpl;

@RestController
@RequestMapping("/api")
public class HardwareController {
	
	private HardwareServiceImpl hardwareServiceImpl;
	
	
	@PostMapping("/save")
	public Hardware saveHardware(@RequestBody Hardware hardware) {
		Hardware hardware2=hardwareServiceImpl.saveHardware(hardware);
		return hardware2;
		
	}
	
	@GetMapping("/get")
	public List<Hardware> getAllHardware() {
		
		return hardwareServiceImpl.getAllHardware();
	}

}
