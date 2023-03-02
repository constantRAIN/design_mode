package com.nongminggong.decorator;

/**
 * @author : zxliuyu
 * @date : 2023-03-02 19:30
 */
public class Car implements Transform {

	@Override
	public void move() {
		System.out.println("汽车会跑");
	}
}
