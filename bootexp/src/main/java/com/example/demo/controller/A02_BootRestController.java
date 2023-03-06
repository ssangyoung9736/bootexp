package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.A01_Service;
import com.example.demo.vo.Emp;

@RestController
public class A02_BootRestController {

	@Autowired(required=false)
	private A01_Service service;
	
	// 데이터 호출 
	// http://localhost:7050/empRestData
	@GetMapping("/empRestData")
	public List<Emp> getEmpList(){
		return service.getEmpList();
	}
}
