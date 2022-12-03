package com.nongminggong.single.hungry;

/**
 * @author : zxliuyu
 * @date : 2022-12-03 15:32
 */
public class HungrySingleton {
	private static final HungrySingleton instance = new HungrySingleton();

	private HungrySingleton() {
	}

	public static HungrySingleton getInstance(){
		return instance;
	}
}
