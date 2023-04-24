package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
	public void create(@RequestBody Language language) {
		languageService.save(language);
	}
	
	
	//Read
	@GetMapping("all")
	public List<Language> findAll(){
		return languageService.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Language> findOne(@PathVariable("id") Integer languageId) {
		return languageService.findById(languageId);
	}
	
	//Update
	@PatchMapping("{id}")
	public void update(@PathVariable("id") Integer languageId,
			@RequestBody Language language) {
		languageService.update(languageId, language);
	}

	//Delete
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer languageId) {
		languageService.delete(languageId);
	}
	
}
