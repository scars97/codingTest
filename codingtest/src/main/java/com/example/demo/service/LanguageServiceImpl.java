package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Language;
import com.example.demo.repository.LanguageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LanguageServiceImpl implements LanguageService{

	private final LanguageRepository languageRepository;
	
	@Override
	public Language save(Language language) {
		return languageRepository.save(language);
	}

	@Override
	public void update(Integer languageId, Language language) {
		languageRepository.update(languageId, language);
	 
	}

	@Override
	public Optional<Language> findById(Integer languageId) {
		return languageRepository.findById(languageId);
	}

	@Override
	public List<Language> findAll() {
		return languageRepository.findAll();
	}

	@Override
	public void delete(Integer languageId) {
		languageRepository.delete(languageId);
	}
}
