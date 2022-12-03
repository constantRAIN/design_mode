package com.nongminggong.builder;

public class TruckCarBuilder implements CarBuilder {
	private Car car = new Car();
	@Override
	public void buildEngine() {
		car.add("卡车发动机");
	}

	@Override
	public void buildTyre() {
		car.add("卡车轮胎");
	}

	@Override
	public void buildSteeringWheel() {
		car.add("卡车方向盘");
	}

	@Override
	public void buildThrottle() {
		car.add("卡车油门");
	}

	@Override
	public void buildBrake() {
		car.add("卡车刹车");
	}

	@Override
	public Car getCar() {
		return car;
	}
}
