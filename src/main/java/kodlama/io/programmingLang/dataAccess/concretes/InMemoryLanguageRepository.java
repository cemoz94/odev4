package kodlama.io.programmingLang.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.programmingLang.dataAccess.abstracts.LanguageRepository;
import kodlama.io.programmingLang.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "Python"));
		languages.add(new Language(4, "Swift"));
		languages.add(new Language(5, "Kotlin"));
	}

	@Override
	public List<Language> getAll() {
	
		return languages;
	}

	@Override
	public Language add(Language language) {
		languages.add(language);
		return getById(language.getId());
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
		
	}

	@Override
	public Language getById(int id) {
		languages.get(id);
		return null;
	}

	@Override
	public void update(Language language, int id) {
		Language language1 = getById(id);
		language1.setName(language.getName());
		
	}

}
