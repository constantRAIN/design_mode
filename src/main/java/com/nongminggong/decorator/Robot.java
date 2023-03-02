package com.nongminggong.decorator;

import lombok.Data;

/**
 * @author : zxliuyu
 * @date : 2023-03-02 19:30
 */
@Data
public class Robot extends Changer {

	@Override
	public void move() {
		System.out.println("=================");
		super.move();
		say();
	}

	public void say() {
		System.out.println("机器人会说话");
	}
}
