package com.nongminggong.prototype.clone.deep;

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
public class Person implements Cloneable {
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
		Person person = null;
		try {
			person = (Person) super.clone();
			// 将引用类型 也复制一份。
			person.computer = (Computer) person.getComputer().clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return person;
	}
}
