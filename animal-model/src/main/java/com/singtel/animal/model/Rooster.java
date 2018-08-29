package com.singtel.animal.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

public class Rooster extends Chicken {

	private static final long serialVersionUID = 1L;

	static final String DEFAULT_LANGUAGE = "English";

	static final Locale DEFAULT_LOCALE = Arrays.asList(Locale.getAvailableLocales())
			.stream()
			.filter(l -> l.getDisplayName().equals(DEFAULT_LANGUAGE))
			.findFirst()
			.get();

	static Map<Locale, String> ROOSTER_VOICES = new HashMap<Locale, String>();

	static {

		List<Locale> locales = Arrays.asList(Locale.getAvailableLocales());

		BiConsumer<String, String> addToMap = (localeDisplayName, roosterVoice) -> {
			Locale locale = locales.stream().filter(l -> l.getDisplayName().equals(localeDisplayName)).findFirst().get();
			ROOSTER_VOICES.put(locale, roosterVoice);
		};

		addToMap.accept(DEFAULT_LANGUAGE, "Cock-a-doodle-doo");
		addToMap.accept("Danish", "kykyliky");
		addToMap.accept("Dutch", "kukeleku");
		addToMap.accept("Finnish", "kukko kiekuu");
		addToMap.accept("French", "cocorico");
		addToMap.accept("German", "kikeriki");
		addToMap.accept("Greek", "kikiriki");
		addToMap.accept("Hebrew", "coo-koo-ri-koo");
		addToMap.accept("Hungarian", "kukuriku");
		addToMap.accept("Italian", "chicchirichi");
		addToMap.accept("Japanese", "ko-ke-kok-ko-o");
		addToMap.accept("Portuguese", "cucurucu");
		addToMap.accept("Russian", "kukareku");
		addToMap.accept("Swedish", "kuckeliku");
		addToMap.accept("Turkish", "kuk-kurri-kuuu");

		// Urdu is not listed in Locale.getAvailableLocales()
		// i.e. use Builder to create one
		Locale urduLocale = new Locale.Builder().setLanguage("ur").build();
		ROOSTER_VOICES.put(urduLocale, "kuklooku");

	}

	Locale locale;

	public Rooster() {
		this.locale = DEFAULT_LOCALE;
	}

	public Rooster(Locale locale) {
		this.locale = locale;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	@Override
	public String sing() {
		return ROOSTER_VOICES.get(this.locale);
	}

}
