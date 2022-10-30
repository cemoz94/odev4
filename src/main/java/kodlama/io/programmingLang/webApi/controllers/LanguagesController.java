package kodlama.io.programmingLang.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.programmingLang.business.abstracts.LanguageService;
import kodlama.io.programmingLang.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public Language add(@RequestBody Language language) throws Exception {
		return languageService.add(language);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody Language language) throws Exception{
		languageService.delete(language);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody Language language) throws Exception{
		languageService.update(language);
	}
	
	@GetMapping("/getById")
	public Language getById(int id) throws Exception{
		return languageService.getById(id);
	}
	
}
