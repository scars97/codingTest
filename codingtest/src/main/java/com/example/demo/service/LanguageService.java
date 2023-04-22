package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Language;

public interface LanguageService {

	Language save(Language language);

	void update(Integer languageId, Language language);

	Optional<Language> findById(Integer langId);

	List<Language> findAll();
	
	void delete(Integer langId);
}
