package com.nongminggong.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : zxliuyu
 * @date : 2022-12-03 16:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Cloneable {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 职业
	 */
	private String occupation;
	@Override
	protected Object clone() {
		Person person= null;
		try {
			person = (Person)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return person;
	}
}
