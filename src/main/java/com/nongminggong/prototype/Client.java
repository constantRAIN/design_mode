package com.nongminggong.prototype;

/**
 * @author : zxliuyu
 * @date : 2022-12-03 16:30
 */
public class Client {
	public static void main(String[] args) {
		Person person = new Person("张三", "程序员");
		Person clonePerson = (Person) person.clone();

		System.out.println(person);
		System.out.println(clonePerson);
		clonePerson.setName("李四");
		System.out.println(person);
		System.out.println(clonePerson);
	}
}
