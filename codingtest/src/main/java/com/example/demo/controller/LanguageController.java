package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Delete;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Language;
import com.example.demo.service.LanguageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class LanguageController {

	private final LanguageService languageService;
	
	//Create
	@PostMapping
	public Language createLanguage(@RequestBody Language language) {
		language = Language.builder()
					.name(language.getName())
					.build();
		languageService.save(language);
		return language;
	}
	
	
	//Read
	@GetMapping("all")
	public List<Language> findAllLanguage(){
		return languageService.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Language> findOneLanguage(@PathVariable("id") Integer languageId) {
		return languageService.findById(languageId);
	}
	
	//Update
	@PutMapping("{id}")
	public void updateLanguage(@PathVariable("id") Integer languageId,
			@RequestBody Language language) {
		language = Language.builder()
				.name(language.getName())
				.build();
		languageService.update(languageId, language);
	}

	//Delete
	@DeleteMapping("{id}")
	public void deleteLanguage(@PathVariable("id") Integer languageId) {
		languageService.delete(languageId);
	}
	
}
