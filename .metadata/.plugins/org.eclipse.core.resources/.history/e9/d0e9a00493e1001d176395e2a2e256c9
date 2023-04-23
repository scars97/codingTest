package com.example.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Language;

@Mapper
public interface LanguageMapper {

	Language save(Language language);
	
	void update(Language language);
	
	Optional<Language> findById(Integer langId);
	
	List<Language> findAll();
	
	void delete(Integer langId);
}
