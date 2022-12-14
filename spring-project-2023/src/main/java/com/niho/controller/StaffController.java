package com.niho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niho.model.StaffModel;
import com.niho.service.StaffService;

@RestController
public class StaffController {

	@Autowired
	StaffModel staffModel;

	@Autowired
	StaffService staffService;

	//TODO: post a model data
	@RequestMapping("/addStaff")
	public String hello() {
		staffModel = new StaffModel();
		staffModel.setPassword("1234");
		staffModel.setEmail("email@email.com");
		staffModel.setPhone("22334455");
		staffModel.setPosition("Manager");
		staffService.addStaff(staffModel);
		return "New Staff added";
	}

}
