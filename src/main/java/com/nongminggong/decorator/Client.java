package com.nongminggong.decorator;

/**
 * @author : zxliuyu
 * @date : 2023-03-02 19:35
 */
public class Client {

	public static void main(String[] args) {
		Transform car = new Car();
		car.move();

		Changer changer = new Changer();
		changer.setTransform(car);
		changer.move();

		Robot robot = new Robot();
		robot.setTransform(changer);
		robot.move();

		Airplane airplane = new Airplane();
		airplane.setTransform(changer);
		airplane.move();
	}
}
