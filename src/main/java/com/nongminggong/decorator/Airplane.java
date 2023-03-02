package com.nongminggong.decorator;

import lombok.Data;

/**
 * @author : zxliuyu
 * @date : 2023-03-02 19:30
 */
@Data
public class Airplane extends Changer {

	@Override
	public void move() {
		System.out.println("=================");
		super.move();
		fly();
	}

	public void fly() {
		System.out.println("飞机会飞");
	}
}
