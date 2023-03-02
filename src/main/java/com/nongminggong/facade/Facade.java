package com.nongminggong.facade;

/**
 * @author : zxliuyu
 * @date : 2023-03-02 23:58
 */
public class Facade {
	private Bond bond = new Bond();
	private NationalDebt nationalDebt = new NationalDebt();
	private Stock stock = new Stock();

	public void buy(){
		bond.buy();
		nationalDebt.buy();
		stock.buy();;
	}

	public void sell(){
		bond.sell();
		nationalDebt.sell();
		stock.sell();
	}
}
