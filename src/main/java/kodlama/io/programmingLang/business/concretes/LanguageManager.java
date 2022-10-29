package kodlama.io.programmingLang.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.programmingLang.business.abstracts.LanguageService;
import kodlama.io.programmingLang.dataAccess.abstracts.LanguageRepository;
import kodlama.io.programmingLang.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	private LanguageRepository languageRepository;
	
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public Language add(Language language) throws Exception{
		if (language.getName().isEmpty()) {
			throw new Exception("Programlama dili boş olamaz!");
	}
		if(isNameExist((language.getName()))) throw new Exception("İsim tekrar edemez.");
		if(isIdExist(language.getId())) throw new Exception("ID tekrar edemez!");
		return languageRepository.add(language);
	}

	@Override
	public void delete(int id) throws Exception{
		if(isIdExist(id)) {
			throw new Exception("ID bulunamadı!");
		}
		languageRepository.delete(id);
	}
		

	@Override
	public void update(Language language, int id) throws Exception{
		if(isIdExist(language.getId())) throw new Exception("ID bulunamadı!");
		if(isNameExist(language)) throw new Exception("İsim tekrar edemez!");
		languageRepository.update(language,id);
	}

	@Override
	public Language getById(int id) throws Exception{
		if (isIdExist(id)) throw new Exception("ID bulunamadı!");
		return languageRepository.getById(id);
	}

	private boolean isIdExist(int id) {
		 for (Language language1 : getAll()){
			 if(language1.getId()==id) {
				 return true;
			 }
		 }
		return false;
	}

	private boolean isNameExist(Language language) {
		for (Language language1 : getAll()) {
				if(language1.getName().equalsIgnoreCase(language1.getName()));{
					return true;
				}
			}
		return false;
	}
	private boolean isNameExist(String string) {
		for (Language language1 : getAll()) {
				if(language1.getName().equalsIgnoreCase(language1.getName()));{
					return true;
				}
			}
		return false;
	}
	
}
