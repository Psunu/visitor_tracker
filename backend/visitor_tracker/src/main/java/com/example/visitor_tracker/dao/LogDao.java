package com.example.visitor_tracker.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.visitor_tracker.vo.VisitorLogVo;

@Mapper
public interface LogDao {
	public List<VisitorLogVo> selectListVisitorLog();
}
