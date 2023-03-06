package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.Emp;

// com.example.demo.dao.A01_Dao
@Mapper
public interface A01_Dao {
	public List<Emp> getEmpList();
}
