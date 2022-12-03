package com.nongminggong.builder;

import java.util.ArrayList;
import java.util.List;

public class Car {
	private List<String> carParts = new ArrayList<>();
	public void add(String carPart) {
		carParts.add(carPart);
	}
	public void show() {
		System.out.println("车辆开始生成");
		for (String carPart : carParts) {
			System.out.println("车辆开始组装" + carPart);
		}
		System.out.println("车辆构建完成");
	}
}
