package com.nongminggong.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : zxliuyu
 * @date : 2022-12-10 17:30
 */
@Data
@NoArgsConstructor
public class ForeignCenterPlayer extends Player {
	public ForeignCenterPlayer(String name) {
		super(name);
	}

	public void attack() {
		System.out.println(String.format("外籍中锋【%s】进攻", this.name));
	}

	public void defense() {
		System.out.println(String.format("外籍中锋【%s】防守", this.name));
	}
}
