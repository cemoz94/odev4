package kodlama.io.programmingLang.dataAccess.abstracts;

import java.util.List;

import kodlama.io.programmingLang.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	public Language add(Language language);
	public void delete(Language language);
	void update(Language language);
	public Language getById(int id);
}
