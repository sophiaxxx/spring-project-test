package com.niho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niho.model.StaffModel;
import com.niho.repository.StaffRepository;

@Service
public class StaffService {

	@Autowired
	StaffRepository staffRepository;

	public void addStaff(StaffModel staffModel) {
		staffRepository.addStaff(staffModel);
	}

}
