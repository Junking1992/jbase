package com.jk.jbase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jk.jbase.dao.TestMapper;
import com.jk.jbase.vo.TestVo;

@Service
public class TestServer {
	
	@Autowired
	public TestMapper testMapper;
	
	@Transactional
	public int insertVo(String name, int age){
		TestVo vo = new TestVo();
		vo.setName(name);
		vo.setAge(age);
		testMapper.insertVo(vo);
		System.out.println(1/0);
		testMapper.insertVo(vo);
		return 1;
	}
}
