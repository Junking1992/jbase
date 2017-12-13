package com.jk.jbase.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import com.jk.jbase.vo.TestVo;

@Mapper
public interface TestMapper {
	
	@Insert("INSERT INTO test(name,age) VALUES (#{name}, #{age})")
	int insertVo(TestVo vo);
}
