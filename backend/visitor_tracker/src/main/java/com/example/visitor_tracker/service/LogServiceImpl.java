package com.example.visitor_tracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.visitor_tracker.dao.LogDao;
import com.example.visitor_tracker.vo.VisitorLogVo;

@Service
public class LogServiceImpl implements LogService {
	@Autowired
	LogDao logDao;
	
	public List<VisitorLogVo> selectListVisitorLog() {
		return logDao.selectListVisitorLog();
	}
}
