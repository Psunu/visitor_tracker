package com.example.visitor_tracker.service;

import java.util.List;

import com.example.visitor_tracker.vo.VisitorLogVo;

public interface LogService {
	public List<VisitorLogVo> selectListVisitorLog();
}
