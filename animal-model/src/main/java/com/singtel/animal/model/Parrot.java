package com.singtel.animal.model;

public class Parrot extends Bird {

	private static final long serialVersionUID = 1L;

	private String voiceToMimic;

	public Parrot(String voiceToMimic) {
		super();
		this.voiceToMimic = voiceToMimic;
	}

	public String getVoiceToMimic() {
		return voiceToMimic;
	}

	public void setVoiceToMimic(String voiceToMimic) {
		this.voiceToMimic = voiceToMimic;
	}

	@Override
	public String sing() {
		return this.getVoiceToMimic();
	}

}
