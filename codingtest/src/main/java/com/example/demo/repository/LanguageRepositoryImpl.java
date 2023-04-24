package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.mapper.LanguageMapper;
import com.example.demo.model.Language;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Repository
@RequiredArgsConstructor
public class LanguageRepositoryImpl implements LanguageRepository{

	private final LanguageMapper mapper;
	 
	@Override
	public void save(Language language) {
		mapper.save(language); 
	}
	
	@Override
	public void update(Language language) {
		mapper.update(language);
	}
	
	@Override
	public Optional<Language> findById(Integer languageId) {
		return mapper.findById(languageId);
	}

	@Override
	public List<Language> findAll() {
		return mapper.findAll();
	}

	@Override
	public void delete(Integer languageId) {
		mapper.delete(languageId);
	}
}
