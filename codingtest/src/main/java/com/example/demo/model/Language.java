package com.example.demo.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Language {

	private Integer languageId;
	private String name;
	private Timestamp lastUpdate;
	
	@Builder
	public Language(String name) {
		this.name = name;
		this.lastUpdate = Timestamp.valueOf(LocalDateTime.now());
	}
	
	@Builder
	public Language(Integer languageId, String name) {
		this.languageId = languageId;
		this.name = name;
		this.lastUpdate = Timestamp.valueOf(LocalDateTime.now());
	}
	
}
