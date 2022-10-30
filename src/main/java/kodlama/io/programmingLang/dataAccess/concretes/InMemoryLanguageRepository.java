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
		return language;
	}

	@Override
	public void delete(Language language) {
		languages.removeIf(lang -> lang.getId() == language.getId());
		
	}

	@Override
	public Language getById(int id) {
		for (Language language1 : languages) {
			if (language1.getId() == id);
			return language1;
		}
		return null;
	}

	@Override
	public void update(Language language) {
		for (Language language1 : languages) {
			if (language1.getId() == language.getId()) {
				language1.setName(language.getName());
			}
		}
		
	}

}
