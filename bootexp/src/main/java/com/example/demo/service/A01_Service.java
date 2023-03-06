package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.A01_Dao;
import com.example.demo.vo.Emp;

@Service
public class A01_Service {
	@Autowired(required=false)
	private A01_Dao dao;
	public List<Emp> getEmpList(){
		return dao.getEmpList();
	}
	
	
	
}
