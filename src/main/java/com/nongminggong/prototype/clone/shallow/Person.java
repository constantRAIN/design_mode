package com.nongminggong.prototype.clone.shallow;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : zxliuyu
 * @date : 2022-12-03 20:38
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 职业
	 */
	private String occupation;
	private Computer computer;
	@Override
	protected Object clone() {
		com.nongminggong.prototype.Person person= null;
		try {
			person = (com.nongminggong.prototype.Person)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return person;
	}
}
