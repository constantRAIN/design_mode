package com.nongminggong.proxy;

public class Proxy implements Teacher {

	private EnglishTeacher englishTeacher;

	public Proxy() {
		this.englishTeacher = new EnglishTeacher();
	}

	@Override
	public void teach() {
		englishTeacher.teach();
	}
}
