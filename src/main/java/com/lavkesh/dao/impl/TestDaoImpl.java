package com.lavkesh.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.lavkesh.dao.TestDao;

@Repository("testDao")
public class TestDaoImpl implements TestDao {
	
	public static Logger logger = LoggerFactory.getLogger(TestDaoImpl.class);

	@Override
	@Cacheable(value="testCache", key="#root.methodName")
	public List<String> getLov(){
		logger.debug("getLov() methode start.");
		List<String> strList = new ArrayList<String>();
		strList.add("India");
		strList.add("China");
		logger.debug("getLov() methode end.");
		return strList;
	}

}