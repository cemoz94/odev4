package kodlama.io.programmingLang.business.abstracts;

import java.util.List;

import kodlama.io.programmingLang.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	public Language add(Language language) throws Exception;
	public void update(Language language) throws Exception;
	public Language getById(int id) throws Exception;
	void delete(Language language) throws Exception;

}
