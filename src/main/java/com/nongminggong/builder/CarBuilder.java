package com.nongminggong.builder;

public interface CarBuilder {
	void buildEngine();
	void buildTyre();
	void buildSteeringWheel();
	void buildThrottle();
	void buildBrake();
	Car getCar();
}
