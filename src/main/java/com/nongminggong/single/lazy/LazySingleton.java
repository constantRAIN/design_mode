package com.nongminggong.single.lazy;

/**
 * @author : zxliuyu
 * @date : 2022-12-03 15:35
 */
public class LazySingleton {
	private static LazySingleton instance;
	private LazySingleton() {
	}
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}
