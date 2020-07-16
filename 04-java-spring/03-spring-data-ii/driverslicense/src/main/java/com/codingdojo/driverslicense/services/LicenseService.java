package com.codingdojo.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.driverslicense.models.License;
import com.codingdojo.driverslicense.repositories.LicenseRepository;

@Service
public class LicenseService {
	// static variable
	private final LicenseRepository licenseRepository;
	
	// constructor
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	// method functions
	public String generateLicenseNumber() {
		License license = licenseRepository.findTopByOrderByNumberDesc();
		if(license == null) {
			return "1";
		}
		int indexNumber = Integer.parseInt(license.getNumberString());
		indexNumber++;
		return (String.valueOf(indexNumber));
	}
	
	public License createLicense(License license) {
		license.setNumber(this.generateLicenseNumber());
		return licenseRepository.save(license);
	}
	
	public List<License> allLicense() {
		return licenseRepository.findAll();
	}
}
