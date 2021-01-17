package com.example.visitor_tracker.vo;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class VisitorLogVo {
	@JsonProperty
	private String visitorName;
	@JsonProperty
	private LocalDateTime timeStamp;
}
