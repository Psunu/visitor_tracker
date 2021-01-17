package com.example.visitor_tracker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.visitor_tracker.service.LogService;
import com.example.visitor_tracker.vo.VisitorLogVo;

@RestController
@RequestMapping("/log")
public class LogController {
	@Autowired
	LogService logService;
	
	private static Logger logger = LoggerFactory.getLogger(LogController.class);
	
	@RequestMapping("visitors")
	public List<VisitorLogVo> selectListVisitorLog() {
		logger.info("connected");
		return logService.selectListVisitorLog();
	}
}
