package com.nongminggong.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : zxliuyu
 * @date : 2022-12-10 17:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
	protected String name;

	public void attack() {
		System.out.println("进攻");
	}

	public void defense() {
		System.out.println("防守");
	}
}
