package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Language;
import com.example.demo.repository.LanguageRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class LanguageServiceImpl implements LanguageService{

	private final LanguageRepository languageRepository;
	
	@Override
	public void save(Language language) {
		language = Language.builder()
				.name(language.getName())
				.build();
		languageRepository.save(language);
	}

	@Override
	public void update(Integer languageId, Language language) {
		language = Language.builder()
					.languageId(languageId)
					.name(language.getName())
					.build();
		languageRepository.update(language);
	 
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
