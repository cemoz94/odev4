package kodlama.io.programmingLang.dataAccess.abstracts;

import java.util.List;

import kodlama.io.programmingLang.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	public Language add(Language language);
	public void delete(int id);
	void update(Language language, int id);
	public Language getById(int id);
}
