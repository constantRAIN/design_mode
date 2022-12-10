package com.nongminggong.adapter;

/**
 * @author : zxliuyu
 * @date : 2022-12-10 17:36
 */
public class Client {

	public static void main(String[] args) {
		Player forward = new ForwardPlayer("巴蒂尔");
		forward.attack();
		forward.defense();

		Player center = new CenterPlayer("奥尼尔");
		center.attack();
		center.defense();

		Player translator = new TranslatorPlayer(new ForeignCenterPlayer("姚明"));
		translator.attack();
		translator.defense();
	}
}
