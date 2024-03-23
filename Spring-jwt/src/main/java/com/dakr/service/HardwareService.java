package com.dakr.service;

import java.util.List;

import com.dakr.model.Hardware;

public interface HardwareService {
	
	
	public Hardware saveHardware(Hardware hardware);
	
	public List<Hardware> getAllHardware();
	
	
}
