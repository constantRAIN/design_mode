package com.nongminggong.builder;

/**
 * @author : zxliuyu
 * @date : 2022-12-03 18:56
 */
public class Director {

	public void buildCar(CarBuilder carBuilder) {
		carBuilder.buildEngine();
		carBuilder.buildTyre();
		carBuilder.buildSteeringWheel();
		carBuilder.buildThrottle();
		carBuilder.buildBrake();
	}
}
