package com.nongminggong.facade;

/**
 * @author : zxliuyu
 * @date : 2023-03-02 23:57
 */
public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.buy();
		System.out.println("=================");
		facade.sell();
	}
}
