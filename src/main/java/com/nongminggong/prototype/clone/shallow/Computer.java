package com.nongminggong.prototype.clone.shallow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computer implements Cloneable {
	/**
	 * 品牌
	 */
	private String color;
	/**
	 * 与颜色
	 */
	private String brand;

	@Override
	protected Object clone() {
		Computer computer = null;
		try {
			computer = (Computer) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return computer;
	}
}