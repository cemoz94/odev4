package kodlama.io.programmingLang.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping("/add")
	public Language add(Language language) throws Exception {
		return languageService.add(language);
	}
	
	@GetMapping("/delete")
	public void delete(int id) throws Exception{
		languageService.delete(id);
	}
	
	@GetMapping("/update")
	public void update(Language language, int id) throws Exception{
		languageService.update(language, id);
	}
	
	@GetMapping("/getById")
	public Language getById(int id) throws Exception{
		return languageService.getById(id);
	}
	
}
