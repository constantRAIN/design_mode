package com.nongminggong.builder;

public class SedanCarBuilder implements CarBuilder {
	private Car car = new Car();
	@Override
	public void buildEngine() {
		car.add("轿车发动机");
	}

	@Override
	public void buildTyre() {
		car.add("轿车轮胎");
	}

	@Override
	public void buildSteeringWheel() {
		car.add("轿车方向盘");
	}

	@Override
	public void buildThrottle() {
		car.add("轿车油门");
	}

	@Override
	public void buildBrake() {
		car.add("轿车刹车");
	}

	@Override
	public Car getCar() {
		return car;
	}
}
