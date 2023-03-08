package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.A01_Service;

@Controller
public class A01_BootStartController {
	
	@Autowired(required=false)
	private A01_Service service;
	
	// 데이터 호출 
	// http://localhost:7050/empData
	// 웹화면에서는 보이지 않고, ajax로 호출할 때, 데이터를
	// 전송 해준다.
	@GetMapping("/empData")
	public String list(Model d) {
		
		d.addAttribute("empList", 
				service.getEmpList());
		return "jsonView";
	}
	// http://localhost:7050/empList
	// 초기화면 로딩 처리
	@GetMapping("/empList")
	public String empList() {
		return "a03_empList.html";
	}
	
	
	// http://localhost:5050/start
	@GetMapping("/start")
	public String list() {
		return "a01_startBoot.html"; 
	}
	// http://localhost:5050/start2
	@GetMapping("/start2")
	public String start2() {
		return "a02_start2Boot.html";
	}
	
	
	
}
