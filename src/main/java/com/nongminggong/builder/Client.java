package com.nongminggong.builder;

/**
 * @author : zxliuyu
 * @date : 2022-12-03 19:11
 */
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		CarBuilder sedanCarBuilder = new SedanCarBuilder();
		CarBuilder truckCarBuilder = new TruckCarBuilder();

		director.buildCar(sedanCarBuilder);
		Car sedanCar = sedanCarBuilder.getCar();
		sedanCar.show();
		System.out.println("==================================");
		director.buildCar(truckCarBuilder);
		Car truckCar = truckCarBuilder.getCar();
		truckCar.show();
	}
}
