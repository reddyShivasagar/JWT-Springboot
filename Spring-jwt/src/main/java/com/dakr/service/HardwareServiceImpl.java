package com.dakr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.hardwrerepo.HardwareRepo;
import com.dakr.model.Hardware;

@Service
public class HardwareServiceImpl implements HardwareService {

	@Autowired
	private HardwareRepo hardwareRepo;
	
	@Override
	public Hardware saveHardware(Hardware hardware) {
		Hardware hardware2=new Hardware();
		return hardware2;
	}

	@Override
	public List<Hardware> getAllHardware() {
		List<Hardware> hardwares=hardwareRepo.findAll();
		return hardwares;
	}

	
}
